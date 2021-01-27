package basics.controlStatements;

public class ControlStatementsEx {
	public static void main(String[] args) {
		// ==, !=, <, >, <=, >=, ||, &&
		
		int i = 20;
		if (i == 20) {
			System.out.println("if condition executed");
		}
		System.out.println("-----------------------------------");
		if (i < 15) {
			System.out.println("if condition executed");
		} else {
			System.out.println("else condition executed");
		}
		System.out.println("---------------------------------");
		if (i < 20) {
			System.out.println("if condition executed");
		} else if (i > 20) {
			System.out.println("else if condition executed");
		} else {
			System.out.println("else condition executed");
		}
		System.out.println("----------------------------------");
		
		if (i < 18 || i == 20) {
			System.out.println("i < 18 || i == 20 - true");
		}
		System.out.println("----------------------------------");
		
		if (i > 18 && i == 20) {
			System.out.println("i > 18 && i == 20 - true");
		}
		
		System.out.println("----------------------------------");
		
		if (i < 45 && (i < 18 || i == 20)) {
			System.out.println("i < 45 && (i < 18 || i == 20) - true");
		} else {
			System.out.println("i < 45 && (i < 18 || i == 20) - false");
		}
		
	}
}
