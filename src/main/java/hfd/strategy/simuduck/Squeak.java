package hfd.strategy.simuduck;

public class Squeak implements Quackable {

    public static final String SQUEAK = "squeak!!!";

    @Override
    public String quack() {
        return SQUEAK;
    }
}
