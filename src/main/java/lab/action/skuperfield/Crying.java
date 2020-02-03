package lab.action.skuperfield;

import lab.action.Action;

public class Crying extends Action {
    @Override
    public String execute() {
        return "плачет";
    }

    @Override
    public String getDescription() {
        return "Может плакать.";
    }
}
