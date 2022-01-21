package RentACar;
public class CarMsSqlDao implements CarDao {

	@Override
	public void add(Car car) {
		System.out.println("Ms Sql'e eklendi");
		
	}

	@Override
	public void update(Car car) {
		System.out.println("Ms Sql'e güncellendi");
		
	}

	@Override
	public void delete(Car car) {
		System.out.println("Ms Sql'den silindi");
		
	}
	

}
