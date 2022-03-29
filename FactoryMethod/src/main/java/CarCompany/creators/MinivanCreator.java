package CarCompany.creators;

import CarCompany.products.Car;
import CarCompany.products.Minivan;

public class MinivanCreator extends CarCreator {

    @Override
    public Car orderCar(String color) {
        return new Minivan(color);
    }
}
