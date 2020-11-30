package strategy.persons;


import strategy.artifacts.CrownBehavior;
import strategy.behaviorweapons.SpearBehavior;

public class King extends Character {

    public King() {
        this.weapon = new SpearBehavior(); // Царь имеет копье
        this.artefact = new CrownBehavior(); // Царь имеет корону
    }

    @Override
    public void display() {
        System.out.println("Смелый царь");
    }
}
