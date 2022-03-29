package CarFeatures.Components;

public class CarBerlin extends Car {
    public CarBerlin() {
    }


    @Override
    public String getDescription() {
        return "Berlin";
    }

    @Override
    public double getCost() {
        return 17000;
    }

    @Override
    public int getSecurityLevel() {
        return 0;
    }
}
