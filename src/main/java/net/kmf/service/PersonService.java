package net.kmf.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.io.JsonStringEncoder;
import net.kmf.entity.Person;
import net.kmf.persistance.PersonDao;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.glassfish.jersey.uri.UriTemplate;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Path("/person")
public class PersonService {
    private final Logger log = Logger.getLogger(this.getClass());

    @GET
    @Produces("application/json")
    public Response getMessage(@Context UriInfo uriInfo) {

        Response r = null;
        log.debug(uriInfo.getPath());

        r = getPersonResponse(ResponseType.JSON);


        //String json = "{\"response\": \"This is the people service.\"}";
//        ObjectMapper mapper = new ObjectMapper();
//        try {
//            String json = mapper.writeValueAsString(result);
//            r = Response.status(200).entity(json).build();
//        } catch (JsonProcessingException jpe) {
//            log.error("encountered processing error in PersonService.getMessage", jpe);
//            r = Response.status(500).entity("{'error':'Invalid JSON request submitted.'}").build();
//        } catch (Exception e) {
//            r = Response.status(500).entity("{'error':'We dun goofed. Sorry.'}").build();
//        }

        return r;
    }

    /**
     *  Generate result set.
     * shamelessly stolen from the stream response
     * from https://stackoverflow.com/questions/8378752/pick-multiple-random-elements-from-a-list-in-java
     * @param people
     * @return random triplet of people
     */
    public List<Person> getRandomTriplet(List<Person> people) {
        Random random = new Random();
        List<Person> result = IntStream.generate(() -> random.nextInt(people.size()))
                .distinct()
                .limit(3)
                .mapToObj(people::get)
                .collect(Collectors.toList());
        return result;
    }

    private Response getPersonResponse(ResponseType type) {
        PersonDao dao = new PersonDao();
        List<Person> people = dao.getAllPeoples();
        ObjectMapper mapper = new ObjectMapper();
        Response r;
        try {
            List<Person> result = getRandomTriplet(people);
            String json = mapper.writeValueAsString(result);
            r = Response.status(200).entity(json).build();
        } catch (JsonProcessingException jpe) {
            log.error("encountered processing error in PersonService.getMessage", jpe);
            r = Response.status(500).entity("{'error':'Invalid JSON request submitted.'}").build();
        } catch (Exception e) {
            r = Response.status(500).entity("{'error':'We dun goofed. Sorry.'}").build();
        }
        return r;
    }

    @GET
    @Path("/story")
    @Produces("application/json")
    public Response getPersonStoryResponse() {
        System.out.println("in getpersonstoryresponse");
        PersonDao dao = new PersonDao();
        List<Person> people = dao.getAllPeoples();
        ObjectMapper mapper = new ObjectMapper();
        Response r;
        try {
            StoryGenerator gen = new StoryGenerator();
            String result = gen.getStoryForTriplet(getRandomTriplet(people));
            JsonStringEncoder enc = JsonStringEncoder.getInstance();
            String json = new String(enc.quoteAsString("{'story':'" + result + "'}"));
            r = Response.status(200).entity(json).build();
//        } catch (JsonProcessingException jpe) {
//            log.error("encountered processing error in PersonService.getMessage", jpe);
//            r = Response.status(500).entity("{'error':'Invalid JSON request submitted.'}").build();
        } catch (Exception e) {
            r = Response.status(500).entity("{'error':'We dun goofed. Sorry.'}").build();
        }
        return r;
    }

    public enum ResponseType {
        JSON,
        XML
    }
}
