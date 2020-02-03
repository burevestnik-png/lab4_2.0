package lab.subject;

import lab.ability.Flyable;
import lab.ability.Seatable;
import lab.action.Action;
import lab.exceptions.NoActionsException;

public class Tree extends Subject implements Seatable, Flyable {
    public Tree(Action... actions) throws NoActionsException {
        super(actions);
    }
}
