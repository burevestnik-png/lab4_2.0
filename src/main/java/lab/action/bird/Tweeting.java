package lab.action.bird;

import lab.action.Action;

public class Tweeting extends Action {
    @Override
    public String execute() {
        return "чирикает";
    }

    @Override
    public String getDescription() {
        return "Может чирикать.";
    }
}
