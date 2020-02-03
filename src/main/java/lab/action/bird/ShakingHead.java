package lab.action.bird;

import lab.action.Action;

public class ShakingHead extends Action {
    @Override
    public String execute() {
        return "наклоняет голову в разные стороны";
    }

    @Override
    public String getDescription() {
        return "Может наклонять голову в разные стороны.";
    }
}
