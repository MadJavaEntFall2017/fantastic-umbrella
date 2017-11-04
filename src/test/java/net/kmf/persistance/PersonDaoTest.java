package net.kmf.persistance;

import net.kmf.entity.Person;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PersonDaoTest {
    PersonDao personDao;
    List<Person> people;
    int numberOfUsers;
    int lastUserCreated;

    @Before
    public void setUp() throws Exception {
        personDao = new PersonDao();
        people = personDao.getAllPeoples();
        numberOfUsers = people.size();
    }

    @Test
    public void getAllPeoples() {
        assertNotNull("The list of users was not returned", people);
        assertEquals("The correct number of users was returned", 50, numberOfUsers);
    }

    @Test
    public void getPeople() {

    }

    @Test
    public void getPeoplesByName() {
        String name = "Claribel Heaney";
        int numberOfPeopleReturned = personDao.getPeoplesByName(name).size();

        assertEquals("The number of people returned was not correct", 1, numberOfPeopleReturned);
    }

    @Test
    public void insert() {
        Person person = new Person(1, "male", "Test Name", "Special Person", "newImage.jpg");
        lastUserCreated = personDao.insert(person);
        int newNumberOfPeople = personDao.getAllPeoples().size();

        assertEquals("The user count did not go up by one with insert.", numberOfUsers + 1, newNumberOfPeople);
        assertTrue("The user id was not returned", lastUserCreated > 50);
    }

    @Test
    public void update() {

    }

    @Test
    public void delete() {

    }

}