package Car_Ex1;

public abstract class CarBuilder {
    protected Car car;

    public void creatNewCar(String carType) {this.car = new Car(carType);}

    public abstract void buildPower();
    public abstract void buildEngine();
    public abstract void buildBreaks();
    public abstract void buildSeats();
    public abstract void buildWindows();
    public abstract void buildFuelType();

    public Car getResult() {return car;}

}
