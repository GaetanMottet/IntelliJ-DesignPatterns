package CarFeatures.Components;

public class CarBreak extends Car {

    public CarBreak() {
        this.description = "Break";
    }

    @Override
    public double getCost() {
        return 15000;
    }

    @Override
    public int getSecurityLevel() {
        return 0;
    }
}
