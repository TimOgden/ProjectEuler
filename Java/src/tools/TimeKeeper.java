package tools;

/**
 *
 * @author Tim
 */
public class TimeKeeper {
    private static long timeStarted = 0;
    
    /**
     * Tell the time keeper to start the timer
     */
    public static void startTime() {
        timeStarted = System.currentTimeMillis();
    }
    
    /**
     * 
     * @return the time it has been since the clock started in seconds
     */
    public static double getTime() {
        return ((double)System.currentTimeMillis()-timeStarted)/1000;
    }
}
