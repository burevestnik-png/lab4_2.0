package lab.action.bird;

import lab.action.Action;
import lab.enums.Food;

public class PeckingFood extends Action {
    private Food food;

    public PeckingFood(Food food) {
        this.food = food;
    }

    @Override
    public String execute() {
        return "клюет " + food;
    }

    @Override
    public String getDescription() {
        return "Может клевать food.";
    }
}
