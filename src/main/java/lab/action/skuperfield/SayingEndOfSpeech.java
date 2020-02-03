package lab.action.skuperfield;

import lab.action.Action;

public class SayingEndOfSpeech extends Action {
    @Override
    public String execute() {
        return "Никогда мне это не надоест!";
    }

    @Override
    public String getDescription() {
        return "Может сказать заключительную часть речи.";
    }
}
