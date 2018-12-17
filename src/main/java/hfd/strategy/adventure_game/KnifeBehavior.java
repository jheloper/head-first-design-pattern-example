package hfd.strategy.adventure_game;

public class KnifeBehavior implements WeaponBehavior {

    public static final String WEAPON = "this is knife.";

    @Override
    public String useWeapon() {
        return WEAPON;
    }
}
