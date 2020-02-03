package lab.action.skuperfield;

import lab.ability.Knowledge;
import lab.ability.Lookable;
import lab.action.Action;
import lab.exceptions.NonKnownSubjectException;
import lab.exceptions.NonLookableSubjectException;
import lab.subject.Subject;

public class KnowingSubject extends Action {
    private Subject subject;

    public KnowingSubject(Subject subject) throws NonKnownSubjectException {
        if (subject instanceof Knowledge) {
            this.subject = subject;
        } else throw new NonKnownSubjectException("That subject is unknown.");
    }

    @Override
    public String execute() {
        return "знает " + subject;
    }

    @Override
    public String getDescription() {
        return "Может знать что-либо о Subject.";
    }
}
