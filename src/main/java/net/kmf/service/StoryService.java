package net.kmf.service;
import net.kmf.entity.Person;
import net.kmf.persistance.PersonDao;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Story Service class.
 * Returns a story with the entered name choices.
 *
 * @author jstoffregen 11/01/2017
 */
@Path("/story")
public class StoryService {
    private final Logger log = Logger.getLogger(this.getClass());
    private StoryGenerator generator = new StoryGenerator();

    /**
     * The base API call just returns a random story.
     * @return Response object that contains the story as text.
     */
    @GET
    @Produces("text/plain")
    public Response getStory() {
        return Response.status(200).entity(generator.chooseStory()).build();
    }

    /**
     * An API call to generate a user story given three input choices.
     * Usage: ~/api/story/userStory?loveChoice=$&killChoice=$&marryChoice=$
     * @return The response object with the story as text.
     */
    @Path("/userStory")
    @GET
    @Produces("text/html")
    public Response getStoryGivenChoices(
            @QueryParam("loveChoice") String loveChoice,
            @QueryParam("killChoice") String killChoice,
            @QueryParam("marryChoice") String marryChoice
    ) {
        if (loveChoice == null || loveChoice.isEmpty()) {
            return Response.status(500).entity("Parameters are not good, check input - loveChoice").build();
        } else if (killChoice == null || killChoice.isEmpty()) {
            return Response.status(500).entity("Parameters are not good, check input - killChoice").build();
        } else if (marryChoice == null || marryChoice.isEmpty()) {
            return Response.status(500).entity("Parameters are not good, check input - marryChoice").build();
        }
        String story = generator.chooseStory();
        String output = generator.formatStory(killChoice, marryChoice, loveChoice, story);
        return Response.status(200).entity(output).build();
    }

}

