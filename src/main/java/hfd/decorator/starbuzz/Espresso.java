package hfd.decorator.starbuzz;

public class Espresso extends Beverage {

    public Espresso() {
        this.description = "에스프레소 커피";
    }

    @Override
    public int cost() {
        return 3500 + super.cost();
    }
}
