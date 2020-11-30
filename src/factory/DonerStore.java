package factory;

import factory.doners.Doner;

public class DonerStore {
    DonerFactory factory;

    public DonerStore(DonerFactory factory) { // Сохр. ссылку на фабрику
        this.factory = factory;
    }

    /* Метод orderPizza() обращается к фабрике с запросом на создание объекта
    передавая тип заказа  */
    public Doner orderDoner(String type) {
        Doner doner;
        doner = factory.createDoner(type);
        doner.prepare();
        doner.bake();
        doner.cut();
        doner.box();
        return doner;
    }
}
