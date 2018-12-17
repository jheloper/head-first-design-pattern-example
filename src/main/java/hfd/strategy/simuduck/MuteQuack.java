package hfd.strategy.simuduck;

public class MuteQuack implements Quackable {

    public static final String QUACK = "can not quack...";

    @Override
    public String quack() {
        return QUACK;
    }
}
