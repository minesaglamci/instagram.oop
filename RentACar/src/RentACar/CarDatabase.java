package RentACar;

public class CarDatabase implements CarLogDao{

	@Override
	public void log(Car car) {
		System.out.println("Database'e loglandý");
		
	}

}
