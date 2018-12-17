package hfd.strategy.adventure_game;

import org.junit.Assert;
import org.junit.Test;

public class CharacterTest {

    @Test
    public void testUseWeaponOfKing() {
        final Character king = new King();
        Assert.assertEquals(BowAndArrowBehavior.WEAPON, king.fight());
    }


    @Test
    public void testUseWeaponOfQueen() {
        final Character queen = new Queen();
        Assert.assertEquals(KnifeBehavior.WEAPON, queen.fight());
    }


    @Test
    public void testUseWeaponOfKnight() {
        final Character knight = new Knight();
        Assert.assertEquals(SwordBehavior.WEAPON, knight.fight());
    }


    @Test
    public void testUseWeaponOfTroll() {
        final Character troll = new Troll();
        Assert.assertEquals(AxeBehavior.WEAPON, troll.fight());
    }
}
