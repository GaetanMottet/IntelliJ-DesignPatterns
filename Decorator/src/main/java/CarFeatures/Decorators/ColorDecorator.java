package CarFeatures.Decorators;

import CarFeatures.Components.Car;

public class ColorDecorator extends Decorator {
    public ColorDecorator(Car myCar) {
        super(myCar);
    }

    @Override
    public String getDescription() {
        return myCar.getDescription() + " +Color";
    }

    @Override
    public double getCost() {
        return myCar.getCost() + 1500;
    }

    @Override
    public int getSecurityLevel() {
        return myCar.getSecurityLevel();
    }
}
