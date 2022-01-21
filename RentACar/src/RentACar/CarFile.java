package RentACar;

public class CarFile implements CarLogDao {

	@Override
	public void log(Car car) {
		System.out.println("File'a loglandý");
		
	}

}
