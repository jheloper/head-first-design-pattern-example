package hfd.strategy.simuduck;

public class ModelDuck extends Duck {

    public static final String DISPLAY = "this is ModelDuck!";

    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public String display() {
        return DISPLAY;
    }
}
