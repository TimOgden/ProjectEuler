package January2018;

import java.util.logging.Level;
import java.util.logging.Logger;
import tools.TimeKeeper;
import tools.TimeLogger;

/**
 * 01/05/2018
 * Goal: Find the sum of the squares of natural numbers 1-100
 * Then find the square of the sums of natural numbers 1-100
 * Then find the difference between them.
 * @author Tim
 */
public class SumSquareDifference {
    public static void main(String[] args) {
        TimeKeeper.startTime();
        try {
            System.out.println(squareOfSums(1,100) - sumOfSquares(1,100));
        } catch (Exception ex) {
            System.out.println("Your arguments don't make sense!");
        }
        TimeLogger.logTime();
    }
    
    private static int sumOfSquares(int start, int end) throws Exception {
        int total = 0;
        if(start>end)
            throw new Exception();
        for(int i = start; i<end; i++) {
            total += Math.pow(i, 2);
        }
        return total;
    }
    
    private static int squareOfSums(int start, int end) throws Exception {
        int total = 0;
        if(start>end)
            throw new Exception();
        for(int i = start; i<end; i++) {
            total += i;
        }
        return total*total;
    }
}
