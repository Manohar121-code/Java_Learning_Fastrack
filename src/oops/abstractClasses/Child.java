package oops.abstractClasses;

public class Child extends Parent {
	public void m1() {
		System.out.println("Child m1() called");
	}
	
	public void m3() {
		System.out.println("Child m3() called");
	}

	@Override
	public void test() {
		System.out.println("Child test() called");
	}
}
