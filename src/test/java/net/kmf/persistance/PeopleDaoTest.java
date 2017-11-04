package net.kmf.persistance;

import net.kmf.entity.People;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PeopleDaoTest {
    PeopleDao peopleDao;
    List<People> people;
    int numberOfUsers;
    int lastUserCreated;

    @Before
    public void setUp() throws Exception {
        peopleDao = new PeopleDao();
        people = peopleDao.getAllPeoples();
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
    public void getPeoplesByLastName() {

    }

    @Test
    public void insert() {
        People people = new People(1, "male", "Test Name", "Special Person", "newImage.jpg");
        lastUserCreated = peopleDao.insert(people);
        int newNumberOfPeople = peopleDao.getAllPeoples().size();

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