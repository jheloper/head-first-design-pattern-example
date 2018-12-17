package hfd.strategy.simuduck;

public class RubberDuck extends Duck {

    public static final String DISPLAY = "this is RubberDuck!";

    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public String display() {
        return DISPLAY;
    }
}
