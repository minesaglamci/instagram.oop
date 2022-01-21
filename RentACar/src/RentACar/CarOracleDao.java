package RentACar;
public class CarOracleDao implements CarDao {

	@Override
	public void add(Car car) {
		System.out.println("Oracle'a eklendi");
		
	}

	@Override
	public void update(Car car) {
		System.out.println("Oracle'a güncellendi");
		
	}

	@Override
	public void delete(Car car) {
		System.out.println("Oracle'dan silindi");
		
	}

}
