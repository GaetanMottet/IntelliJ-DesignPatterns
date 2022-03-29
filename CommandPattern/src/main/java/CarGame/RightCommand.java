package CarGame;

public class RightCommand implements Command{
    @Override
    public void puschKey(int key) {
        System.out.println("My car turns right");
    }

    @Override
    public void undo() {
        System.out.println("My car stops turning right");
    }
}
