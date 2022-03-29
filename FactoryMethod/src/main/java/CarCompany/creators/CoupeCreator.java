package CarCompany.creators;

import CarCompany.products.Car;
import CarCompany.products.Coupe;

public class CoupeCreator extends CarCreator {

    @Override
    public Car orderCar(String color) {
        return new Coupe(color);
    }
}
