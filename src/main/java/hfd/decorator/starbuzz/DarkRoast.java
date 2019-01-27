package hfd.decorator.starbuzz;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "다크로스트 커피";
    }

    @Override
    public int cost() {
        return 5500 + super.cost();
    }
}
