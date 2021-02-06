package oops.composition;

public class CompositionEx {
	public static void main(String[] args) {
		
		Battery motoBattery = new Battery("Moto", 2, 15);
		Camera motoCamera = new Camera(20, 100);
		
		Mobile motorola = new Mobile("JHD98932EWD", "Lenovo", "Android", motoBattery, motoCamera);
		
		System.out.println("********** Moto Mobile Specs **********");
		
		System.out.println("IMEI num - "+ motorola.getIMEINumber());
		System.out.println("Brand - "+ motorola.getBrandName());
		System.out.println("Oerating system - "+ motorola.getOs());
		
		System.out.println("***** Moto Battery specs ******");
		Battery battery = motorola.getBattery();
		System.out.println("Brand - "+ battery.getBrandName());
		System.out.println("Hours to charge - "+ battery.getHoursToCharge());
		System.out.println("Hours to live - "+ battery.getHoursToLive());
		
		System.out.println("******** Moto camera specs ********");
		Camera camera = motorola.getCamera();
		System.out.println("Front mp - "+ camera.getMegaPixelFront());
		System.out.println("rear mp - "+ camera.getMegaPixelRear());
	}
}
