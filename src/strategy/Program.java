package strategy;

import strategy.behaviorweapons.BowBehavior;
import strategy.behaviorweapons.SpearBehavior;
import strategy.persons.Character;
import strategy.persons.King;
import strategy.persons.Knight;
import strategy.persons.Viking;

public class Program {
    public static void main(String[] args) {

        Character person1 = new Knight();
        person1.display();
        person1.fight();
        person1.useArtefact();
        person1.setWeapon(new SpearBehavior());
        person1.fight();

        System.out.println("===========================================");
        Character person2 = new Viking();
        person2.display();
        person2.useArtefact();
        person2.setWeapon(new BowBehavior());
        person2.fight();

    }
}
