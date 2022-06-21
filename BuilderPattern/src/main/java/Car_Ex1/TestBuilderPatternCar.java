package Car_Ex1;

public class TestBuilderPatternCar {
    public static void main(String[] args) {
        CarBuilder carBuilder = new BerlinCar();
        CarDirector director = new CarDirector(carBuilder);
        director.construct();
        Car car = carBuilder.getCar();
        System.out.println(car);

        carBuilder = new SportCar();
        director = new CarDirector(carBuilder);
        director.construct();
        car = carBuilder.getCar();
        System.out.println(car);
    }

}


