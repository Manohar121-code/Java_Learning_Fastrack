package basics.programs;

import java.util.Scanner;

public class ArmStrongEx {
	public static void main(String[] args) {
//		int len = 4;
//		int armStrong = (1 pow len) + (2 pow len) + (3 pow len) + (4 pow len);
		System.out.println("enter the digit:");
		int n = new Scanner(System.in).nextInt();
		for (int i = 1; i <= n; i++) {
			int armStrong = getArmStrongNumber(i);
			if (i == armStrong) {
				System.out.println(i + " is a armstrong number");
			}
		}
		
	}
	
	public static int getArmStrongNumber(int n) {
		String inputStr = String.valueOf(n);
		int length = inputStr.length();
		int result = 0;
		while (n > 0) {
			int lastDigit = n % 10;
			result = result + (int) Math.pow(lastDigit, length);
			n = n / 10;
		}
		return result;
	}
}
