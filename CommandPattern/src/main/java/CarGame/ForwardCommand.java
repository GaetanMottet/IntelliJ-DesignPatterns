package CarGame;

public class ForwardCommand implements Command{
    @Override
    public void puschKey(int key) {
        System.out.println("My car is moving forward");
    }

    @Override
    public void undo() {
        System.out.println("My car stops moving forward");
    }
}
