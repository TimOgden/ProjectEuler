package January2018;

/**
 * 01/03/2018
 * @author Tim
 */
public class PalindromeNums {
    
    public static void main(String[] args) {
                
    }
    
    private static boolean isPalindromic(int n) {
        String s = n + "";
        for(int left = 0; left<s.length(); left++) {
            int right = s.length() - (1 + left); //right will give the indecies from s.length()-1 to 0 as left goes from 0 to s.length()-1.
            if(s.charAt(left)!=s.charAt(right))
                return false;
        }
        return true;
    }
}
