package hfd.decorator.starbuzz;

public class Espresso extends Beverage {

    @Override
    public int cost() {
        return 3500 + super.cost();
    }
}
