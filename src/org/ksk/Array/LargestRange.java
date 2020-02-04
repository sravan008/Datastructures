package org.ksk.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LargestRange {

    static List<Integer> largestRangeInArray(int[] array) {
        Map<Integer, Boolean> arrayMap = new HashMap<>();
        List<Integer> arrayRange = new ArrayList<>();
        for (int value : array) {
            arrayMap.put(value, true);
        }
        List<Integer> range = new ArrayList<>();
        for (int value : array) {
            for (int j = value; j + 1 > j; j++) {
                if (arrayMap.containsKey(j) && arrayMap.get(j)) {
                    range.add(j);
                    arrayMap.put(j, false);
                } else {
                    arrayRange = arrayRange.size() > range.size() ? arrayRange : range;
                    range = new ArrayList<>();
                    j = 0;
                }
            }
        }
        return arrayRange;
    }


    public static void main(String[] args) {

        int[] array = {1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        System.out.println(LargestRange.largestRangeInArray(array));


    }

}
