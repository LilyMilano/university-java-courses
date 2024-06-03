package Java_David_J_Eck.chapter3.Exercises;

/**
 * Which integer between 1 and 10000 has the largest number of divisors,
 * and how many divisors does it have? Write a program to find the answers
 * and print out the results. It is possible that several integers in this
 * range have the same, maximum number of divisors. Your program only has
 * to print out one of them.
 */

public class MostDivisors {

    public static void main(String[] args) {

        int N;  // One of the integers whose divisors we have to count.
        int maxDivisors = 1;    // Maximum number of divisors seen so far.
        int numWithMax = 1;    // A value of N that had the given number of
        // divisors. (Start with the fact that 1 has 1
        // divisor).

        /* Process all the remaining values of N from 2 to 10000, and update
        the values of maxDivisors and numWithMax whenever we find a value of
        N that has more divisors than the current value of maxDivisors.
        */

        for (N = 2; N <= 10000; N++) {

            int D;  // A number to be tested to see if it's a divisor of N.
            int divisorCount;   // Number of divisors of N.

            divisorCount = 0;

            for (D = 1; D <= N; D++) {
                if (N % D == 0) {
                    divisorCount++;
                }
            }

            if (divisorCount > maxDivisors) {
                maxDivisors = divisorCount;
                numWithMax = N;
            }

        }   // end outer for

        System.out.printf("""
                %nAmong integers between 1 and 10000,
                The maximum number of divisors is %d
                A number with %d divisors is %d.%n""", maxDivisors, maxDivisors,
                numWithMax);

        /* Output:
        * Among integers between 1 and 10000,
        * The maximum number of divisors is 64
        * A number with 64 divisors is 7560.

        * Process finished with exit code 0
        * */

    }   // end main()
}   // end class
