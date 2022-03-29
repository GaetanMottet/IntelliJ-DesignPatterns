package CarCompany.creators;

import CarCompany.products.Car;

public abstract class CarCreator {
    abstract public Car orderCar(String color);
}
