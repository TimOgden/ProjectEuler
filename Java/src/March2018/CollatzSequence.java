package March2018;

import java.math.BigInteger;

/**
 * 03-03-18
 * The Collatz Sequence is defined by:
 *   n -> n/2, n is even
 *   n -> 3n+1, n is odd
 * until n = 1. 
 * Goal: In the range of 1-1,000,000, find the starting number that, when entered
 * into the sequence, takes the most steps until n = 1.
 * @author Tim
 */
public class CollatzSequence {

    public static void main(String[] args) {
        int maxSteps = 0;
        int maxStart = 0;
        for (int i = 1; i < 1000000; i++) {
            //System.out.println("\nTrying " + i + ".\t" + getPercent(i) + "% done.");
            System.out.println(getPercent(i) + "% done.");
            if (i != 113383 && i != 134379) {
                int temp = new PsuedoRecursionSequence(i).getNumSteps();
                if (temp > maxSteps) {
                    maxSteps = temp;
                    maxStart = i;
                }
            }
        }
        System.out.println("\n" + maxStart + " produces the most steps at " + maxSteps + ".");
    }

    private static int getPercent(int i) {
        return (int) (((float) i / 1000000) * 100);
    }



    private static class PsuedoRecursionSequence {
        private static final BigInteger TWO = new BigInteger("2");
        private static final BigInteger THREE = new BigInteger("3");
        int numSteps = 1;
        int start;

        public PsuedoRecursionSequence(int start) {
            this.start = start;
            collatzSeq(start);
        }

        /**
         * If n is even, return n/2 If n is odd, return 3n+1 If n is equal to 1,
         * done. Was originally recursive, but due to stack overflow errors, I
         * will convert it into just an ordinary while loop.
         *
         * @param n
         * @return
         */
        int collatzSeq(int n1) {
            BigInteger n = new BigInteger("" + n1);
            while (!n.equals(BigInteger.ONE)) {
                
                if (n.mod(TWO).equals(BigInteger.ZERO)) {
                    n = n.divide(TWO);
                } else {
                    n = (n.multiply(THREE)).add(BigInteger.ONE);
                }
                numSteps++;
                System.out.print("\"" + n + "\" ");
                if(numSteps%100==0)
                    System.out.println("");
            }
            return numSteps;
        }

        public int getNumSteps() {
            return numSteps;
        }

    }
}
