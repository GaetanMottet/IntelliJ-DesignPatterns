package AdventureGame;

public class Queen extends Character{

    public Queen(WeaponBehavior myWeapon) {
        super(myWeapon);
    }

    @Override
    public void fight() {
        System.out.print("The Queen is");
        weapon.useWeapon();
    }
}
