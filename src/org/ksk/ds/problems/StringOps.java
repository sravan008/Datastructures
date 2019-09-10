package org.ksk.ds.problems;

public class StringOps {

	private static void plandromOrNot(String palanString) {

		int count = 0;
		char[] palanCharArray = palanString.toCharArray();
		for (int i = 0; i < palanCharArray.length / 2; i++) {
			if (palanCharArray[i] != palanCharArray[palanCharArray.length - 1 - i]) {
				count++;
			}
		}
		if (count > 0) {
			System.out.println("Given String is not a Palandrom");
		} else {
			System.out.println("Given String is a Palandrom");
		}

	}

	public static void main(String[] args) {

		StringOps.plandromOrNot("malayalam");

	}

}
