package factory;

import factory.doners.*;

public class DonerFactory {
    // Создаем донер по ключевому слову
    public Doner createDoner(String type) {
        Doner doner = switch (type.toLowerCase()) {
            case "сыр" -> new CheeseDoner();
            case "курица" -> new ChikenDoner();
            case "мясо" -> new StandartDoner();
            case "веган" -> new VeggieDoner();
            default -> null;
        };
        return doner;
    }
}
