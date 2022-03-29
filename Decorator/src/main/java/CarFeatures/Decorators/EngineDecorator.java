package CarFeatures.Decorators;

import CarFeatures.Components.Car;
import CarFeatures.Decorators.Decorator;

public class EngineDecorator extends Decorator {
    public EngineDecorator(Car myCar) {
        super(myCar);
    }

    @Override
    public String getDescription() {
        return myCar.getDescription() + " +Engine";
    }

    @Override
    public double getCost() {
        return myCar.getCost() + 2500;
    }

    @Override
    public int getSecurityLevel() {
        return myCar.getSecurityLevel() +1;
    }
}
