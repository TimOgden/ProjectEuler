package January2018;

import tools.TimeKeeper;
import tools.TimeLogger;

/**
 *
 * @author Tim
 */
public class EvenFibonnaciNumbers {
    private static int lastEven = 2; //Last even number from the sequence. Used for recursion in fasterMethod()
    public static void main(String[] args) {
        TimeKeeper.startTime();
        slowMethod();
        TimeLogger.logTime();
        
        TimeKeeper.startTime();
        //fasterMethod();
        TimeLogger.logTime();
    }

    /**
     * Calculate every value of Fibonnaci sequence, check if it's even, and if
     * so, add to total Stop when value >= 1,000,000
     */
    private static void slowMethod() {
        int total = 0;
        int c = 1;
        int past = 1;
        while (c < 1000000) {
            int temp = past;
            past = c;
            c+=temp;
            if(c%2==0)
                total+=c;
            
        }
        System.out.println("Total is " + total);
    }
    
    /**
     * Possibly faster method using recursion
     * --Incorrect-- would not be faster.
     * This would involve the same process
     * just in a different order, because
     * it is not possible for the recursion to
     * move backwards through the sequence unless
     * it already constructed the sequence.
     */
    private static void fasterMethod() {
        int total = 0;
        
    }
    
    /*private static int fibSeq(int c) {
        
    }*/
    
}
