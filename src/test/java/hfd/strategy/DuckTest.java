package hfd.strategy;

import static org.junit.Assert.*;

import org.junit.Test;


public class DuckTest {

    @Test
    public void testActionOfMallardDuck() {
        final MallardDuck mallardDuck = new MallardDuck();
        assertEquals(Duck.QUACK, mallardDuck.quack());
        assertEquals(Duck.SWIM, mallardDuck.swim());
        assertEquals(MallardDuck.DISPLAY, mallardDuck.display());
        assertEquals(Duck.FLY, mallardDuck.fly());
    }


    @Test
    public void testActionOfRedheadDuck() {
        final RedheadDuck redheadDuck = new RedheadDuck();
        assertEquals(Duck.QUACK, redheadDuck.quack());
        assertEquals(Duck.SWIM, redheadDuck.swim());
        assertEquals(RedheadDuck.DISPLAY, redheadDuck.display());
        assertEquals(Duck.FLY, redheadDuck.fly());
    }


    @Test
    public void testActionOfRubberDuck() {
        final RubberDuck rubberDuck = new RubberDuck();
        assertEquals(RubberDuck.QUACK, rubberDuck.quack());
        assertEquals(Duck.SWIM, rubberDuck.swim());
        assertEquals(RubberDuck.DISPLAY, rubberDuck.display());
    }


    @Test
    public void testActionOfDecoyDuck() {
        final DecoyDuck decoyDuck = new DecoyDuck();
        assertEquals(Duck.SWIM, decoyDuck.swim());
        assertEquals(DecoyDuck.DISPLAY, decoyDuck.display());
    }
}
