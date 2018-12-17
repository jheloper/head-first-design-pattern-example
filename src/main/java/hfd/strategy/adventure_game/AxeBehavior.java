package hfd.strategy.adventure_game;

public class AxeBehavior implements WeaponBehavior {

    public static final String WEAPON = "this is axe.";

    @Override
    public String useWeapon() {
        return WEAPON;
    }
}
