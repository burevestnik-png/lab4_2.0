package lab.subject;

import lab.action.Action;
import lab.exceptions.NoActionsException;
import lab.exceptions.NoSuchActionException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public abstract class Subject {
    private List<Action> actions = new ArrayList<>();
    private StringBuilder abilities = new StringBuilder();


    public Subject(Action ... actions) throws NoActionsException {
        if (actions == null) {
            throw new NoActionsException("That subject has no actions.");
        }
        this.actions.addAll(Arrays.asList(actions));
    }

    public Subject(List<Action> list) {
        actions = list;
    }

    public Subject() {}

    //TODO: сделать что-то с That subject
    public String doAction(String name) throws NoSuchActionException {
        for (Action action : actions) {
            if (name.equals(action.toString())) {
                return action.execute();
            }
        }
        throw new NoSuchActionException("That subject doesn't have such action.");
    }

    public StringBuilder getAbilities() {
        for (Action action : actions) {
            abilities.append(action.getDescription() + "\n");
        }
        return abilities;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (this == object) {
            return true;
        }

        if (!(object instanceof Subject)) {
            return false;
        }

        if (this.actions.equals(((Subject) object).actions)) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(actions);
    }
}
