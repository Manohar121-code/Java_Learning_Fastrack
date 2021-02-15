package oops.privateStaticFinalClassCastingEx;

public class Parent {
	
	public void m1() {
		System.out.println("Parent m1() called");
	}
	
	public void m2() {
		System.out.println("Parent m2() called");
	}
	
	private void privateMethod() {
		System.out.println("Parent privateMethod() called");
	}
	
	public final void finalMethod() {
		System.out.println("Parent finalMethod() called");
	}
	
	public static void staticMethod() {
		System.out.println("Parent staticMethod() called");
	}
}
