package AdventureGame;

public class Test {
    public static void main(String[] args) {
        Character queen = new Queen(new KnifeBehavior());
        queen.fight();
        queen.setWeapon(new BowAndArrowBehavior());
        queen.fight();
    }
}
