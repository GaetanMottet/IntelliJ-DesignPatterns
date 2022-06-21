package CarGame;

import javax.sound.midi.Receiver;

public class LeftCommand implements Command{
    private Car myCar;

    public LeftCommand(Car car){
        this.myCar = car;
    }

    @Override
    public void puschKey() {
        myCar.left();
    }

    @Override
    public void undo() {
        myCar.right();
    }
}
