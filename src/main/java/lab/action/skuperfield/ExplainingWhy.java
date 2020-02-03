package lab.action.skuperfield;

import lab.action.Action;

public class ExplainingWhy extends Action {
    @Override
    public String execute() {
        return "Почему я раньше не замечал этого?  Почему никогда не ходил в лес и не видел всей этой красоты?";
    }

    @Override
    public String getDescription() {
        return "Может пояснить.";
    }
}
