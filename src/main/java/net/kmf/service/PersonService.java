package net.kmf.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import net.kmf.entity.Person;
import net.kmf.persistance.PersonDao;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
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
        MultivaluedMap<String, String> qParams = uriInfo.getQueryParameters();
        PersonDao dao = new PersonDao();

        List<Person> people = dao.getAllPeoples();
        List<Person> result = null;
        if(qParams.containsKey("scope")) {
            switch (qParams.getFirst("scope")) {
                case "all":
                    result = people;
                    break;
                case "one":
                    //result = dao.get
                    break;
                default:
                    break;
            }
        } else {
            // generate result set
            // shamelessly stolen from the stream response
            // from https://stackoverflow.com/questions/8378752/pick-multiple-random-elements-from-a-list-in-java
            Random random = new Random();
            result = IntStream.generate(() -> random.nextInt(people.size()))
                    .distinct()
                    .limit(3)
                    .mapToObj(people::get)
                    .collect(Collectors.toList());
        }

        Response r = null;
        //String json = "{\"response\": \"This is the people service.\"}";
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(result);
            r = Response.status(200).entity(json).build();
        } catch (JsonProcessingException jpe){
            log.error("encountered processing error in PersonService.getMessage", jpe);
            r = Response.status(500).build();
        } catch (Exception e) {
            r = Response.status(500).entity("{'error':'We dun goofed. Sorry.'}").build();
        }

        return r;
    }

}
