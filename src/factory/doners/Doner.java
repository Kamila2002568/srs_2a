package factory.doners;

public abstract class Doner {

    public void prepare() {
        System.out.println("Готовим...");
    }
    public void bake() {
        System.out.println("Испекаем...");
    }

    public void cut() {
        System.out.println("Режем...");
    }

    public void box() {
        System.out.println("Упакуем...");
    }
}
