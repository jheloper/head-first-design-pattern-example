package hfd.strategy;

import static org.junit.Assert.*;
import org.junit.Test;


public class DuckTest {

    @Test
    public void testDisplayMallardDuck() {
        final Duck mallardDuck = new MallardDuck();
        assertEquals(Duck.QUACK, mallardDuck.quack());
        assertEquals(Duck.SWIM, mallardDuck.swim());
        assertEquals(MallardDuck.DISPLAY, mallardDuck.display());
    }


    @Test
    public void testDisplayRedheadDuck() {
        final Duck redheadDuck = new RedheadDuck();
        assertEquals(Duck.QUACK, redheadDuck.quack());
        assertEquals(Duck.SWIM, redheadDuck.swim());
        assertEquals(RedheadDuck.DISPLAY, redheadDuck.display());
    }
}
