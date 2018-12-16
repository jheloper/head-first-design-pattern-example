package hfd.strategy;

public class RubberDuck extends Duck {

    public static final String QUACK = "삑삑!";
    public static final String DISPLAY = "this is RubberDuck!";

    @Override
    public String quack() {
        return QUACK;
    }

    @Override
    public String display() {
        return DISPLAY;
    }
}
