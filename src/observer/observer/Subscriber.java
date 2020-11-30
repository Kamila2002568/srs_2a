package observer.observer;

public class Subscriber implements Observer {

    private String hitThisMonth;

    public String getHitThisMonth() {
        return hitThisMonth;
    }

    @Override
    public void update(String magazineNumber) {
        this.hitThisMonth = magazineNumber;
    }
}
