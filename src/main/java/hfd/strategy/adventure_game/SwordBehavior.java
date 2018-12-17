package hfd.strategy.adventure_game;

public class SwordBehavior implements WeaponBehavior {

    public static final String WEAPON = "this is sword.";

    @Override
    public String useWeapon() {
        return WEAPON;
    }
}
