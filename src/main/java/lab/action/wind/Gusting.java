package lab.action.wind;

import lab.action.Action;

public class Gusting extends Action {
    @Override
    public String execute() {
        return "налетает порывами";
    }

    @Override
    public String getDescription() {
        return "Может налетать порывами.";
    }
}
