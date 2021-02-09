package oops.constructorChaining;

public class Parent {
	
	private int i;
	
	public Parent() {
		System.out.println("Parent constructor called");
	}
	
	public Parent(int i) {
		this.i = i;
		System.out.println("Parent constructor2 called");
	}
	
	public void m1() {
		System.out.println("Parent m1() called, i value - "+ i);
	}
}
