package hfd.strategy;

public class MallardDuck extends Duck implements Quackable, Flyable {

    public static final String DISPLAY = "this is MallardDuck!";

    @Override
    public String display() {
        return DISPLAY;
    }

    @Override
    public String fly() {
        return Duck.FLY;
    }

    @Override
    public String quack() {
        return Duck.QUACK;
    }
}
