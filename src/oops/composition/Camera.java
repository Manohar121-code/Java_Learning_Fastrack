package oops.composition;

public class Camera {
	private int megaPixelFront;
	private int megaPixelRear;
	
	public Camera(int megaPixelFront, int megaPixelRear) {
		super();
		this.megaPixelFront = megaPixelFront;
		this.megaPixelRear = megaPixelRear;
	}

	public int getMegaPixelFront() {
		return megaPixelFront;
	}

	public void setMegaPixelFront(int megaPixelFront) {
		this.megaPixelFront = megaPixelFront;
	}

	public int getMegaPixelRear() {
		return megaPixelRear;
	}

	public void setMegaPixelRear(int megaPixelRear) {
		this.megaPixelRear = megaPixelRear;
	}

}
