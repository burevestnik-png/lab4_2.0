package lab.action.skuperfield;

import lab.action.Action;

public class WastingStrength extends Action {
    @Override
    public String execute() {
        return "расстратил силы";
    }

    @Override
    public String getDescription() {
        return "Может расстратить силы.";
    }
}
