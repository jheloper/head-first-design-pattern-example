package hfd.strategy;

import static org.junit.Assert.*;

import org.junit.Test;


public class DuckTest {

    @Test
    public void testActionOfMallardDuck() {
        final Duck mallardDuck = new MallardDuck();
        assertEquals(Quack.QUACK, mallardDuck.performQuack());
        assertEquals(Duck.SWIM, mallardDuck.swim());
        assertEquals(MallardDuck.DISPLAY, mallardDuck.display());
        assertEquals(FlyWithWings.FLY, mallardDuck.performFly());
    }


    @Test
    public void testActionOfRedheadDuck() {
        final Duck redheadDuck = new RedheadDuck();
        assertEquals(Quack.QUACK, redheadDuck.performQuack());
        assertEquals(Duck.SWIM, redheadDuck.swim());
        assertEquals(RedheadDuck.DISPLAY, redheadDuck.display());
        assertEquals(FlyWithWings.FLY, redheadDuck.performFly());
    }


    @Test
    public void testActionOfRubberDuck() {
        final Duck rubberDuck = new RubberDuck();
        assertEquals(Squeak.SQUEAK, rubberDuck.performQuack());
        assertEquals(Duck.SWIM, rubberDuck.swim());
        assertEquals(RubberDuck.DISPLAY, rubberDuck.display());
        assertEquals(FlyNoWay.FLY, rubberDuck.performFly());
    }


    @Test
    public void testActionOfDecoyDuck() {
        final Duck decoyDuck = new DecoyDuck();
        assertEquals(MuteQuack.QUACK, decoyDuck.performQuack());
        assertEquals(Duck.SWIM, decoyDuck.swim());
        assertEquals(DecoyDuck.DISPLAY, decoyDuck.display());
        assertEquals(FlyNoWay.FLY, decoyDuck.performFly());
    }
}
