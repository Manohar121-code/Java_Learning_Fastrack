package oops.privateStaticFinalClassCastingEx;

public class Child extends Parent {
	public void m1() {
		System.out.println("Child m1() called");
	}
	
	public void m3() {
		System.out.println("Child m3() called");
	}
	
//	public final void finalMethod() {
//		System.out.println("Parent finalMethod() called");
//	}
	
	public static void staticMethod() {
		System.out.println("Child staticMethod() called");
	}
}
