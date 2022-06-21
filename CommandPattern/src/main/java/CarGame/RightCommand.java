package CarGame;

public class RightCommand implements Command{

    private Car myCar;

    public RightCommand(Car car){
        this.myCar = car;
    }

    @Override
    public void puschKey() {
        myCar.right();
    }

    @Override
    public void undo() {
        myCar.left();
    }
}
