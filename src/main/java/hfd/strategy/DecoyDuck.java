package hfd.strategy;

public class DecoyDuck extends Duck {

    public static final String QUACK = "가짜 오리는 울지 못해요.";
    public static final String FLY = "가짜 오리는 날지 못해요.";
    public static final String DISPLAY = "this is DecoyDuck!";

    @Override
    public String display() {
        return DISPLAY;
    }
}
