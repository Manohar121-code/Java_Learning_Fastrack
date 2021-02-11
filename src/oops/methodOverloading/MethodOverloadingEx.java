package oops.methodOverloading;

public class MethodOverloadingEx {
	public static void main(String[] args) {
		StudentRegistration studReg = new StudentRegistration();
		Student dummyStu = studReg.register();
		dummyStu.printStudent();
		
		Student stuWithRoll = studReg.register(1);
		stuWithRoll.printStudent();
		
		Student stuWithName = studReg.register("Madhu");
		stuWithName.printStudent();
		
		Student student = studReg.register(2, "Arjun");
		student.printStudent();
	}
	
}
