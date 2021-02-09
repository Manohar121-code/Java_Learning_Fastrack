package oops.constructorChaining;

public class CCEx {
	public static void main(String[] args) {
		
		Child c1 = new Child();
		c1.m1();
		
		
		Child c2 = new Child(10);
		c2.m1();
	}
}
