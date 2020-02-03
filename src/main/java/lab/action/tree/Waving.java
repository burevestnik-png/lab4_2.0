package lab.action.tree;

import lab.action.Action;

public class Waving extends Action {
    @Override
    public String execute() {
        return "машет листочками";
    }

    @Override
    public String getDescription() {
        return "Может махать листочками.";
    }
}
