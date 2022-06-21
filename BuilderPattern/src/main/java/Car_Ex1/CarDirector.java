package Car_Ex1;

public class CarDirector {
    private final CarBuilder carBuilder;

    public CarDirector(CarBuilder builder) {this.carBuilder = builder;}

    public void construct() {
        carBuilder.buildPower();
        carBuilder.buildEngine();
        carBuilder.buildBreaks();
        carBuilder.buildSeats();
        carBuilder.buildWindows();
        carBuilder.buildFuelType();

    }
}
