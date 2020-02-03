package lab.action.skuperfield;

import lab.action.Action;
import lab.subject.Subject;

public class HearingSubject extends Action {
    private Subject subject;

    public HearingSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String execute() {
        return "слушает " + subject;
    }

    @Override
    public String getDescription() {
        return "Может слышать Subject.";
    }
}
