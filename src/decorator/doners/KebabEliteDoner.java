package decorator.doners;

public class KebabEliteDoner extends Doner {

    public KebabEliteDoner() {
        description = "Kebab Elite Doner";
    }

    @Override
    public double cost() {
        return 3000.0;
    }
}
