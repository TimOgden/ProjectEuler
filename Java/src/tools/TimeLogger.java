package tools;

/**
 *
 * @author Tim
 */
public class TimeLogger {
    public static void logTime() {
        System.out.println("Took " + TimeKeeper.getTime() + " seconds.");
    }
}
