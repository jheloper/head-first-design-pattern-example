package hfd.strategy;

import static org.junit.Assert.*;

import org.junit.Test;


public class DuckTest {

    @Test
    public void testActionOfMallardDuck() {
        final Duck mallardDuck = new MallardDuck();
        assertEquals(Duck.QUACK, mallardDuck.quack());
        assertEquals(Duck.SWIM, mallardDuck.swim());
        assertEquals(MallardDuck.DISPLAY, mallardDuck.display());
        assertEquals(Duck.FLY, mallardDuck.fly());
    }


    @Test
    public void testActionOfRedheadDuck() {
        final Duck redheadDuck = new RedheadDuck();
        assertEquals(Duck.QUACK, redheadDuck.quack());
        assertEquals(Duck.SWIM, redheadDuck.swim());
        assertEquals(RedheadDuck.DISPLAY, redheadDuck.display());
        assertEquals(Duck.FLY, redheadDuck.fly());
    }

    @Test
    public void testActionOfRubberDuck() {
        final Duck rubberDuck = new RubberDuck();
        assertEquals(RubberDuck.QUACK, rubberDuck.quack());
        assertEquals(Duck.SWIM, rubberDuck.swim());
        assertEquals(RubberDuck.DISPLAY, rubberDuck.display());
        assertEquals(Duck.FLY, rubberDuck.fly());
    }
}
