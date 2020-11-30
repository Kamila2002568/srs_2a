package decorator.doners;

public class AstanaFunnyDoner extends Doner {

    public AstanaFunnyDoner() {
        description = "Astana Funny Doner";
    }

    @Override
    public double cost() {
        return 750.0;
    }
}
