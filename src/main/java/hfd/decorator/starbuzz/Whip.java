package hfd.decorator.starbuzz;

public class Whip extends BeverageDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑크림";
    }

    @Override
    public int cost() {
        return beverage.cost() + 300;
    }
}
