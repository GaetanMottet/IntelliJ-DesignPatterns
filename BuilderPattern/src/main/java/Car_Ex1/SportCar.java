package Car_Ex1;

import Car_Ex1.CarBuilder;

public class SportCar extends CarBuilder {
    @Override
    public void buildPower() {
        System.out.println("Build High Power");
        car.setPower("High Power");
    }

    @Override
    public void buildEngine() {
        System.out.println("Build Sport Engine");
        car.setEngine("SportEngine");
    }

    @Override
    public void buildBreaks() {
        System.out.println("Build Sport Breaks");
        car.setBreaks("Sport breaks");
    }

    @Override
    public void buildSeats() {
        System.out.println("Build Sport seats");
        car.setSeats("Sport seats");
    }

    @Override
    public void buildWindows() {
        System.out.println("Build black windows");
        car.setWindows("Black windows");
    }

    @Override
    public void buildFuelType() {
        System.out.println("Build Unlead Petrol");
        car.setFuelType("Unlead Petrol");
    }
}
