package net.kmf.entity;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Before;
import org.junit.Test;

import javax.validation.constraints.AssertTrue;

import static org.junit.Assert.*;

public class PeopleTest {
    People people;
    @Before
    public void setUp() throws Exception {
        people = new People(1, "male", "Test Name", "Special Person", "newImage.jpg");
    }

    @Test
    public void getId() {
        int id = people.getId();

        assertEquals("The correct id was not returned", 1, id);
    }

    @Test
    public void setId() {
        int id = 2;
        people.setId(id);

        assertNotEquals("The id was not set correctly.", people.getId(), 1);
    }

    @Test
    public void getGender() {
        String gender = people.getGender();

        assertEquals("The gender did not return the set gender.", "male", gender);
    }

    @Test
    public void setGender() {
        String gender = "female";
        people.setGender(gender);

        assertNotEquals("The gender did not change when setting a new gender", people.getGender(), "male");
    }

    @Test
    public void getName() {
        String name = people.getName();

        assertEquals("The name was incorrectly returned", "Test Name", name);
    }

    @Test
    public void setName() {
        String name = "Name";
        people.setName(name);

        assertNotEquals("The name was incorrectly set", people.getName(), "Test Name");
    }

    @Test
    public void getDescription() {
        String description = people.getDescription();

        assertEquals("Description incorrectly returned", "Special Person", description);
    }

    @Test
    public void setDescription() {
        String description = "description";
        people.setDescription(description);

        assertNotEquals("Description was not able to be set", people.getDescription(), "Special Person");
    }

    @Test
    public void getImageUrl() {
        String url = people.getImageUrl();

        assertEquals("Image Url was incorrectly returned", "newImage.jpg", url);
    }

    @Test
    public void setImageUrl() {
        String url = "url";
        people.setImageUrl(url);

        assertNotEquals("The image url was not set", "newImage.jpg", people.getImageUrl());
    }

    @Test
    public void equals() {
        People people1 = new People(1, "male", "Test Name", "Special Person", "newImage.jpg");
        Boolean test = people.equals(people1);
        assertTrue("The people do not equal", test);
    }

    @Test
    public void testHashCode() {
        int hashCode = people.hashCode();
        People people1 = new People(1, "male", "Test Name", "Special Person", "newImage.jpg");

        assertEquals("The hashcode did not parse", hashCode, people1.hashCode());
    }

}