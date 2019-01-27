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

        final Beverage darkRoastWithSoy = new Soy(new DarkRoast());
        final Beverage decafWithSteamedMilkAndWhip = new Whip(new Milk(new Decaf()));
        final Beverage espressoWithMochaAndWhip = new Whip(new Mocha(new Espresso()));
        final Beverage houseBlendWithSoyAndMochaAndWhip = new Whip(new Mocha(new Soy(new HouseBlend())));

        Assert.assertEquals(5500, darkRoast.cost());
        Assert.assertEquals(5000, decaf.cost());
        Assert.assertEquals(3500, espresso.cost());
        Assert.assertEquals(10000, houseBlend.cost());

        System.out.println(darkRoastWithSoy.getDescription());
        Assert.assertEquals(6100, darkRoastWithSoy.cost());

        System.out.println(decafWithSteamedMilkAndWhip.getDescription());
        Assert.assertEquals(5800, decafWithSteamedMilkAndWhip.cost());

        System.out.println(espressoWithMochaAndWhip.getDescription());
        Assert.assertEquals(4200, espressoWithMochaAndWhip.cost());

        System.out.println(houseBlendWithSoyAndMochaAndWhip.getDescription());
        Assert.assertEquals(11300, houseBlendWithSoyAndMochaAndWhip.cost());
    }
}
