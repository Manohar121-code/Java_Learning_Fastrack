package oops.methodOverloading;

public class StudentRegistration {

	public Student register() {
		System.out.println("registering dummy student");
		return register(0, null);
	}
	
	public Student register(int rollNum) {
		System.out.println("registering student with rollnum - "+ rollNum);
		return register(rollNum, null);
	}
	
	public Student register(String name) {
		System.out.println("registering student with name - "+ name);
		Student stu = register(0, name);
		return stu;
	}
	
	public Student register(int rollNum, String name) {
		Student s1 = new Student(rollNum, name);
		//save s1 to db
		System.out.print("registation is done successfully ");
		System.out.print("for rollNum - "+ rollNum+" ");
		System.out.println("and name - "+ name);
		return s1;
	}
}
