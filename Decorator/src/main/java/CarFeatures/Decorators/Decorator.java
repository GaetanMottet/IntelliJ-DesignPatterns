package CarFeatures.Decorators;

import CarFeatures.Components.*;

public abstract class Decorator extends Car {
    Car myCar ;

    public Decorator(Car myCar) {
        this.myCar = myCar;
    }

//    @Override
//    public String getDescription() {
//        return myCar.getDescription();
//    }
//
//    @Override
//    public double getCost() {
//        return myCar.getCost();
//    }
//
//    @Override
//    public int getSecurityLevel() {
//        return myCar.getSecurityLevel();
//    }
}
