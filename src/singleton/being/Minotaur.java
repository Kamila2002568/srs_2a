package singleton.being;

import singleton.Fightable;

public class Minotaur implements Fightable {

    private static Minotaur minotaur; // Паттерн одиночка требует экзаемляр самого себя
    private static final String GET_WEAPON = "Топор"; // статистические поля
    private static final String NAME = "Минотавр";

    public static  Minotaur getInstance() { // инициализация
        if(minotaur == null) {
            minotaur = new Minotaur();
        }

        return minotaur;
    }

    private Minotaur() {
    }

    @Override
    public void fight() {
        System.out.println(NAME + " жестоко дерется");
    }

    @Override
    public void fight(Human human) {
        System.out.println(NAME + " избивает " + human.getName() + " " + GET_WEAPON + "ом");
    }
}
