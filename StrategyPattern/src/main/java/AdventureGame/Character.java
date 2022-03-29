package AdventureGame;

public abstract class Character {
    protected WeaponBehavior weapon;

    public Character(WeaponBehavior currentWeapon) {
        this.weapon = currentWeapon;
    }

    public void setWeapon(WeaponBehavior currentWeapon) {
        this.weapon = currentWeapon;
    }

    public abstract void fight();

}
