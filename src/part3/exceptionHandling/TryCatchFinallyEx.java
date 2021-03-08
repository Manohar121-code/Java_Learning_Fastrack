package part3.exceptionHandling;

import part3.collections.treeset.Student;

public class TryCatchFinallyEx {
	public static void main(String[] args) {
		Student student = null;
		try {
			String name = student.getName();
			System.out.println("name - "+ name);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception occurred");
//		} catch (NullPointerException e) {
//			System.out.println("Null pointer exception occurred");
		} finally {
			System.out.println("I'll execute for sure");
		}
	}
}
