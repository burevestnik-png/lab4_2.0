package lab.action.skuperfield;

import lab.action.Action;

public class PainDissapearing extends Action {
    @Override
    public String execute() {
        return "исчезла боль";
    }

    @Override
    public String getDescription() {
        return "Может исчезнуть боль.";
    }
}
