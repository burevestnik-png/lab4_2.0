package lab.subject;

import lab.ability.Knowledge;
import lab.ability.Lookable;
import lab.action.Action;
import lab.exceptions.NoActionsException;

import java.util.List;

public class Flower extends Subject implements Lookable, Knowledge {
    public Flower(Action... actions) throws NoActionsException {
        super(actions);
    }

    public Flower(List<Action> list) {
        super(list);
    }

    public Flower() {
    }
}
