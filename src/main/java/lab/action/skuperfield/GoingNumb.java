package lab.action.skuperfield;

import lab.action.Action;
import lab.enums.PartsOfBody;

public class GoingNumb extends Action {
    @Override
    public String execute() {
        return "одеревенели " + PartsOfBody.HANDS + ", " + PartsOfBody.LEGS + ", " + PartsOfBody.TORSO;
    }

    @Override
    public String getDescription() {
        return "У Скуперфильда могут одеревенеть конечности.";
    }
}
