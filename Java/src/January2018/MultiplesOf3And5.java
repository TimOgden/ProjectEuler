/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package January2018;

import tools.TimeKeeper;
import tools.TimeLogger;

/**
 * 01/01/18
 * Goal: List and find the sum of all the multiples of 3 and 5 up to 1,000.
 * @author Tim
 */
public class MultiplesOf3And5 {
    
    public static void main(String[] args) {
        bruteForcingIt();
        smarterMethod();
    }
    
    private static void bruteForcingIt() {
        TimeKeeper.startTime();
        int i = 3;
        int total = 0;
        while (i<1000) {
            if(multOf3(i) || multOf5(i)) {
                System.out.print(i + ", ");
                total += i;
            }
            i++;
        }
        System.out.println(""); //Insert a new line
        System.out.println("TOTAL: " + total);
        TimeLogger.logTime();
    }
    
    //Cut the time by 2/3's!!!
    //Only issue is that it is out of order
    //Turns out total is slightly off.
    private static void smarterMethod() {
        TimeKeeper.startTime();
        int a = 3, b = 5;
        int total = 0;
        while(b<1000) {
            System.out.print(a + ", " + b + ", ");
            a+=3;
            if(a%5!=0)
                total += a;
            b+=5;
            total += b;
        }
        while(a<1000) {
            System.out.print(a + ", ");
            a+=3;
            if(a%5!=0)
                total += a;
        }
        System.out.println("");
        System.out.println("TOTAL: " + total);
        TimeLogger.logTime();
    }
    
    private static boolean multOf3(int a) {
        return a % 3 == 0;
    }
    
    private static boolean multOf5(int a) {
        return a % 5 == 0;
    }
}
