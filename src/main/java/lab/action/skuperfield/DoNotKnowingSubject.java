package lab.action.skuperfield;

import lab.ability.Lookable;
import lab.action.Action;
import lab.exceptions.NonLookableSubjectException;
import lab.subject.Subject;

public class DoNotKnowingSubject extends Action {
    private Subject subject;

    public DoNotKnowingSubject(Subject subject) throws NonLookableSubjectException {
        if (subject instanceof Lookable) {
            this.subject = subject;
        } else throw new NonLookableSubjectException("That subject is unlookable.");
    }

    @Override
    public String execute() {
        return "не знает " + subject;
    }

    @Override
    public String getDescription() {
        return "Может не знать что-либо о Subject.";
    }
}
