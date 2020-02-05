package lab.subject;

import lab.ability.Knowledge;
import lab.ability.Seatable;
import lab.action.Action;
import lab.exceptions.NoActionsException;

import java.util.List;

public class Tree extends Subject implements Seatable, Knowledge {
    public Tree(Action... actions) throws NoActionsException {
        super(actions);
    }

    public Tree(List<Action> list) {
        super(list);
    }

    public Tree() {
    }
}
