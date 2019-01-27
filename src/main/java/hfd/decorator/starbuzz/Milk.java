package hfd.decorator.starbuzz;

public class Milk extends BeverageDecorator {

    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 스팀 우유";
    }

    @Override
    public int cost() {
        return beverage.cost() + 500;
    }
}
