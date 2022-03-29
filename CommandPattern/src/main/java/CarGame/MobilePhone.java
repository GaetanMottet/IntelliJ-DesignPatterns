package CarGame;

public class MobilePhone {
    public static void main(String[] args) {
        Game game = new Game();

        // TODO SETUP

        game.pushKey(2);
        game.pushKey(2);
        game.pushKey(3);
        game.pushKey(2);
        game.pushKey(0);
        game.pushKey(1);
        game.undo();
    }
}
