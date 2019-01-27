package hfd.decorator.starbuzz;

public class HouseBlend extends Beverage {

    @Override
    public int cost() {
        return 10000 + super.cost();
    }
}
