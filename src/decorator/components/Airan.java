package decorator.components;

import decorator.doners.Doner;

public class Airan extends CondimentDecorator {
    Doner doner;

    public Airan(Doner doner) {
        this.doner = doner;
    }

    public String getDescription() {
        return doner.getDescription() + ", Russian Smetana";
    }

    @Override
    public double cost() {
        return 250.0 + doner.cost(); // Цена с учетом соуса
    }
}
