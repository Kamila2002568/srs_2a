package strategy.persons;

import strategy.artifacts.SubstanceBehavior;
import strategy.behaviorweapons.AxeBehavior;

public class Viking extends Character {

    public Viking() {
        this.weapon = new AxeBehavior();
        this.artefact = new SubstanceBehavior();
    }

    @Override
    public void display() {
        System.out.println("Сильный викинг");
    }
}
