package lab.action.flower;

import lab.action.Action;

public class Dazzling extends Action {
    @Override
    public String execute() {
        return "пестреет";
    }

    @Override
    public String getDescription() {
        return "Может пестреть.";
    }
}
