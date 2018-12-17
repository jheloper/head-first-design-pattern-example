package hfd.strategy.adventure_game;

public class Character {

    public WeaponBehavior weapon;

    public String fight() {
        return weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
