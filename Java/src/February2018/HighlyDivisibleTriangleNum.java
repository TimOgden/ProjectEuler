package February2018;

/**
 * 02-04-2018
 * Goal: Find the first triangle number with over 500 divisors
 * A triangle number is a summation of natural numbers to a certain index,
 * so the 7th triangle number is 1+2+3+...+7=28
 * @author Tim
 */
public class HighlyDivisibleTriangleNum {
    
    public static void main(String[] args) {
        int index = 0;
        while(getNumDivisors(triangleNum(index))<=500) {
            index++;
            System.out.println(getNumDivisors(triangleNum(index)));
        }
        System.out.println(triangleNum(index) + " has " + getNumDivisors(triangleNum(index)) + " divisors.");
    }
    
    /**
     * Returns a triangle number based on index.
     * @param index
     * @return 
     */
    private static int triangleNum(int index) {
        int n = 0;
        for(int i = 1; i<=index; i++) {
            n+=i;
        }
        return n;
    }
    
    private static int getNumDivisors(int triangleNum) {
        int n = 0;
        for(int i = 1; i<=triangleNum; i++) {
            if(triangleNum%i==0)
                n++;
        }
        return n;
    }
}
