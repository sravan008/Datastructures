package org.ksk.sorting;

import java.util.Arrays;

public class BubbleSort {

	private int[] bubbleSort(int inArray[]) {
		
		for (int i = inArray.length - 1; i >= 0; i--) {
			for (int j = 0; j <= i - 1; j++) {
				if (inArray[j] > inArray[j + 1]) {
					int temp = inArray[j];
					inArray[j] = inArray[j + 1];
					inArray[j + 1] = temp;
				}
			}
		}
		return inArray;
	}

	public static void main(String[] args) {
		ReadArray array = new ReadArray();
		BubbleSort bubbleSort = new BubbleSort();
		int[] inArray = array.getIntArray(); // Reading input Array
		int[] sortedArray = bubbleSort.bubbleSort(inArray);
		
		// printing 
		Arrays.asList(inArray).forEach(s -> System.out.println(s));
		System.out.println(Arrays.toString(sortedArray));
	}

}
