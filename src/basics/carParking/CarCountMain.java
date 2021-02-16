package basics.carParking;

public class CarCountMain {
	public static void main(String[] args) {
		
		CarParkingSlot c1 = new CarParkingSlot(1234, "swift");
		System.out.println(CarParkingSlot.count);
		
		
		CarParkingSlot c2 = new CarParkingSlot(5678, "duster");
		System.out.println(CarParkingSlot.count);
		
		
		CarParkingSlot c3 = new CarParkingSlot(1256, "ferrari");
		System.out.println(CarParkingSlot.count);
		
	}
}
