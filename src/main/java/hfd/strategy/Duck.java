package hfd.strategy;

public abstract class Duck {

    public static final String SWIM = "swimming!!!";

    public Quackable quackBehavior;
    public Flyable flyBehavior;

    public String swim() {
        return SWIM;
    }

    public String performQuack() {
        return quackBehavior.quack();
    }

    public String performFly() {
        return flyBehavior.fly();
    }

    public abstract String display();
}
