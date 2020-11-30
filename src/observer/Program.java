package observer;

import observer.observer.Subscriber;
import observer.subject.Restaurant;

public class Program {
    public static void main(String[] args) {
        // Создаём экземпляры субъекта и наблюдателей
        Restaurant restaurant = new Restaurant();
        Subscriber observer1 = new Subscriber();
        Subscriber observer2 = new Subscriber();
        Subscriber observer3 = new Subscriber();
        // Добавляем наблюдателей субъекту
        restaurant.addObserver(observer1);
        restaurant.addObserver(observer2);
        restaurant.addObserver(observer3);
        // Публикуется блюдо месяца
        restaurant.setHitThisMonth("Баварские сосиски");
        System.out.println("Observer 1: " + observer1.getHitThisMonth());
        System.out.println("Observer 2: " + observer2.getHitThisMonth());
        System.out.println("Observer 3: " + observer3.getHitThisMonth());
        // Удаляем одного наблюдателя и изменяем блюдо месяца
        restaurant.removeObserver(observer3);
        restaurant.setHitThisMonth("Пицца");
        System.out.println("Observer 1: " + observer1.getHitThisMonth());
        System.out.println("Observer 2: " + observer2.getHitThisMonth());
        System.out.println("Observer 3: " + observer3.getHitThisMonth());
    }
}
