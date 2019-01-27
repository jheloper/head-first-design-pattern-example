package hfd.decorator.starbuzz;

public class DarkRoast extends Beverage {

    @Override
    public int cost() {
        return 5500 + super.cost();
    }
}
