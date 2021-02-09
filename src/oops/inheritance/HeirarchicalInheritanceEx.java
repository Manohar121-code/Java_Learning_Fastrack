package oops.inheritance;

public class HeirarchicalInheritanceEx {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.m1();
		System.out.println("----------");
		Child c1 = new Child();
		c1.m1();
		c1.m2();
		System.out.println("----------");
		AnotherChild c2 = new AnotherChild();
		c2.m1();
		c2.m4();
	}
}
