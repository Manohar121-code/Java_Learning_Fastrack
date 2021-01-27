package basics.controlStatements;

import java.util.Scanner;

public class VoterCheck {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("please enter age");
		int age = scr.nextInt();
		
		if (age >= 18) {
			System.out.println("person is eligible for vote");
		} else {
			System.out.println("person is not eligible for vote");
		}
	}
}
