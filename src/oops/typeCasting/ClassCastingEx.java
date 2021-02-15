package oops.typeCasting;

public class ClassCastingEx {
	public static void main(String[] args) {
		Parent obj = new Child();  //up casting
		obj.m1();
		obj.m2();
		
//		obj.m3();
		
//		Child child = new Parent();
		if (obj instanceof Child) {
			Child c1 = (Child) obj; //down casting
			c1.m1();
			c1.m3();
		}
		System.out.println("---------------");
	}
}
