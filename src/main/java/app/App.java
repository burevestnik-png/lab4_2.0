package app;

import lab.action.skuperfield.LookingAtBeing;
import lab.action.skuperfield.LookingAtSubject;
import lab.action.skuperfield.NotMoving;
import lab.enums.Beings;
import lab.exceptions.NoActionsException;
import lab.exceptions.NoSuchActionException;
import lab.exceptions.NonLookableSubjectException;
import lab.service.Creator;
import lab.service.StoryTeller;
import lab.subject.Bird;
import lab.subject.Skuperfield;
import lab.subject.Subject;

public class App {
    public static void main(String args[]) {
        Creator creator = new Creator();
        StoryTeller storyTeller = new StoryTeller(creator);
        System.out.println(storyTeller.tellStory());
    }
}
