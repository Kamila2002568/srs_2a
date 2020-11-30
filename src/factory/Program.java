package factory;

import factory.doners.Doner;

public class Program {
    public static void main(String[] args) {
        // Создаем Фабрику по произв. донера
        DonerFactory factory = new DonerFactory();
        // создаем магазин, где заказывают донер
        DonerStore store = new DonerStore(factory);

        // Созданем сырный донер и узнаем класс этого донера
        Doner doner1 = store.orderDoner("сыр");
        System.out.println(doner1.getClass());


        System.out.println();


        Doner doner2 = store.orderDoner("мясо");
        System.out.println(doner2.getClass());
    }
}
