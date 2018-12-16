package hfd.strategy;

public class DecoyDuck extends Duck {

    public static final String DISPLAY = "this is DecoyDuck!";

    public DecoyDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public String display() {
        return DISPLAY;
    }
}
