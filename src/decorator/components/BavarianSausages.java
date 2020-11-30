package decorator.components;

import decorator.doners.Doner;

public class BavarianSausages extends CondimentDecorator {
    Doner doner;

    public BavarianSausages(Doner doner) {
        this.doner = doner;
    }

    public String getDescription() {
        return doner.getDescription() + ", Bavarian Sausages";
    }

    @Override
    public double cost() {
        return 1500.0 + doner.cost(); // Цена с учетом соуса
    }
}
