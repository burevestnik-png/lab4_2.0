package lab.action.skuperfield;

import lab.action.Action;

public class NotGettingFree extends Action {
    @Override
    public String execute() {
        return "не может освободиться";
    }

    @Override
    public String getDescription() {
        return "Не может освобождаться.";
    }
}
