package basics.patternProgramming;

import java.util.Scanner;

public class Pattern6 {

//12345 - i = 1, space = 0
// 2345 - i = 2, space = 1
//  345 - i = 3, space = 2
//   45 - i = 4, space = 3
//    5 - i = 5, space = 4

	public static void main(String[] args) {
		System.out.println("enter a digit:");
		int n = new Scanner(System.in).nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= i-1; j++) {
				System.out.print(" ");
			}
			
			for (int j = i; j <= n; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
