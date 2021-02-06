package oops.composition;

public class Battery {
	private String brandName;
	private int hoursToCharge;
	private int hoursToLive;

	public Battery(String brandName, int hoursToCharge, int hoursToLive) {
		super();
		this.brandName = brandName;
		this.hoursToCharge = hoursToCharge;
		this.hoursToLive = hoursToLive;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getHoursToCharge() {
		return hoursToCharge;
	}

	public void setHoursToCharge(int hoursToCharge) {
		this.hoursToCharge = hoursToCharge;
	}

	public int getHoursToLive() {
		return hoursToLive;
	}

	public void setHoursToLive(int hoursToLive) {
		this.hoursToLive = hoursToLive;
	}

}
