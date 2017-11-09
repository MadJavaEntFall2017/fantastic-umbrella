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
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/person")
public class PersonService {
    private final Logger log = Logger.getLogger(this.getClass());

    @GET
    @Produces("application/json")
    public Response getMessage() {
        PersonDao dao = new PersonDao();
        List<Person> people = dao.getAllPeoples();
        Response r = null;
        //String json = "{\"response\": \"This is the people service.\"}";
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(people);
            r = Response.status(200).entity(json).build();
        } catch (JsonProcessingException jpe){
            log.error("encountered processing error in PersonService.getMessage", jpe);
            r = Response.status(500).build();
        }

        return r;
    }

}
