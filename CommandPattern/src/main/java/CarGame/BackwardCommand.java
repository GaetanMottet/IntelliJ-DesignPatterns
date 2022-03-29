package CarGame;

public class BackwardCommand implements Command{
    @Override
    public void puschKey(int key) {
        System.out.println("My car is backing up");
    }

    @Override
    public void undo() {
        System.out.println("My car stops to backing up");
    }
}
