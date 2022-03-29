public class TestBuilderPattern {

	public static void main(String[] args) {
		CarBuilder carBuilder = new BerlinCarBuilder();
		CarDirector director = new CarDirector(carBuilder);
		director.construct();
		Car car = carBuilder.getCar();
		System.out.println(car);
		
		carBuilder = new SportsCarBuilder();
		director = new CarDirector(carBuilder);
		director.construct();
		car = carBuilder.getCar();
		System.out.println(car);
	}

}
