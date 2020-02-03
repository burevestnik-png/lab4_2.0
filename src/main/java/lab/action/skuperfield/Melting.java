package lab.action.skuperfield;

import lab.action.Action;

public class Melting extends Action {
    @Override
    public String execute() {
        return "умиляется";
    }

    @Override
    public String getDescription() {
        return "Может умиляться.";
    }
}
