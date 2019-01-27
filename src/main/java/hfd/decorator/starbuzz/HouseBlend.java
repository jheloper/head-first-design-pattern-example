package hfd.decorator.starbuzz;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "하우스블렌드 커피";
    }

    @Override
    public int cost() {
        return 10000 + super.cost();
    }
}
