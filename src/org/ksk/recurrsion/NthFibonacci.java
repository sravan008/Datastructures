package org.ksk.recurrsion;

public class NthFibonacci {


    //usingRecurssion - Check Algoexpert for details
    static int fibr(int n) {
        if (n == 2) return 1;
        else if (n == 1) return 1;
        else {
            return fibr(n - 1) + fibr(n - 2);
        }
    }

    // without recurssion
    static int fib(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {

        System.out.println(NthFibonacci.fib(5));
        System.out.println(NthFibonacci.fibr(5));

    }


}
