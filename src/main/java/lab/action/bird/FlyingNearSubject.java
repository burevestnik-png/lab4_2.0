package lab.action.bird;

import lab.action.Action;
import lab.subject.Subject;

public class FlyingNearSubject extends Action {
    private Subject subject;

    public FlyingNearSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String execute() {
        return "летает около " + subject;
    }

    @Override
    public String getDescription() {
        return "Может летать около Subject.";
    }
}
