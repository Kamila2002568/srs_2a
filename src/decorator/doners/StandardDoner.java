package decorator.doners;

public class StandardDoner extends Doner {

    public StandardDoner() {
        description = "Standard Doner";
    }

    @Override
    public double cost() {
        return 600.0;
    }
}

