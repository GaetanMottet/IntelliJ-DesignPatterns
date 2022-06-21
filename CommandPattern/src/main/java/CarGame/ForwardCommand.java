package CarGame;

public class ForwardCommand implements Command{

    private Car myCar;

    public ForwardCommand(Car car) {
        this.myCar = car;
    }

    @Override
    public void puschKey() {
        myCar.forward();
    }

    @Override
    public void undo() {
        myCar.backward();
    }
}
