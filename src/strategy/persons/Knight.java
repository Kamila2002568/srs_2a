package strategy.persons;

import strategy.artifacts.ShieldBehavior;
import strategy.behaviorweapons.SwordBehavior;

public class Knight extends Character {

    public Knight() {
        this.weapon = new SwordBehavior(); // Рыцарь имеет базовый меч
        this.artefact = new ShieldBehavior(); // Рыцарь имеет базовый щит
    }

    @Override
    public void display() {
        System.out.println("Благородный рыцарь");
    }
}
