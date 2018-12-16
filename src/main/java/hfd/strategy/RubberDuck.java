package hfd.strategy;

public class RubberDuck extends Duck implements Quackable {

    public static final String QUACK = "삑삑!";
    public static final String DISPLAY = "this is RubberDuck!";
    public static final String FLY = "고무오리는 날지 못해요.";

    @Override
    public String quack() {
        return QUACK;
    }

    @Override
    public String display() {
        return DISPLAY;
    }
}
