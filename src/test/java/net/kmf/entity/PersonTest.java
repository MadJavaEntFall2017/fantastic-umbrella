package net.kmf.entity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    Person person;
    @Before
    public void setUp() throws Exception {
        person = new Person("male", "Test Name", "Special Person", "newImage.jpg");
    }


    @Test
    public void getGender() {
        String gender = person.getGender();

        assertEquals("The gender did not return the set gender.", "male", gender);
    }

    @Test
    public void setGender() {
        String gender = "female";
        person.setGender(gender);

        assertNotEquals("The gender did not change when setting a new gender", person.getGender(), "male");
    }

    @Test
    public void getName() {
        String name = person.getName();

        assertEquals("The name was incorrectly returned", "Test Name", name);
    }

    @Test
    public void setName() {
        String name = "Name";
        person.setName(name);

        assertNotEquals("The name was incorrectly set", person.getName(), "Test Name");
    }

    @Test
    public void getDescription() {
        String description = person.getDescription();

        assertEquals("Description incorrectly returned", "Special Person", description);
    }

    @Test
    public void setDescription() {
        String description = "description";
        person.setDescription(description);

        assertNotEquals("Description was not able to be set", person.getDescription(), "Special Person");
    }

    @Test
    public void getImageUrl() {
        String url = person.getImageUrl();

        assertEquals("Image Url was incorrectly returned", "newImage.jpg", url);
    }

    @Test
    public void setImageUrl() {
        String url = "url";
        person.setImageUrl(url);

        assertNotEquals("The image url was not set", "newImage.jpg", person.getImageUrl());
    }

    @Test
    public void equals() {
        Person person1 = new Person("male", "Test Name", "Special Person", "newImage.jpg");
        Boolean test = person.equals(person1);
        assertTrue("The person do not equal", test);
    }

    @Test
    public void testHashCode() {
        int hashCode = person.hashCode();
        Person person1 = new Person( "male", "Test Name", "Special Person", "newImage.jpg");

        assertEquals("The hashcode did not parse", hashCode, person1.hashCode());
    }

}