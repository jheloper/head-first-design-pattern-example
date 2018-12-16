package hfd.strategy;

public class RedheadDuck extends Duck {

    public static final String DISPLAY = "this is RedheadDuck!";

    public RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public String display() {
        return DISPLAY;
    }
}
