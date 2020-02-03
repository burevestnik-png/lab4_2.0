package app;

import lab.action.skuperfield.LookingAtBeing;
import lab.action.skuperfield.LookingAtSubject;
import lab.action.skuperfield.NotMoving;
import lab.enums.Beings;
import lab.exceptions.NoActionsException;
import lab.exceptions.NoSuchActionException;
import lab.exceptions.NonLookableSubjectException;
import lab.subject.Bird;
import lab.subject.Skuperfield;
import lab.subject.Subject;

public class App {
    public static void main(String args[]) throws NoActionsException, NoSuchActionException, NonLookableSubjectException {
        NotMoving notMoving = new NotMoving();
        Subject bird = new Bird(notMoving);
        LookingAtBeing lookingAtBeing = new LookingAtBeing(Beings.TURKEY);
        LookingAtSubject lookingAtSubject = new LookingAtSubject(bird);
        Skuperfield skuperfield = new Skuperfield(notMoving, lookingAtSubject, lookingAtBeing);
        System.out.println(skuperfield.getAbilities());
        System.out.println(skuperfield.doAction("LookingAtBeing"));
    }
}
