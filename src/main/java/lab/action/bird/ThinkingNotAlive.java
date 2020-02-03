package lab.action.bird;

import lab.action.Action;
import lab.subject.Subject;

public class ThinkingNotAlive extends Action {
    private Subject subject;

    public ThinkingNotAlive(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String execute() {
        return "думает что " + subject + " неживой предмет";
    }

    @Override
    public String getDescription() {
        return "Может думать, что Subject неживой.";
    }
}
