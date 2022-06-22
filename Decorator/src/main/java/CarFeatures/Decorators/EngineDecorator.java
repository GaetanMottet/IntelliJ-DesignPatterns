package CarFeatures.Decorators;

import CarFeatures.Components.*;

public class EngineDecorator extends Decorator {

    private Car car = null;
    public EngineDecorator(Car myCar) {
        super(myCar);
        this.car = myCar;
    }

    @Override
    public String getDescription() {
        return this.car.getDescription() + " +Engine";
    }

    @Override
    public double getCost() {
        return this.car.getCost() + 2500;
    }

    @Override
    public int getSecurityLevel() {
        return this.car.getSecurityLevel() +1;
    }
}
