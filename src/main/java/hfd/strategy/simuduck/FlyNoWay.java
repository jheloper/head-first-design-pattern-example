package hfd.strategy.simuduck;

public class FlyNoWay implements Flyable {

    public static final String FLY = "can not fly...";

    @Override
    public String fly() {
        return FLY;
    }
}
