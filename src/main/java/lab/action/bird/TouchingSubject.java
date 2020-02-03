package lab.action.bird;

import lab.action.Action;
import lab.subject.Subject;

public class TouchingSubject extends Action {
    private Subject subject;

    public TouchingSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String execute() {
        return "задевает " + subject;
    }

    @Override
    public String getDescription() {
        return "Может задеть Subject.";
    }
}
