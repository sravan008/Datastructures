package org.ksk.sorting;

import java.util.Arrays;

public class SelectionSort {

	/**
	 * [5,4,3,1,2] 1.first iteration min is 3rd position after that swap [1,4,3,5,2]
	 * 2.second iteration min is 4th position after that swap [1,2,3,5,4]
	 */
	public int[] sort(int[] inArray) {

		for (int i = 0; i < inArray.length - 1; i++) {
			int min = i; // min variable use to save the min value
			for (int j = i + 1; j < inArray.length; j++) {
				if (inArray[j] < inArray[min])
					min = j; 
			}
			int temp = inArray[min];
			inArray[min] = inArray[i];
			inArray[i] = temp;
		}
		return inArray;
	}

	public static void main(String[] args) {

		ReadArray array = new ReadArray();
		SelectionSort selectionSort = new SelectionSort();
		int[] inArray = array.getIntArray(); // Reading input Array
		int[] sortedArray = selectionSort.sort(inArray);
		System.out.println(Arrays.toString(sortedArray));
	}

}
