package oops.blocks;

public class Student {

	int id;
	String name;
	
	static {
		System.out.println("hey i'm from static block");
	}
	
	{
		System.out.println("I'm from non-static block");
	}
	
}
