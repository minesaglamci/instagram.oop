package RentACar;
public class CarManager implements CarService {
	private CarDao carDao;
	private CarLogDao carLogDao;
	
	public CarManager() {
		super();
	}
	

	public CarManager(CarDao carDao, CarLogDao carLogDao) {
		super();
		this.carDao = carDao;
		this.carLogDao = carLogDao;
	}


	@Override
	public void add(Car car) {
		if(car.getName()=="BMW") {
			this.carLogDao.log(car);
		}
		else {
			this.carDao.add(car);
		}
		
	}

	@Override
	public void update(Car car) {
		System.out.println("Güncellendi");
		
	}

	@Override
	public void delete(Car car) {
		System.out.println("Silindi");
		
	}

}
