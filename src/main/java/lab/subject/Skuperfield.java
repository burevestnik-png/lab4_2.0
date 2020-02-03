package lab.subject;

import lab.ability.Seatable;
import lab.exceptions.NoActionsException;
import lab.action.Action;
import lab.exceptions.NoSuchActionException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Skuperfield extends Subject implements Seatable {
    public Skuperfield(Action... actions) throws NoActionsException {
        super(actions);
    }

    public Skuperfield(List<Action> list) {
        super(list);
    }

    public Skuperfield() {
    }
}
