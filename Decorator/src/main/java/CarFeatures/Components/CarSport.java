package CarFeatures.Components;

public class CarSport extends Car {
    @Override
    public String getDescription() {
        return "Sport";
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
