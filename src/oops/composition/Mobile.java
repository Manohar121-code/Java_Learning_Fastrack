package oops.composition;

public class Mobile {
	private String IMEINumber;
	private String brandName;
	private String os;
	private Battery battery;
	private Camera camera;

	public Mobile(String iMEINumber, String brandName, String os, Battery battery, Camera camera) {
		super();
		this.IMEINumber = iMEINumber;
		this.brandName = brandName;
		this.os = os;
		this.battery = battery;
		this.camera = camera;
	}

	public String getIMEINumber() {
		return IMEINumber;
	}

	public void setIMEINumber(String iMEINumber) {
		IMEINumber = iMEINumber;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public Camera getCamera() {
		return camera;
	}

	public void setCamera(Camera camera) {
		this.camera = camera;
	}

}
