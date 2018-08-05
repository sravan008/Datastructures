package org.ksk.search;

public class BinarySearch { 

	
	private int find(int[] a, int x) {
		
		int left=0;
		int right = a.length;
		
		while(left<=right) {
			
			int mid = (left+right)/2;
			if(x<a[mid]) right = mid-1;
			else if(x>a[mid]) left = mid+1;
			else return mid;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		BinarySearch binarySearch = new BinarySearch();
		int[] array = {1,2,3,4,5,6,7,8};
		int search = 6;
		System.out.println(binarySearch.find(array, search));
		
		
	}
	
}
