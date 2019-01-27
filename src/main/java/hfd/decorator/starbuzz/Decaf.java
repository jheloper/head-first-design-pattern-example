package hfd.decorator.starbuzz;

public class Decaf extends Beverage {

    public Decaf() {
        this.description = "디카페인 커피";
    }

    @Override
    public int cost() {
        return 5000 + super.cost();
    }
}
