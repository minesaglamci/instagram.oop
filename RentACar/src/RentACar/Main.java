package RentACar;
public class Main {

	public static void main(String[] args) {
		Car car = new Car(1, "Renault",new CarBrand(1,"Ford"), new CarColor(2,"Blue"));
		CarManager manager = new CarManager(new CarOracleDao(),new CarFile());

		manager.add(car);
		
	}

}
//youtube videosunu izleyip java'sýný yazmak