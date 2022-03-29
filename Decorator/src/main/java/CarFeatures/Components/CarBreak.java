package CarFeatures.Components;

public class CarBreak extends Car {
    @Override
    public String getDescription() {
        return "Break";
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
