package oops.inheritance;

public class MultiLevelInheritanceEx {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.m1();
		System.out.println("------------");
		Child c = new Child();
		c.m1();
		c.m2();
		System.out.println("------------");
		SubChild s1 = new SubChild();
		s1.m1();
		s1.m2();
		s1.m3();
	}
}
