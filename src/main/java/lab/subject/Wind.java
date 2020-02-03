package lab.subject;

import lab.action.Action;
import lab.exceptions.NoActionsException;

public class Wind extends Subject {
    public Wind(Action... actions) throws NoActionsException {
        super(actions);
    }
}
