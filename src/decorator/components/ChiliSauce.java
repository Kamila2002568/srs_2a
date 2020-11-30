package decorator.components;

import decorator.doners.Doner;

public class ChiliSauce extends CondimentDecorator {
    Doner doner;

    public ChiliSauce(Doner doner) {
        this.doner = doner;
    }

    public String getDescription() {
        return doner.getDescription() + ", Chili Sauce";
    }

    @Override
    public double cost() {
        return 150.0 + doner.cost(); // Цена с учетом соуса
    }
}
