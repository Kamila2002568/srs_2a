package observer.subject;

public class Restaurant extends Subject {

    private String hitThisMonth;

    public String getHitThisMonth() {
        return hitThisMonth;
    }

    public void setHitThisMonth(String hitThisMonth) {
        this.hitThisMonth = hitThisMonth;
        notifyObserver();
    }

    @Override
    protected void notifyObserver() { // Лямбда
        observers.forEach((observer) -> observer.update(hitThisMonth));
    }
}
