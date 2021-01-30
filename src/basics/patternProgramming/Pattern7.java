package basics.patternProgramming;

import java.util.Scanner;

public class Pattern7 {
	// n = 5
//    *      i = 1  space = 4  star = 1(2*i - 1)
//   ***     i = 2  space = 3  star = 3
//  *****    i = 3  space = 2  star = 5
// *******   i = 4  space = 1  star = 7
//*********  i = 5  space = 0  star = 9
	public static void main(String[] args) {
		System.out.println("enter a digit:");
		int n = new Scanner(System.in).nextInt();
		
		//rows
		for (int i = 1; i <= n; i++) {
			
			//spaces
			for (int j = 1; j <= (n-i); j++) {
				System.out.print(" ");
			}
			
			//stars
			for (int j = 1; j <= ((2 * i) - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
