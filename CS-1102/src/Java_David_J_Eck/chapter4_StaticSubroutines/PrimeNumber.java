package Java_David_J_Eck.chapter4_StaticSubroutines;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This function returns true if N is a prime number. A prime number
 * is an integer greater than 1 that is not divisible by any positive
 * integer, except itself and 1. If N has any divisor, D, in the range
 * 1 < D < N, then it has a divisor in the range 2 to Math.sqrt(N), namely
 * either D itself or N/D. So we only test possible divisors from 2 to
 * Math.sqrt(N).
 */

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number greater than 1: ");
            int number = scanner.nextInt();

            if (number > 1) {
                System.out.println("Is your number a prime? " + isPrime(number));
            } else
                System.out.println("Please enter a number greater than 1.");
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid numerical digit.");
        }

        /* Output:
        * Enter a number greater than 1: 13
        * Is your number a prime? true
        *
        * Process finished with exit code 0
        * */

    }   // end main()

    static boolean isPrime(int N) {

        int divisor;    // A number we will test to see whether it evenly
        // divides N.

        if (N <= 1)
            return false;   // No number <= 1 is prime.

        int maxToTry;   // The largest divisor that we need to test.

        maxToTry = (int) (Math.sqrt(N) + 0.001);
        // We will try to divide N by numbers between 2 and maxToTry.
        // If N is not evenly divisible by any of these numbers, then
        // N is prime. (Note that since Math.sqrt(N) is defined to
        // return a value of type double, the value must be typecast
        // to type int before it can be assigned to maxToTry. I added
        // the 0.001 because computations with double values are not
        // exact, and I worry that, for example, Math.sqrt(49) might
        // be computed as 6.999... instead of as 7.0.)

        for (divisor = 2; divisor <= maxToTry; divisor++) {
            if (N % divisor == 0)
                return false;   // Test if divisor evenly divides N. If so,
            // we know N is not prime. No need to continue testing
        }
        // If we get to this point, N must be prime. Otherwise,the function
        // would already have been terminated by a return statement in the
        // previous loop.
        return true;    // Yes, N is prime.
    }   // end of function isPrime

}   // end class
