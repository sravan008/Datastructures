package org.ksk.Array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SumOfFourNumbers {

    List<List<Integer>> sumOfFourNumber(int[] array, int target) {
        List finalList = new LinkedList();
        Arrays.sort(array);
        for (int i = 0; i < array.length - 3; i++) {
            //if(i!=0 && array[i]==array[i-1])continue;
            for (int j = i + 1; j < array.length - 2; j++) {
                //if(j!=i+1 && array[j]==array[j-1])continue;
                int left = j + 1;
                int right = array.length - 1;
                while (left < right) {
                    int sum = array[i] + array[j] + array[left] + array[right];
                    if (sum < target) {
                        left++;
                    } else if (sum > target) {
                        right--;
                    } else {
                        List<Integer> sumList = new LinkedList<>();
                        sumList.add(array[i]);
                        sumList.add(array[j]);
                        sumList.add(array[left]);
                        sumList.add(array[right]);
                        finalList.add(sumList);
                        left++;
                        right--;
                        while (left < right && array[left] == array[left - 1]) {
                            left++;
                        }
                        while (left < right && array[right] == array[right + 1]) {
                            right--;
                        }
                    }
                }
            }
        }
        return finalList;
    }


    public static void main(String[] args) {
        SumOfFourNumbers sumOfFourNumbers = new SumOfFourNumbers();
        int[] array = {1, 0, -1, -2, 0, 2};
        List ll = Arrays.asList(sumOfFourNumbers.sumOfFourNumber(array, 0));
        System.out.println(ll);

    }

}
