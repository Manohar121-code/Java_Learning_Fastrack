package basics.carParking;

public class CarParkingSlot {

	private int carNum;
	private String brand;
	
	static int count = 0;
	
	public CarParkingSlot(int carNum, String brand) {
		this.carNum = carNum;
		this.brand = brand;
		count++;
	}
	
}
