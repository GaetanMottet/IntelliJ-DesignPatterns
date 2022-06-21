package Car_Ex1;

public interface CarBuilder {

    public void buildPower();
    public void buildEngine();
    public void buildBreaks();
    public void buildSeats();
    public void buildWindows();
    public void buildFuelType();

    public Car getCar();

}
