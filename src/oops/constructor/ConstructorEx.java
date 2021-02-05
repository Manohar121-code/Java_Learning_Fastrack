package oops.constructor;

public class ConstructorEx {
	public static void main(String[] args) {
		Student s1 = new Student();
		
		Student s2 = new Student(1, "Sathish");
		
		Student s3 = new Student(2, "vicky");
		
		System.out.println(s2.rollNum);
		System.out.println(s2.name);
		
		System.out.println(s3.name);
	}
}
