package CarFeatures.Decorators;

import CarFeatures.Components.Car;

public class AirbagDecorator extends Decorator{
    public AirbagDecorator(Car myCar) {
        super(myCar);
    }

    @Override
    public String getDescription() {
        return myCar.getDescription() + " +AirbagSystem" ;
    }

    @Override
    public double getCost() {
        return myCar.getCost() + 2000;
    }

    @Override
    public int getSecurityLevel() {
        return myCar.getSecurityLevel()+1;
    }
}
