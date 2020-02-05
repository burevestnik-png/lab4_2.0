package lab.action.bird;

import lab.ability.Lookable;
import lab.ability.Seatable;
import lab.action.Action;
import lab.exceptions.NoSuchActionException;
import lab.exceptions.NonSeatableSubjectException;
import lab.subject.Subject;

public class SittingOnSubject extends Action {
    private Subject subject;

    public SittingOnSubject(Subject subject) throws NonSeatableSubjectException {
        if (subject instanceof Seatable) {
            this.subject = subject;
        } else throw new NonSeatableSubjectException("That subject is unseatable.");
    }

    @Override
    public String execute() {
        return "садится на " + subject;
    }

    @Override
    public String getDescription() {
        return "Может сидеть на определенных объектах";
    }

    public Subject getSubject() {
        return subject;
    }
}
