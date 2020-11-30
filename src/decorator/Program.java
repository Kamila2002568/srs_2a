package decorator;

import decorator.doners.AstanaFunnyDoner;
import decorator.doners.Doner;
import decorator.doners.KebabEliteDoner;
import decorator.components.BavarianSausages;
import decorator.components.ChiliSauce;
import decorator.components.RussianSmetana;

public class Program {

    public static void main(String[] args) {

        Doner doner1 = new AstanaFunnyDoner();// Создаем новый донер
        doner1 = new ChiliSauce(doner1); // добавляем в донер соус чили
        doner1 = new BavarianSausages(doner1); // добавляем туда баварские сосиски
        System.out.println(doner1.getDescription() + ": " + doner1.cost() + "тг");

        Doner doner2 = new KebabEliteDoner();
        doner2 = new BavarianSausages(doner2);
        doner2 = new ChiliSauce(doner2);
        doner2 = new RussianSmetana(doner2);
        System.out.println(doner2.getDescription() + ": " + doner2.cost() + "тг");


    }
}
