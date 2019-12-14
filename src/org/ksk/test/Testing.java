package org.ksk.test;

public class Testing {
    static int d =1;

    void testFun(){
        d++;
       // d=1;
        d++;
        System.out.println(d);


    }

    public static void main(String[] args) {

    Testing t = new Testing();
    t.testFun();

    }
}
