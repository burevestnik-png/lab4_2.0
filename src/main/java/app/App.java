package app;

import lab.exceptions.NoSuchActionException;
import lab.service.Creator;
import lab.service.StoryTeller;

public class App {
    public static void main(String args[]) {
        try {
            Creator creator = new Creator();
            StoryTeller storyTeller = new StoryTeller(creator);
            System.out.println(storyTeller.tellStory());
        } catch (NoSuchActionException e) {
            e.printStackTrace();
        }
    }
}
