package oops.privateStaticFinalClassCastingEx;

public class MainEx {
	public static void main(String[] args) {
		Parent obj = new Child();
		obj.m1();
		obj.m2();
		
		obj.finalMethod();
		
		obj.staticMethod();
	}
}
