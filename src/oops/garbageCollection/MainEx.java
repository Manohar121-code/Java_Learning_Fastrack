package oops.garbageCollection;

public class MainEx {
	public static void main(String[] args) {
		Sample obj1 = new Sample(10, "Sachin");
		obj1 = null;
		System.gc();
		
		System.out.println("----------------------");
		
		Sample obj2 = new Sample(20, "xyz");
		obj2 = new Sample(30, "abc");
		
		System.out.println("---------------------");
		
		Sample o1 = new Sample(1, "test");
		Sample o2 = new Sample(2, "test2");
		
		System.out.println(o1);
		System.out.println(o2);
		System.out.println("After swap");
		
		o1 = o2;
		
		System.out.println(o1);
		System.out.println(o2);
		
		if (o1 == o2) {
			System.out.println("both are referred to same object");
		}
	}
}
