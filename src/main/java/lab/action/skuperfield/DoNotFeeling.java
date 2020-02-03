package lab.action.skuperfield;

import lab.action.Action;

public class DoNotFeeling extends Action {
    @Override
    public String execute() {
        return "не чувствовал ничего";
    }

    @Override
    public String getDescription() {
        return "Может ничего не чувствовать.";
    }
}
