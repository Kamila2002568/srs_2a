package singleton;

import singleton.being.Citizen;
import singleton.being.Human;
import singleton.being.Minotaur;
import singleton.being.Warrior;

public class Program {
    public static void main(String[] args) {
        Minotaur minotaur = Minotaur.getInstance();
        Minotaur minotaur1 = Minotaur.getInstance();

        //проверяем, на работоспособность паттерна
        System.out.println(check(minotaur, minotaur1));

        Warrior warrior = new Warrior("Ахилес", 45);
        Human citizen = new Citizen("Эдей", 34);

        minotaur.fight(citizen);
        minotaur.fight();
        warrior.fight(citizen);

    }


    // проверяет, является ли одним и тем же объектом
    public static boolean check(Minotaur minotaur, Minotaur minotaur2) {
        return minotaur.equals(minotaur2);
    }
}
