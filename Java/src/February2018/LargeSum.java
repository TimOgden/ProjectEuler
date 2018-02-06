package February2018;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tim
 */
public class LargeSum {

    private static File nums;
    private static int[][] grid = new int[100][50];
    private static int[] lastDigits = new int[10];
    private static ArrayList<Integer> backlog = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        nums = new File("LargeSum.txt");
        Scanner scan = new Scanner(nums);
        initGrid(scan);
        printLast10Digits(49);
    }

    private static void initGrid(Scanner scan) {
        int r = 0;
        while (scan.hasNextLine()) {
            char[] tempArray = scan.nextLine().toCharArray();
            for (int c = 0; c < 50; c++) {
                grid[r][c] = tempArray[c];
            }
            r++;
        }
    }

    /**
     * We know that the full sum is 51 digits, so we won't print the first 41.
     */
    private static void printLast10Digits(int c) {
        //System.out.println("Called with c equal to " + c);
        int columnTotal = 0;
        for (int r = 0; r < 100; r++) {
            columnTotal += grid[r][c];
        }
        //Here is where we add the corresponding backlog and then pop it off
        if (backlog.size() != 0) {
            columnTotal += backlog.get(backlog.size() - 1);
            backlog.remove(backlog.size() - 1);
        }
        char[] temp = ("" + columnTotal).toCharArray();
        for (int i = temp.length - 2; i < 0; i--) {
            backlog.add(Character.getNumericValue(temp[i]));
        }
        System.out.print(columnTotal);
        if(c>0)
            printLast10Digits(c-1);
    }
}
