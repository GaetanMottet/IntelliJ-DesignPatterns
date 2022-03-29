package CarCompany.creators;

import CarCompany.products.Car;
import CarCompany.products.Pickup;

public class PickupCreator extends CarCreator {

    @Override
    public Car orderCar(String color) {
        return new Pickup(color);
    }
}
