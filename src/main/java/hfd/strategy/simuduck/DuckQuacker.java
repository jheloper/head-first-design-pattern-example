package hfd.strategy.simuduck;

public class DuckQuacker {

    public Quackable quackBehavior;

    public DuckQuacker() {
        quackBehavior = new Quack();
    }

    public String performQuack() {
        return quackBehavior.quack();
    }
}
