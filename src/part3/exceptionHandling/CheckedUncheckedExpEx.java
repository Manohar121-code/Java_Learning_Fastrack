package part3.exceptionHandling;

import java.io.IOException;

public class CheckedUncheckedExpEx {
	public static void main(String[] args) {
		System.out.println("Main started");
		try {
			throwCheckedExpLayer1(15);
		} catch (IOException e) {
			System.out.println("Checked exp occurred");
		}
		System.out.println("Main Ended");
	}

	private static void throwCheckedExpLayer1(int age) throws IOException {
		throwCheckedExpLayer2(age);
	}

	private static void throwCheckedExpLayer2(int age) throws IOException {
		if (age < 18) {
			throw new IOException();
		}
	}
}
