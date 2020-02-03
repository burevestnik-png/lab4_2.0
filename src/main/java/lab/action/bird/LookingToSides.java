package lab.action.bird;

import lab.action.Action;

public class LookingToSides extends Action {
    @Override
    public String execute() {
        return "смотрит по сторонам";
    }

    @Override
    public String getDescription() {
        return "Может смотреть по сторонам.";
    }
}
