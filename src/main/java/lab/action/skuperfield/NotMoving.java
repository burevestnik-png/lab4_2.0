package lab.action.skuperfield;

import lab.action.Action;

public class NotMoving extends Action {
    @Override
    public String execute() {
        return "не двигается";
    }

    @Override
    public String getDescription() {
        return "Может не двигаться.";
    }
}
