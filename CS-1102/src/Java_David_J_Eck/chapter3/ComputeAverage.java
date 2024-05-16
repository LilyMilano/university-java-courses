package Java_David_J_Eck.chapter3;

import java.util.Scanner;

/**
 * This program reads a sequence of positive integers input by the user, and
 * it will print out the average of those integers. The user is prompted to
 * enter one integer at a time. The user must enter a 0 to mark the end of the
 * data. (The zero is not counted as part of the data to be averaged.) The
 * program does not check whether the user's input is positive, so it will
 * actually add up both positive and negative input values.
 */

public class ComputeAverage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputNumber;    // One of the integers input by the user.
        int sum;    // The sum of the positive integers.
        int count;  // The number of positive integers.
        double average; // The average of the positive numbers.

        /* Initialize the summation and counting variables. */

        sum = 0;
        count = 0;

        /* Read and process the user's input. */

        System.out.print("Enter your first positive integer: ");
        inputNumber = scanner.nextInt();

        while (inputNumber != 0) {
            sum += inputNumber; // Add inputNumber to running sum.
            count++;    // Count the input by adding  1 to count.
            System.out.print("Enter your next positive integer, or 0 to end: ");
            inputNumber = scanner.nextInt();
        }

        /* Display the result. */

        if (count == 0) {
            System.out.println("You didn't enter any data!");
        }
        else {
            average = ((double)sum) / count;
            System.out.printf("""
                    %nYou entered %d positive integers.
                    Their average is %1.3f.%n""", count, average);
        }

        /*
        * Output:
        * Enter your first positive integer: 2
        * Enter your next positive integer, or 0 to end: 2
        * Enter your next positive integer, or 0 to end: 5
        * Enter your next positive integer, or 0 to end: 0
        *
        * You entered 3 positive integers.
        * Their average is 3.000.
        *
        * Process finished with exit code 0
        */

    }   // end main()
}   // end class ComputeAverage
