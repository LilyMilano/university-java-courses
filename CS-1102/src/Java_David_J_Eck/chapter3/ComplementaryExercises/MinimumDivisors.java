package Java_David_J_Eck.chapter3.ComplementaryExercises;

/**
 * Which integer between 1 and 5000 has the smallest number of divisors,
 * and how many divisors does it have? Write a program to find the answers
 * and print out the results. It is possible that several integers in this
 * range have the same, minimum number of divisors.
 * Your program only has to print out one of them.
 *
 */
public class MinimumDivisors {

    public static void main(String[] args) {

        /* Initialize variables */

        int N;  // One of the integers whose divisors we have to count.
        int minDivisors = 5000;    // Minimum number of divisors seen so far.
        int numWithMin = 5000;    // A value of N that had the given number of
        // divisors. (Start with the fact that 1 has 1
        // divisor).

        /* Process all the remaining values of N from 2 to 5000, and update
        the values of minDivisors and numWithMin whenever we find a value of
        N that has lesser divisors than the current value of minDivisors.
        */

        for (N = 2; N <= 5000 ; N++) {

            int D;  // A number to be tested to see if it's a divisor of N.
            int divisorsCount = 0;  // Number of divisors of N.

            for (D = 1; D <= N ; D++) {
                if (N % D == 0)
                    divisorsCount++;
            }

            if (divisorsCount < minDivisors) {
                minDivisors = divisorsCount;
                numWithMin = N;
            }
        }   // end outer loop

        // System.out.println(N);  // 5001
        // System.out.println(numWithMin); // 2

        System.out.printf("The number with fewer divisors among 1 to 5000 is " +
                "%d. It has %d divisors.", numWithMin, minDivisors);

        /* Output:
        * The number with fewer divisors among 1 to 5000 is 2. It has 2
        * divisors.
        * Process finished with exit code 0
        */

    }   // end main()

}   // end class
