package January2018;

/**
 * 01/20/2018
 * Goal: Find the 
 * @author Tim
 */
public class PythagoreanTriples {
    
    public static void main(String[] args) {
        for(int b = 1; b<1000; b++)
            for(int c = 1; c<1000; c++)
                if(conditionsTrue(b,c)) {
                    int a = 1000 - (b+c);
                    if(a>=b || b>=c || a<=0)
                        continue;
                    System.out.println("The triplet is " + a + ", " + b + ", " + c);
                    System.out.println("The product abc is " + a*b*c);
                }
    }
    
    private static boolean conditionsTrue(int b, int c) {
        //2 b^2 + 2 b c - 2000 b - 2000 c + 1000000 = 0
        return 2*b*b + 2*b*c - 2000*b - 2000*c == -1000000;
    }
}
