package hfd.strategy;

public class FlyWithWings implements Flyable {

    public static final String FLY = "flying with wings!!!";

    @Override
    public String fly() {
        return FLY;
    }
}
