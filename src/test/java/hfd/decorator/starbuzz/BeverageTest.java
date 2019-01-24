package hfd.decorator.starbuzz;

import org.junit.Assert;
import org.junit.Test;

public class BeverageTest {

    @Test
    public void testMakeBeverage() {

        final Beverage darkRoast = new DarkRoast();
        final Beverage decaf = new Decaf();
        final Beverage espresso = new Espresso();
        final Beverage houseBlend = new HouseBlend();

        Assert.assertEquals(5500, darkRoast.cost());
        Assert.assertEquals(5000, decaf.cost());
        Assert.assertEquals(3500, espresso.cost());
        Assert.assertEquals(10000, houseBlend.cost());
    }
}
