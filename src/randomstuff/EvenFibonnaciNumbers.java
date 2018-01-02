package randomstuff;

import tools.TimeKeeper;
import tools.TimeLogger;

/**
 *
 * @author Tim
 */
public class EvenFibonnaciNumbers {

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
    }
    
    /**
     * Possibly faster method using recursion
     */
    private static void fasterMethod() {
        
    }
    
    
}
