package lab.action.skuperfield;

import lab.action.Action;

public class ThinkingAbout extends Action {
    @Override
    public String execute() {
        return " -- подумал " + getClass().getSimpleName() + " --";
    }

    @Override
    public String getDescription() {
        return "Может про себя подумать.";
    }
}
