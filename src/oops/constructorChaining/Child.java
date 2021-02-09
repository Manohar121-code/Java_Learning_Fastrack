package oops.constructorChaining;

public class Child extends Parent {
	
	public Child() {
		super();
		System.out.println("Child constructor called");
	}
	
	public Child(int i) {
		super(i);
		System.out.println("Child constructor2 called");
	}
	
	public void m2() {
		System.out.println("Child m2() called");
	}
}
