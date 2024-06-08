package Java_David_J_Eck.chapter3.Exercises;

/**
 * This program counts the number of divisors for integers in the range
 * 1 to 10000.  It finds the maximum divisor count.  It outputs the
 * maximum divisor count and a list of all integers in the range that
 * have the maximum number of divisors.
 */

public class MostDivisorsWithArrayEx6 {

    public static void main(String[] args) {

        /* Declare and initialize the necessary variables */

        int N;  // One of the integers whose divisors we have to  count.
        int maxDivisors = 1;    // Maximum number of divisors seen so far.
        int numWithMax = 1;    // A value of N that had the given number of
        // divisors (start with the fact that 1 has 1 divisor).

        int[] numbersWithMaxDivisors = new int[10000];  // Array to store
        // numbers with maximum divisors.

        int index = 0;  // Counter for storing numbers in the array.
        // Determine how many numbers there are in the array. Also, the index
        // of the next available position to store numbers in the array.

        //_____________________________________________________________________

        /* Start a loop from N = 2 to N = 10000 to process all the numbers in
        * the range.
        * Process all the remaining values of N from 2 to 10000, and update
        * the values of maxDivisors, numWithMax, and numbersWithMaxDivisors whenever
        * we find a value of N that has more divisors than the current value
        * of maxDivisors.
        * */

        for (N = 2; N <= 10000 ; N++) {

            int D;  // A number to be tested to see if it is a divisor of N.
            int divisorCount = 0;   // Number of D's divisors of N.

            for (D = 1; D <= N; D++) {
                if (N % D == 0) {
                    divisorCount++;
                }
            }

            if (divisorCount > maxDivisors) {
                maxDivisors = divisorCount;
                numWithMax = N;
                index = 0;  // Reset array to index 0 when a new maximum
                // divisor count is found.
                numbersWithMaxDivisors[index] = N;  // Store N in the array
                // at index position.
                index++;
            } else if (divisorCount == maxDivisors) {
                numbersWithMaxDivisors[index] = N;  // Store N in the array
                // at the next available position or index.
                index++;
            }
        }   // end outer for

        //_____________________________________________________________________

        /* Display the results */

        System.out.printf("""
                %nAmong integers between 1 and 10000,
                The maximum number of divisors is %d
                Numbers with that many divisors include:%n""", maxDivisors);

        // Print out the numbers with maximum divisors (the array):
        for (int i = 0; i < index; i++) {
            System.out.println(numbersWithMaxDivisors[i]);
        }

        /* Output:
        * Among integers between 1 and 10000,
        * The maximum number of divisors is 64
        * Numbers with that many divisors include:
        * 7560
        * 9240
        * */

    }   // end main()
}   // end class
