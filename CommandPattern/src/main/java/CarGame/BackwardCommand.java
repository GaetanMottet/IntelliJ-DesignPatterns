package CarGame;

public class BackwardCommand implements Command{

    private Car myCar;

    public BackwardCommand(Car car){
        this.myCar = car;
    }
    @Override
    public void puschKey() {
        myCar.backward();
    }

    @Override
    public void undo() {
        myCar.forward();
    }
}
