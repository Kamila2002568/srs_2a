package decorator.doners;

public abstract class Doner {

    String description = "Unknown Doner";

    public String getDescription() {
        return description;
    }

    public abstract double cost(); // Каждый наследник должен реализовать этот метод по разному
}

