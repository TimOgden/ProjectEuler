/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package January2018;

/**
 *
 * @author Tim
 */
public class MultiplesOf3And5 {
    
    static long timeStarted;
    public static void main(String[] args) {
        bruteForcingIt();
        smarterMethod();
    }
    
    private static void bruteForcingIt() {
        timeStarted = System.currentTimeMillis();
        int i = 3;
        while (i<1000) {
            if(multOf3(i) || multOf5(i))
                System.out.print(i + ", ");
            i++;
        }
        System.out.println(""); //Insert a new line
        
        System.out.println((double)(System.currentTimeMillis()-timeStarted)/1000 + " seconds.");
    }
    
    //Halved the time!!!
    //Only issue is that it is out of order
    private static void smarterMethod() {
        timeStarted = System.currentTimeMillis();
        int a = 3, b = 5;
        while(b<1000) {
            System.out.print(a + ", " + b + ", ");
            a+=3;
            b+=5;
        }
        while(a<1000) {
            System.out.print(a + ", ");
            a+=3;
        }
        System.out.println("");
        System.out.println((double)(System.currentTimeMillis()-timeStarted)/1000 + " seconds.");
    }
    
    private static boolean multOf3(int a) {
        return a % 3 == 0;
    }
    
    private static boolean multOf5(int a) {
        return a % 5 == 0;
    }
}
