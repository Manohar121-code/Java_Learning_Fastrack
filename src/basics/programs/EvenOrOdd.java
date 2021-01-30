package basics.programs;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		System.out.println("enter a digit:");
		int n = new Scanner(System.in).nextInt();
		int rem = n % 2;
		if (rem == 0) {
			System.out.println(n + " is a even number");
		} else {
			System.out.println(n + " is a odd number");
		}
	}
}
