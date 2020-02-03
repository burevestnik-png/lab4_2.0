package lab.subject;

import lab.action.Action;
import lab.exceptions.NoActionsException;

import java.util.List;

public class Wind extends Subject {
    public Wind(Action... actions) throws NoActionsException {
        super(actions);
    }

    public Wind(List<Action> list) {
        super(list);
    }

    public Wind() {
    }
}
