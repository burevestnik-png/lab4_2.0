package lab.action.bird;

import lab.action.Action;

public class StopBeingAfraid extends Action {
    @Override
    public String execute() {
        return "перестали бояться";
    }

    @Override
    public String getDescription() {
        return "Может перестать бояться.";
    }
}
