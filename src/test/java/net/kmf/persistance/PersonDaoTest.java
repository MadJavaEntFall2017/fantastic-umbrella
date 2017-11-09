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

    @Before
    public void setUp() throws Exception {
        personDao = new PersonDao();
        people = personDao.getAllPeoples();
        numberOfUsers = people.size();
    }

    @Test
    public void getAllPeoples() {
        assertNotNull("The list of users was not returned", people);
        assertEquals("The correct number of users was not returned", 50, numberOfUsers);
    }

    @Test
    public void getPerson() {
        Person person = personDao.getPerson(1);
        Person person1 = personDao.getPerson(2);
        String name = person.getName();

        assertEquals("The name was not the name matching the person with id 1", "Georgianna Local", name);
        assertNotEquals("The people in 1 and 2 should not be the same", person, person1);
    }

    @Test
    public void getPeoplesByName() {
        String name = "Udall Stelfox"; // name from input list
        int numberOfPeopleReturned = personDao.getPersonByName(name).size();

        assertEquals("The number of people returned was not correct", 1, numberOfPeopleReturned);
    }

    @Test
    public void insert() {
        Person person = new Person( "male", "Test Name", "Special Person", "newImage.jpg");
        int lastUserCreated = personDao.insert(person);
        int newNumberOfPeople = personDao.getAllPeoples().size();

        assertTrue("The number of people is not greater than before.", newNumberOfPeople > numberOfUsers);
        assertTrue("The user id was not returned", lastUserCreated > 50);
        personDao.deleteById(Person.class, lastUserCreated);
    }

    @Test
    public void update() {
        Person person = personDao.getPerson(1);
        person.setDescription("Meow");
        personDao.update(person);

        assertEquals("The description was not updated.", "Meow", personDao.getPerson(1).getDescription());
    }

    @Test
    public void delete() {
        Person person = new Person( "male", "Test Name", "Special Person", "newImage.jpg");
        int lastUserCreated = personDao.insert(person);
        boolean bool = personDao.deleteById(Person.class, lastUserCreated);

        assertTrue("The user was not deleted", bool);
    }

}