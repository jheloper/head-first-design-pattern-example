package hfd.strategy.simuduck;

public class FlyRocketPowered implements Flyable {

    public static final String FLY = "fly rocket powered!!!";

    @Override
    public String fly() {
        return FLY;
    }
}
