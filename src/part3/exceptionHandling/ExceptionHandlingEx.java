package part3.exceptionHandling;

import java.util.Scanner;

public class ExceptionHandlingEx {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("enter a digit to divide the number 200");
		int n = 200;
		int dividingNum = scr.nextInt();
		if (dividingNum == 0) {
			System.out.println("dividing number can't be zero");
		} else {
			int result = n / dividingNum;
			System.out.println(result);
		}
		System.out.println("Main ended");
	}
}
