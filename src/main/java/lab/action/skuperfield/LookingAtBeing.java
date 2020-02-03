package lab.action.skuperfield;

import lab.action.Action;
import lab.enums.Beings;

public class LookingAtBeing extends Action {
    private Beings being;

    public LookingAtBeing(Beings being) {
        this.being = being;
    }
    @Override
    public String execute() {
        return "смотрит на " + being;
    }

    @Override
    public String getDescription() {
        return "Может смотреть на Beings.";
    }
}
