package org.ksk.recurrsion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductSum {


    int getProductSum(List inputArray, int number) {
        int productSum = 0;
        for (int i = 0; i < inputArray.size(); i++) {
            if (inputArray.get(i) instanceof ArrayList) {
                productSum += getProductSum((ArrayList) inputArray.get(i), number+1);
            } else {
                productSum += (int) inputArray.get(i);
            }
        }
        return productSum *= number;
    }

    public static void main(String[] args) {
        ProductSum productSum = new ProductSum();
        //Example Array --> [5, 2, [7, -1], 3, [6, [-13, 8], 4]]
        List ss = new ArrayList();
        ss.add(7);
        ss.add(-1);
        List ss1 = new ArrayList();
        ss1.add(6);
        List ss2 = new ArrayList();
        ss2.add(-13);
        ss2.add(8);
        ss1.add(ss2);
        ss1.add(4);
        List input = new ArrayList();
        input.add(5);
        input.add(2);
        input.add(ss);
        input.add(3);
        input.add(ss1);

//        System.out.println(input.toString());

        Map<String, Integer> arrayMap = new HashMap<>();
        arrayMap.put("ArraySum", 1);
        System.out.println(productSum.getProductSum(input, 1));
    }
}
