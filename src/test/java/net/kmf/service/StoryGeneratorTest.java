package net.kmf.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StoryGeneratorTest {
    private StoryGenerator generator;
    @Before
    public void init() {
        generator = new StoryGenerator();
    }

    @Test
    public void generateRandomNumberTest() throws Exception {
        int max = 20;
        int number = generator.generateRandomNumber(max);
        assertTrue("The number is not positive", number >= 0);
        assertTrue("The number is not less than the max value", number < max);
    }

    @Test
    public void formatStoryTest() throws Exception {
        String story = "This is a simple ('love'), story with ('marry') and simple ('kill') characters";
        String result = generator.formatStory("Mary", "Joe", "Mike", story);

        assertFalse("The story still contains ('love')", result.contains("('love')"));
        assertFalse("The story still contains ('kill')", result.contains("('kill')"));
        assertFalse("The story still contains ('marry')", result.contains("('marry')"));
    }

    @Test
    public void chooseStoryTest() throws Exception {
        String randomStory = generator.chooseStory();

        assertNotNull("The story was null", randomStory);
        assertFalse("The story was empty", randomStory.isEmpty());
        assertNotEquals("The default story was selected", "The story didn't generate correctly", randomStory);
    }

}