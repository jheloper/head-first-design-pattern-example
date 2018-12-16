package hfd.strategy;

public class MuteQuack implements Quackable {

    public static final String QUACK = "can not quack...";

    @Override
    public String quack() {
        return QUACK;
    }
}
