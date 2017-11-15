package net.kmf.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import net.kmf.entity.Person;
import net.kmf.persistance.PersonDao;

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

@WebServlet (
        name = "persons",
        urlPatterns = {"/persons"}
)
public class PersonServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PersonDao dao = new PersonDao();

        List<Person> people = null;
        people = dao.getAllPeoples();
//        Client client1 = ClientBuilder.newClient();
//        WebTarget serviceWeb1 = client1.target("http://localhost:8080/kmf/api/person");
//        Response response1 = serviceWeb1.request().get();
//        ObjectMapper objectMapper = new ObjectMapper();
//        people = objectMapper.readValue(response1.toString(), List.class);
        HttpSession session = req.getSession();
        session.setAttribute("people", people);
        // send object to webpage
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/persons.jsp");
        dispatcher.forward(req, resp);
    }
}
