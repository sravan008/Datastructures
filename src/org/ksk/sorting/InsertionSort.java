package org.ksk.sorting;

import java.util.Arrays;

public class InsertionSort {

	private int[] insertionSort(int[] inArray) {

		int n = inArray.length;
		for (int i = 1; i < n; ++i) {
			int key = inArray[i];
			int j = i - 1;
			while (j >= 0 && inArray[j] > key) {
				inArray[j + 1] = inArray[j];
				j = j - 1;
			}
			inArray[j + 1] = key;
		}
		return inArray;
	}

	public static void main(String[] args) {

		InsertionSort insertionSort = new InsertionSort();
		ReadArray array = new ReadArray();
		int[] inArray = array.getIntArray(); // Reading input Array
		int[] sortedArray = insertionSort.insertionSort(inArray);
		System.out.println(Arrays.toString(sortedArray));
	}

}
