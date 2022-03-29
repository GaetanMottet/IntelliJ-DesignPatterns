package CarFeatures.Decorators;

import CarFeatures.Components.Car;

public class AntiSlidingSystemDecorator extends Decorator {
    public AntiSlidingSystemDecorator(Car myCar) {
        super(myCar);
    }

    @Override
    public String getDescription() {
        return myCar.getDescription() + " +ASSD";
    }

    @Override
    public double getCost() {
        return myCar.getCost() + 1000;
    }

    @Override
    public int getSecurityLevel() {
        return myCar.getSecurityLevel() +1;
    }
}
