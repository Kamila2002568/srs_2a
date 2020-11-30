package singleton.being;

import singleton.Fightable;

public class Warrior extends Human implements Fightable {

    public Warrior() {
        super();
    }

    public Warrior(String name, int age) {
        super(name, age);
    }

    @Override
    public void fight() {
        System.out.println(getName() + "дерется");
    }

    @Override
    public void fight(Human human) {
        System.out.println(getName() + " дерется с " + human.getName());
    }
}
