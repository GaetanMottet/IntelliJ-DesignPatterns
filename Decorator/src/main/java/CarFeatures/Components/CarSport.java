package CarFeatures.Components;

public class CarSport extends Car {
    public CarSport() {
        this.description = "Sport";
    }

    @Override
    public double getCost() {
        return 20000;
    }

    @Override
    public int getSecurityLevel() {
        return 0;
    }
}
