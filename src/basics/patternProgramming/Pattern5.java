package basics.patternProgramming;

import java.util.Scanner;

public class Pattern5 {
//1
//12
//123
//1234
//12345
	
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("enter length");
		int n = scr.nextInt();
		int i;
		for (i = 1; i <= n; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
	}
}
