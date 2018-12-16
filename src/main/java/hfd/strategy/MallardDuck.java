package hfd.strategy;

public class MallardDuck extends Duck {

    public static final String DISPLAY = "this is MallardDuck!";

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public String display() {
        return DISPLAY;
    }
}
