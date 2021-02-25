package part3.arrays;

import java.util.Scanner;

public class TwoDimensionArray {
	public static void main(String[] args) {
		int[] arrOld = new int[5]; // 1 dimensional array
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = scr.nextInt();
		System.out.println("Enter number of cols");
		int cols = scr.nextInt();
		
		int[][] arr = new int[rows][cols]; // 2D Array
		
		System.out.println("*************************************");
		System.out.println("SETTING THE VALUES TO 2D ARRAY");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				
				System.out.println("enter a digit for "+ i + " - " +j);
				arr[i][j] = scr.nextInt();
				
			}
		}
		System.out.println("*************************************");
		
		System.out.println("READING THE VALUES FROM 2D ARRAY");
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
//		arrOld[0] = 10;
//		arr[0][1] = 20;
//		
//		int i = arrOld[0];
//		int i2 = arr[0][1];
		
	}
}
