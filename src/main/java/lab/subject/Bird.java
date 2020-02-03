package lab.subject;

import lab.ability.Knowledge;
import lab.ability.Lookable;
import lab.action.Action;
import lab.exceptions.NoActionsException;

import java.util.List;

public class Bird extends Subject implements Lookable, Knowledge {
    public Bird(Action... actions) throws NoActionsException {
        super(actions);
    }

    public Bird(List<Action> list) {
        super(list);
    }

    public Bird() {
    }
}
