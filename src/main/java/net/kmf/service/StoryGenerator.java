package net.kmf.service;

import net.kmf.entity.Person;

import java.util.List;

public class StoryGenerator {

    public StoryGenerator() {
    }

    /**
     * Helper method to generate a number from 0 to max - 1.
     * @param max The maxiumum number
     * @return an int from 0 to max - 1
     */
    public int generateRandomNumber(int max) {
        if (max <= 0) {
            return 0;
        }
        return (int) (max * Math.random());
    }

    /**
     * Method to format the contents of the story as a string.
     * @param kill The kill choice given from the user
     * @param marry The marry choice given from the user
     * @param love The love choice given by the user
     * @param story The raw story.
     * @return a final story with the three inputs replacing their blank spaces in the story.
     */
    public String formatStory(String kill, String marry, String love, String story) {
        if (kill == null || marry == null || love == null || story == null) {
            return "Bad parameters, reformat the story";
        }
        String result = story.replace("('kill')", kill);
        result = result.replace("('marry')", marry);
        result = result.replace("('love')", love);
        return result;
    }

    public String getStoryForTriplet(List<Person> people) {
        if(people == null || people.size() != 3) {
            throw new IllegalArgumentException("Invalid number of people provided to getStoryForTriplet");
        }
        return formatStory(people.get(0).getName(), people.get(1).getName(), people.get(2).getName(), chooseStory());
    }

    /**
     * Method to choose from 20 stories based on a random number.
     * @return A story returned as a string.
     */
    public String chooseStory() {
        int number = generateRandomNumber(20);

        switch (number) {
            case 0:
                return "This story takes place aboard a space station orbiting a jungle planet. In it,('marry') with a lot of friends falls in love with a persistent ('love'). What role will ('kill') who loves children play in their relationship?";
            case 1:
                return "This story takes place in Brussels. In it, an altruistic ('marry') is fixed up with a disillusioned ('love'). What starts as disgust unexpectedly turns into love. Why is ('kill') even there?";
            case 2:
                return "This story takes place in a reality television show. In it, a disorganized ('kill') falls madly in love with ('love') who secretly worships forbidden gods. It seems an angry outburst will bring them even closer together. What is ('marry') doing in the behind the scenes?";
            case 3:
                return "In this story, ('love') who is heir to a kingdom but doesn't know it is in love with a rebellious ('marry'). What role will an inheritance play in their relationship, and what does ('kill') have to say?";
            case 4:
                return "In this story, a persuasive ('love') gets a job with a diabolical ('marry'). What starts as professional courtesy quickly becomes love. What will ('kill') do?";
            case 5:
                return "In this story, an ethical ('marry') falls passionately in love with a persistent ('kill') trained as a gigolo. Things start out well, but what will ('love') do?";
            case 6:
                return "This story takes place in a world-spanning nation on a prairie planet. In it, a pragmatic ('kill') falls madly in love with a plucky ('marry') - all thanks to a failure. What role will ('love') play in their relationship?";
            case 7:
                return "In this story, a ('love') who is dependent on medication falls passionately in love with a burnt-out ('kill') - all thanks to someone reading a diary. What role will ('marry') being played play in their relationship?";
            case 8:
                return "This story starts in a hospital in Geneva. In it, a hacker named ('love') who has a legendary grimoire runs into a religious ('marry'). What starts as carnal interest unexpectedly turns into obsessive love. What role will ('kill') play in their relationship?";
            case 9:
                return "This story takes place on a forest planet in a solar-system-spanning commonwealth. In it, ('marry') who has a divine connection falls in love with ('kill') - all thanks to a discovery. What role will ('love') play in their relationship?";
            case 10:
                return "In this story, ('love') as a college professor who hates animals falls madly in love with a naive pretender ('marry') - all thanks to an eavesdropping. ('kill') is completely left out.";
            case 11:
                return "This story takes place in a cruise ship. In it, an eccentric demonologist named ('kill') becomes infatuated with ('marry') an anthropologist from a bad family - all thanks to an inheritance. What role will ('love') who is the last member of his/her race play in their relationship?";
            case 12:
                return "In this story, an unstable ('love') falls in love with ('marry') who hates animals - all thanks to a slip of the tongue. ('kill') officiates the wedding.";
            case 13:
                return "In this story, a clumsy zookeeper ('love') attends a social event and meets ('marry') whose world is threatened by a space disaster. What starts as detachment becomes infatuation - all thanks to longing. What role will a fisherman named ('kill') searching for truth play in their relationship?";
            case 14:
                return "This story starts in a coffee shope. In it, an unhappy college student named ('marry') accidentally runs into the elegant ('kill'). What starts as contempt becomes love - all thanks to ('love')'s efforts.";
            case 15:
                return "In this story, a delusional ('marry') is forced to live with an unremarkable ('love'). What starts as friendship soon turns into obsessive love. Yet, how can ('kill') who loves children tear them apart?";
            case 16:
                return "In this story, an unstable ('love') falls madly in love with a moralizing ('kill') - all thanks to a birthday preparation. It seems an accident while traveling will bring them even closer together. ('marry') officiates the wedding.";
            case 17:
                return "This story starts in Moscow. In it, a bounty hunter named ('kill') who was victimized by an alien race is fixed up with an inexperienced computer programmer called ('love'). What starts as carnal interest quickly becomes obsessive love - all thanks to a discovery. Yet, how can ('marry') who fears supernatural entities tear them apart?";
            case 18:
                return "In this story, a clever archaeologist named ('love') crosses paths with ('marry') who is the last member of his/her race. What starts as a professional relationship soon turns into obsessive love - all thanks to someone applying for a job. What role will violence play in their relationship? ('kill') is the first victim.";
            case 19:
                return "In this story, ('marry') in possession of an alien artifact crosses paths with an unethical ('love'). What starts as professional courtesy quickly becomes obsessive love - all thanks to a demotion. Yet, how can a demonologist named ('love') tear them apart?";
            default:
                return "The story didn't generate correctly";

        }
    }
}
