package CarFeatures.Components;

public class CarBerlin extends Car{
    public CarBerlin() {
        this.description = "Berlin";
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
