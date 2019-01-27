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

        final Beverage darkRoastWithSoy = new DarkRoast();
        darkRoastWithSoy.setSoy(true);

        final Beverage decafWithSteamedMilkAndWhip = new Decaf();
        decafWithSteamedMilkAndWhip.setMilk(true);
        decafWithSteamedMilkAndWhip.setWhip(true);

        final Beverage espressoWithMochaAndWhip = new Espresso();
        espressoWithMochaAndWhip.setMocha(true);
        espressoWithMochaAndWhip.setWhip(true);

        final Beverage houseBlendWithSoyAndMochaAndWhip = new HouseBlend();
        houseBlendWithSoyAndMochaAndWhip.setSoy(true);
        houseBlendWithSoyAndMochaAndWhip.setMocha(true);
        houseBlendWithSoyAndMochaAndWhip.setWhip(true);

        Assert.assertEquals(5500, darkRoast.cost());
        Assert.assertEquals(5000, decaf.cost());
        Assert.assertEquals(3500, espresso.cost());
        Assert.assertEquals(10000, houseBlend.cost());

        Assert.assertEquals(6100, darkRoastWithSoy.cost());
        Assert.assertEquals(5800, decafWithSteamedMilkAndWhip.cost());
        Assert.assertEquals(4200, espressoWithMochaAndWhip.cost());
        Assert.assertEquals(11300, houseBlendWithSoyAndMochaAndWhip.cost());
    }
}
