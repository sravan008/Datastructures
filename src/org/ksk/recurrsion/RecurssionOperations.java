package org.ksk.recurrsion;

public class RecurssionOperations {

    static int fact(int n) {

        if (n >= 1) {
            return n * fact(n - 1);
        }
        return 1;
    }

    static int sumOntoNnumners(int num) {

        if (num >= 1) {
            return num + sumOntoNnumners(num - 1);
        }
        return num;
    }

    int maxNumber(int[] numArray, int i) {

        if (i == 0) {
            return numArray[0];
        }

        return Math.max(numArray[i], maxNumber(numArray, i - 1));

    }

    boolean isPalandrome(String checkPalanOrNot, int i, int j) {

        if (i >= j) {
            return true;
        }
        return checkPalanOrNot.charAt(i) == checkPalanOrNot.charAt(j) && isPalandrome(checkPalanOrNot, i + 1, j - 1);
    }

    boolean isGivenNumberisConsecutiveNumberOrNot(int[] inArray, int i) {

        return i == inArray.length - 1 || inArray[i] == inArray[i + 1] - 1
                && isGivenNumberisConsecutiveNumberOrNot(inArray, i + 1);
    }


    private void permute(String str, int l, int r) {
        if (l == r)
            System.out.println(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                System.out.println("hi--L value "+l+"---"+i);
                permute(str, l + 1, r);

             System.out.println("hi1--L value "+l+"---"+i);
                str = swap(str, l, i);
            }
        }
    }

    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }



    public static void main(String[] args) {
        RecurssionOperations ros = new RecurssionOperations();
        //sout is the shortcut for System.out.println
        //System.out.println(sumOntoNnumners(5));
        int[] numArray = {4, 3, 6, 7, 0, 9, 2};
        //System.out.println(" *** Highest Number is*** " + ros.maxNumber(numArray, numArray.length - 1));
        //String palandromTestString = "dsasd";
        //System.out.println(ros.isPalandrome(palandromTestString, 0, palandromTestString.length() - 1));

        String str = "ABC";
        int n = str.length();
        ros.permute(str, 0, n-1);


    }

}
