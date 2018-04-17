package org.ksk.sorting;

import java.util.Scanner;

public class ReadArray {

	public int[] getIntArray() {
 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input size :");
		int input = sc.nextInt();
		int inArray[] = new int[input];
		for (int i = 0; i < input; i++) {
			System.out.println("Enter a number : \n");
			inArray[i] = sc.nextInt();
		}
		return inArray;
	}

}
