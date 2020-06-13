import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

    public static int counCounter(List<String> serialNumber) {
        int sum = 0;
        for (String snum : serialNumber) {
            if (snum.length() == 10 || snum.length() == 11 || snum.length() == 12) {
                if (distinctUpper(snum)) {
                    if (isNumber(snum)) {
                        if (Integer.parseInt(snum.substring(3, 7)) >= 1900 || Integer.parseInt(snum.substring(3, 7)) <= 2019) {
                            if (Integer.parseInt(snum.substring(7, snum.length() - 1)) == 10 ||
                                    Integer.parseInt(snum.substring(7, snum.length() - 1)) == 20 ||
                                    Integer.parseInt(snum.substring(7, snum.length() - 1)) == 50 ||
                                    Integer.parseInt(snum.substring(7, snum.length() - 1)) == 100 ||
                                    Integer.parseInt(snum.substring(7, snum.length() - 1)) == 200 ||
                                    Integer.parseInt(snum.substring(7, snum.length() - 1)) == 500 ||
                                    Integer.parseInt(snum.substring(7, snum.length() - 1)) == 1000
                            ) {
                                if (Character.isUpperCase(snum.charAt(snum.length() - 1))) {
                                    sum += Integer.parseInt(snum.substring(7, snum.length() - 1));
                                }
                            }
                        }
                    }
                }
            }
        }

        return sum;
    }


    public static boolean distinctUpper(String ss) {

        Set<Character> cc = new HashSet<Character>();
        String srs = ss.substring(0, 3);
        for (Character singleChar : srs.toCharArray()
        ) {
            if (Character.isUpperCase(singleChar)) {
                cc.add(singleChar);
            }
        }
        return cc.size() == 3 ? true : false;
    }

    static boolean isNumber(String ss) {
        String s = ss.substring(3, 7);
        for (int i = 0; i < s.length(); i++)
            if (Character.isDigit(s.charAt(i))
                    == false)
                return false;
        return true;
    }


    public static void main(String[] args) {

        List<String> ss = new ArrayList<>();
        ss.add("AVG190420T");
        ss.add("RTF20001000Z");
        ss.add("QWER201850G");
        ss.add("AFA199620E");
        ss.add("ERT1947200T");
        ss.add("RTY20202004");
        ss.add("DRV1984500Y");
        ss.add("ETB2010400G");
        //ss.add("RTF20001000Z");

//        String sar = "AVG190420T";
//        System.out.println(sar.substring(0,3));
//        System.out.println(sar.substring(3,7));
//        System.out.println(sar.substring(7,9));
//        System.out.println(sar.charAt(sar.length()-1));

        System.out.println(Test.counCounter(ss));


    }

}
