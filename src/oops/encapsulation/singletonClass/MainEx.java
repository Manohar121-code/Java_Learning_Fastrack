package oops.encapsulation.singletonClass;

public class MainEx {
	public static void main(String[] args) {
		Sample instance1 = Sample.getInstance();
		System.out.println(instance1);
		
		Sample instance2 = Sample.getInstance();
		System.out.println(instance2);
	}
}
