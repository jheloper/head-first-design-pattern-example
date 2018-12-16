package hfd.strategy;

public abstract class Duck {

    public static final String QUACK = "quack!!!";
    public static final String SWIM = "swimming!!!";
    public static final String FLY = "flying!!!";

    public String swim() {
        return SWIM;
    }

    public abstract String display();
}
