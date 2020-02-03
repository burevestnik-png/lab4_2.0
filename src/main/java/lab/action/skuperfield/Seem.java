package lab.action.skuperfield;

import lab.action.Action;

public class Seem extends Action {
    @Override
    public String execute() {
        return "кажется";
    }

    @Override
    public String getDescription() {
        return "Может казаться.";
    }
}
