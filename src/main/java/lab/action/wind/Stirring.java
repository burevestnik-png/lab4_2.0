package lab.action.wind;

import lab.action.Action;

public class Stirring extends Action {
    @Override
    public String execute() {
        return "шевелит листочки";
    }

    @Override
    public String getDescription() {
        return "Может шевелить листочки.";
    }
}
