package Car_Ex1;

public class BerlinCar extends CarBuilder{
    @Override
    public void buildPower() {
        System.out.println("Build Medium Power");
        car.setPower("Medium Power");
    }

    @Override
    public void buildEngine() {
        System.out.println("Build Classical Engine");
        car.setEngine("ClassicalEngine");
    }

    @Override
    public void buildBreaks() {
        System.out.println("Build classical Breaks");
        car.setBreaks("Classical breaks");
    }

    @Override
    public void buildSeats() {
        System.out.println("Build Classical seats");
        car.setSeats("Classical seats");
    }

    @Override
    public void buildWindows() {
        System.out.println("no special windows");
        //let a method empty if we need nothing
    }

    @Override
    public void buildFuelType() {
        System.out.println("Build Unlead Petrol");
        car.setFuelType("Unlead Petrol");
    }
}
