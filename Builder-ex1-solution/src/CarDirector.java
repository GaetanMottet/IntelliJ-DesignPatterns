public class CarDirector {
	
	private final CarBuilder carBuilder;
	
	public CarDirector(CarBuilder carBuilder){
		this.carBuilder = carBuilder;
	}

	public void construct(){
		carBuilder.buildPower();
		carBuilder.buildEngine();
		carBuilder.buildBreaks();
		carBuilder.buildSeats();
		carBuilder.buildWindows();
		carBuilder.buildFuelType();
	}
}
