package oops.multipleInheritance;

public class MultipleInheritanceEx {
	public static void main(String[] args) {
		InterfaceA obj1 = new ChildImpl();
		obj1.m1();
		
		InterfaceB obj2 = new ChildImpl();
		obj2.m1();
	}
}
