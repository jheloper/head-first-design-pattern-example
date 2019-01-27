package hfd.decorator.starbuzz;

public class Soy extends BeverageDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }

    @Override
    public int cost() {
        return beverage.cost() + 600;
    }
}
