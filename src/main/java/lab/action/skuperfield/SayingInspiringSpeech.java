package lab.action.skuperfield;

import lab.action.Action;

public class SayingInspiringSpeech extends Action {

    @Override
    public String execute() {
        return "Как прекрасен мир и как хороша жизнь!";
    }

    @Override
    public String getDescription() {
        return "Может сказать вдохновляющее вступление.";
    }
}
