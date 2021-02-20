package oops.encapsulation.singletonClass;

public class Sample {
	
	static Sample instance;
	
	private Sample() {
		
	}
	
	public static Sample getInstance() {
		
		if (instance == null) {
			instance = new Sample();
		}
		
		return instance;
	}
}
