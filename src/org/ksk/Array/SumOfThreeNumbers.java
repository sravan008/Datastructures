package org.ksk.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SumOfThreeNumbers {


    List<List<Integer>> sumOfThreeNum(int[] array, int sum) {

        int length = array.length - 1;
        Arrays.sort(array);
        List finalList = new LinkedList();
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; ) {
                List<Integer> sumList = new LinkedList<>();
                if (array[i] + array[j] + array[length] == sum) {
                    sumList.add(array[i]);
                    sumList.add(array[j]);
                    sumList.add(array[length]);
                    j++;
                } else if (array[i] + array[j] + array[length] < sum) {
                    j++;
                } else {
                    length = length - 1;
                }
                if (sumList.size() > 0) finalList.add(sumList);
            }
        }
        return finalList;
    }


    public static void main(String[] args) {

        SumOfThreeNumbers sotn = new SumOfThreeNumbers();
        int[] array = {12, 3, 1, 2, -6, 5, -8, 6};
        List ll = Arrays.asList(sotn.sumOfThreeNum(array, 0));
        System.out.println(ll);

    }


}
