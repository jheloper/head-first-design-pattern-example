package hfd.decorator.starbuzz;

public abstract class Beverage {

    protected String description;
    private boolean milk = false;
    private boolean soy = false;
    private boolean mocha = false;
    private boolean whip = false;

    public String getDescription() {
        return description;
    }

    public boolean hasMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean hasSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean hasMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean hasWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }

    public int cost() {

        int cost = 0;

        if (hasMilk()) {
            cost += 500;
        }

        if (hasSoy()) {
            cost += 600;
        }

        if (hasMocha()) {
            cost += 400;
        }

        if (hasWhip()) {
            cost += 300;
        }

        return cost;
    }
}
