package lab.action.skuperfield;

import lab.action.Action;
import lab.enums.PartsOfBody;

public class PartsDissapearing extends Action {
    private PartsOfBody part;

    public PartsDissapearing(PartsOfBody part) {
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
