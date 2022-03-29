package CarGame;

import javax.sound.midi.Receiver;

public class LeftCommand implements Command{
    private Receiver receiver;
    @Override
    public void puschKey(int key) {
        System.out.println("My car turns left");
    }

    @Override
    public void undo() {
        System.out.println("My car stops turning left");
    }
}
