package hfd.strategy.adventure_game;

public class BowAndArrowBehavior implements WeaponBehavior {

    public static final String WEAPON = "this is bow and arrow.";

    @Override
    public String useWeapon() {
        return WEAPON;
    }
}
