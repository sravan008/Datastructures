package org.ksk.backtracking;

public class PermutataionComb {
    public String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }


    private void permute(String str, int l, int r) {
        if (l == r)
            System.out.println(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                System.out.println("1st -"+str +" : "+ "i = "+i+" : "+ "l= "+l+" :"+ "r = "+r );
                permute(str, l + 1, r);
                str = swap(str, l, i);
                System.out.println("2nd-"+str +" : "+ "i = "+i+" : "+ "l= "+l+" :"+ "r = "+r );
            }
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        PermutataionComb permutation = new PermutataionComb();
        permutation.permute(str, 0, n - 1);
    }

}
