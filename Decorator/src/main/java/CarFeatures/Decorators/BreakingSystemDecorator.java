package CarFeatures.Decorators;

import CarFeatures.Components.Car;

public class BreakingSystemDecorator extends Decorator {
    public BreakingSystemDecorator(Car myCar) {
        super(myCar);
    }

    @Override
    public String getDescription() {
        return myCar.getDescription() + " +BSD";
    }

    @Override
    public double getCost() {
        return myCar.getCost() + 700;
    }

    @Override
    public int getSecurityLevel() {
        return myCar.getSecurityLevel() +1;
    }
}
