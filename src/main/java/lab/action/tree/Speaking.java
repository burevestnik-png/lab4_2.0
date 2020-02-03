package lab.action.tree;

import lab.action.Action;

public class Speaking extends Action {
    @Override
    public String execute() {
        return "шепчут на своем языке";
    }

    @Override
    public String getDescription() {
        return "Могут говорить на своем языке.";
    }
}
