package lab.subject;

import lab.exceptions.NoActionsException;
import lab.action.Action;
import lab.exceptions.NoSuchActionException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Skuperfield extends Subject {
    public Skuperfield(Action... actions) throws NoActionsException {
        super(actions);
    }
}
