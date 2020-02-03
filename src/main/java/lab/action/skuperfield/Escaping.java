package lab.action.skuperfield;

import lab.action.Action;

public class Escaping extends Action {
    @Override
    public String execute() {
        return "вырвется";
    }

    @Override
    public String getDescription() {
        return "Может вырваться.";
    }
}
