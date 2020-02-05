package lab.action.skuperfield;

import lab.action.Action;
import lab.enums.PartsOfBody;

public class PartsDisappearing extends Action {
    private PartsOfBody part;

    public PartsDisappearing(PartsOfBody part) {
        this.part = part;
    }

    @Override
    public String execute() {
        return part + " исчезло";
    }

    @Override
    public String getDescription() {
        return "Может потерять часть тела.";
    }
}
