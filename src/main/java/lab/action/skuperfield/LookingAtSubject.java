package lab.action.skuperfield;

import lab.ability.Lookable;
import lab.action.Action;
import lab.exceptions.NonLookableSubjectException;
import lab.subject.Subject;

public class LookingAtSubject extends Action {
    private Subject subject;

    //TODO: подумать как сделать через рефлексию
    public LookingAtSubject(Subject subject) throws NonLookableSubjectException {
        if (subject instanceof Lookable) {
            this.subject = subject;
        } else throw new NonLookableSubjectException("That subject is unlookable.");
    }

    @Override
    public String execute() {
        return "любуется на " + subject;
    }

    @Override
    public String getDescription() {
        return "Может любоваться на Subject.";
    }
}
