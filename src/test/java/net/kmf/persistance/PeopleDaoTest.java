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

    @Before
    public void setUp() throws Exception {
        peopleDao = new PeopleDao();
        people = peopleDao.getAllPeoples();
        numberOfUsers = people.size();


    }

    @Test
    public void getAllPeoples() {

    }

    @Test
    public void getPeople() {

    }

    @Test
    public void getPeoplesByLastName() {

    }

    @Test
    public void insert() {

    }

    @Test
    public void update() {

    }

    @Test
    public void delete() {

    }

}