package January2018;

import tools.TimeKeeper;
import tools.TimeLogger;

/**
 * 01/03/2018 Goal: Find the largest palindromic number that can be created from
 * the product of two 3-digit numbers.
 *
 * @author Tim
 */
public class PalindromeNums {

    //998001 is the largest number that can be made by multiplying any 2 3-digit
    //numbers
    public static void main(String[] args) {
        TimeKeeper.startTime();
        for (int i = 998001; i > 10000; i--) {
            if (isPalindromic(i)) {
                if (hasIntegerFactors(i)) {
                    System.out.println(i);
                    TimeLogger.logTime();
                    break;
                }
            }
        }
    }

    private static boolean isPalindromic(int n) {
        String s = n + "";
        for (int left = 0; left < s.length(); left++) {
            int right = s.length() - (1 + left); //right will give the indecies from s.length()-1 to 0 as left goes from 0 to s.length()-1.
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
        }
        return true;
    }

    private static int factor(int n) {
        for (int i = n; i > 0; i--) {
            if (n % i == 0) {
                return i;
            }
        }
        return -1;
    }

    private static boolean hasIntegerFactors(int n) {
        return factor(n) != -1;
    }
}
