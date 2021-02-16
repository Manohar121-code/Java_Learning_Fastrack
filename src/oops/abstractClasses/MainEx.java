package oops.abstractClasses;

public class MainEx {
	public static void main(String[] args) {
		Parent obj = new Child();

		obj.m1();

		obj.test();

		printIt(obj);
	}

	private static void printIt(Parent obj) {
		obj.m1();

		obj.test();
	}
}
