package lab.action.bird;

import lab.action.Action;

public class FlyingAway extends Action {
    @Override
    public String execute() {
        return "улетает";
    }

    @Override
    public String getDescription() {
        return "Может улететь.";
    }
}
