package org.ksk.Array;

import java.util.*;

// Find out two numbers which is equivalent to the given SUM - Ex : [2,3,-3,5,7,-1,6] ; SUM = 8 --> [6,2]
public class SumOfTwoNumbers {

    //Time complexity is o(n) and space complexity o(n)
    List<Integer> twoNumberSum(int[] array, int sum) {
        List<Integer> sumArray = new ArrayList<>();
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(sum - array[i])) {
                sumArray.add(sum - array[i]);
                sumArray.add(array[i]);
                return sumArray;
            } else {
                map.put(array[i], true);
            }
        }
        return sumArray;
    }

    //Time-complexity is O(n log(n)) and space-complexity - O(1)
    //Sort the Array and use the Two pointers - One is pointing to first index, other one is pointing to last index
    List<Integer> twoNumberSum(int sum, int[] array) {
        List<Integer> sumArray = new ArrayList<>();
        int length = array.length - 1;
        for (int i = 0; i < length; ) {
            if (array[i] + array[length] == sum) {
                sumArray.add(array[i]);
                sumArray.add(array[length]);
                return sumArray;
            } else if (array[i] + array[length] < sum) {
                i++;
            } else {
                length = length - 1;
            }
        }
        return sumArray;
    }


    public static void main(String[] args) {
        SumOfTwoNumbers sumOfTwoNumbers = new SumOfTwoNumbers();
        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        int[] arrays = {-4, -1, 1, 3, 5, 6, 8, 11};
        //List ll = Arrays.asList(sumOfTwoNumbers.twoNumberSum(array, 11));
        List ll = Arrays.asList(sumOfTwoNumbers.twoNumberSum(13, arrays));
        System.out.println(ll);
    }

}