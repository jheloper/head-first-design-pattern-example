package hfd.strategy;

public abstract class Duck {

    public static final String QUACK = "quack!!!";
    public static final String SWIM = "swimming!!!";

    public String quack() {
        return QUACK;
    }

    public String swim() {
        return SWIM;
    }

    public abstract String display();
}
