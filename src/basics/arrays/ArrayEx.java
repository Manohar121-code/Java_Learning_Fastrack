package basics.arrays;

import java.util.Scanner;

public class ArrayEx {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of an array:");
		int size = s.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("enter some value for index - "+ i);
			int val = s.nextInt();
			arr[i] = val;
		}
		
		for (int j = 0; j < arr.length; j++) {
			System.out.println(j + " - value: "+ arr[j]);
		}
	}
}
