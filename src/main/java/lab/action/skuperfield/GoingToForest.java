package lab.action.skuperfield;

import lab.action.Action;

public class GoingToForest extends Action {
    @Override
    public String execute() {
        return "ходить в лес";
    }

    @Override
    public String getDescription() {
        return "Может ходить в лес.";
    }
}
