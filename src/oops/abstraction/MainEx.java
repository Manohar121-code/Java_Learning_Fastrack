package oops.abstraction;

public class MainEx {
	public static void main(String[] args) {
		InterfacAImplementation objOld = new InterfacAImplementation();
		objOld.test();
		objOld.test2();
		
		System.out.println("----------");
		
		InterfaceA obj = new InterfacAImplementation();
		obj.test();
		obj.test2();
	}
}
