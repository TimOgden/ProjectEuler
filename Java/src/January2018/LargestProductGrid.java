package January2018;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 01/28/2018 Goal: Find the greatest sum of 4 adjacent numbers in a 20x20 grid
 * going either horizontally, vertically, or diagonally.
 *
 * @author Tim
 */
public class LargestProductGrid {

    private static int[][] grid = new int[20][20];
    private static Scanner arrayScanner;
    private static int max = 0;
    private static enum Direction {HORIZONTAL, VERTICAL, DIAGONAL};
    private static Vector maxCoord;
    private static Direction maxDirection;
    public static class Vector {
        int r, c;
        public Vector(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
    
    public static void main(String[] args) {
        initArray();
        for(int r = 0; r<20; r++)
            for(int c = 0; c<20; c++) {
                Vector coord = new Vector(r,c);
                if(product(coord, Direction.HORIZONTAL)>max) {
                    max = product(coord, Direction.HORIZONTAL);
                    maxCoord = coord;
                    maxDirection = Direction.HORIZONTAL;
                }
                if(product(coord, Direction.VERTICAL)>max) {
                    max = product(coord, Direction.VERTICAL);
                    maxCoord = coord;
                    maxDirection = Direction.VERTICAL;
                }
                if(product(coord, Direction.DIAGONAL)>max) {
                    max = product(coord, Direction.DIAGONAL);
                    maxCoord = coord;
                    maxDirection = Direction.DIAGONAL;
                }
            }
        System.out.println("Max: " + max);
        System.out.println("Direction: " + maxDirection);
        System.out.println("Coordinates: (" + maxCoord.r + ", " + maxCoord.c + ")");
            
                
    }

    private static void initArray() {
        try {
            arrayScanner = new Scanner(new File("largestProductGrid.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LargestProductGrid.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int r = 0; r < 20; r++) {
            for (int c = 0; c < 20; c++) {
                grid[r][c] = arrayScanner.nextInt();
            }
        }
    }
    
    private static int product(Vector coord, Direction dir) {
        int prod = grid[coord.r][coord.c];
        for(int i = 0; i<3; i++) {
            coord = moveCoord(coord, dir);
            prod *= grid[coord.r][coord.c];
        }
        return prod;
    }
    
    private static Vector moveCoord(Vector coord, Direction dir) {
        Vector v;
        if(dir == Direction.HORIZONTAL)
            v = new Vector(coord.r, coord.c+1);
        else if(dir == Direction.VERTICAL)
            v = new Vector(coord.r+1, coord.c);
        else
            v = new Vector(coord.r+1, coord.c+1);

        if(v.r>=20) {
            if(dir == Direction.DIAGONAL) {
                v = new Vector(20 - v.r, 0); //row = 20-col, col = 0
            } else {
                v = new Vector(0, v.c);
            }
        }
        if(v.c>=20) {
            if(dir == Direction.DIAGONAL) {
                v = new Vector(0, 20-v.c);
            } else {
                v = new Vector(v.r, 0);
            }
        }
        return v;
    }

}
