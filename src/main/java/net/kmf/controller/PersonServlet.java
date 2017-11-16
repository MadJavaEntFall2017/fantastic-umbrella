package net.kmf.controller;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.kmf.entity.Person;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.io.IOException;


import java.util.List;

/**
 * The type Person servlet.
 * The purpose of this servlet is to demonstrate the celebrities existing in the database.
 *
 * @author bswanson 11/15/2017
 */
@WebServlet (
        name = "persons",
        urlPatterns = {"/persons"}
)
public class PersonServlet extends HttpServlet {
    /**
     * This method responds to the get requests for the persons url.
     * @param req The request object
     * @param resp The response object
     * @throws ServletException if something goes wrong in general
     * @throws IOException if it can't parse the JSON
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Empty list of to hold the people
        List<Person> people = null;

        // Make the call to the API (Deployed on AWS)
        Client client1 = ClientBuilder.newClient();
        WebTarget serviceWeb1 = client1.target("http://18.221.209.59:8080/kmf/api/person");
        Response response1 = serviceWeb1.request().get();

        // Take the response and map it into people objects
        ObjectMapper objectMapper = new ObjectMapper();
        people = objectMapper.readValue(response1.readEntity(String.class), new TypeReference<List<Person>>() {});

        // Send the people to the webpage to be displayed
        HttpSession session = req.getSession();
        session.setAttribute("people", people);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/persons.jsp");
        dispatcher.forward(req, resp);
    }
}
