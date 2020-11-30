package observer.subject;

import observer.observer.Observer;

import java.util.ArrayList;

public abstract class Subject {

    protected ArrayList<Observer> observers;

    public Subject() {
        observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    protected abstract void notifyObserver();
}
