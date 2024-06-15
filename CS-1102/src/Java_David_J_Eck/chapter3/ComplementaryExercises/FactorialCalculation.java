package Java_David_J_Eck.chapter3.ComplementaryExercises;

import java.util.Scanner;

/**
 * Write a program that calculates the factorial of a number entered by the
 * user. The program should prompt the user to enter a number and then print
 * the factorial of that number.
 * In general, the factorial of a number 'n' is calculated by multiplying all
 * the positive integers from 1 to 'n'.
 * Please note that the factorial function is defined for non-negative integers.
 * Here are a few numeric examples to illustrate factorial calculations:
 * Factorial of 0: By convention, the factorial of 0 is defined as 1. So, 0! = 1.
 * Factorial of 1: The factorial of 1 is also 1. So, 1! = 1.
 * Factorial of 2: The factorial of 2 is calculated as 2 x 1, which equals 2. So, 2! = 2.
 * Factorial of 3: The factorial of 3 is calculated as 3 x 2 x 1, which equals 6. So, 3! = 6.
 * Factorial of 4: The factorial of 4 is calculated as 4 x 3 x 2 x 1, which equals 24. So, 4! = 24.
 * */

public class FactorialCalculation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number:
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        long factorial = 1L;

        // Check if the number is 0 or 1:
        if (number == 0 || number == 1) {
            factorial = 1L;
        } else {
            // Calculate the factorial using a loop:
            for (int i = 2; i <= number; i++) {
                factorial *= i;
            }
        }

        // Display the factorial result:
        System.out.printf("The factorial of %d is: %d.%n", number, factorial);

        /* Output:
        * Enter a number: 4
        The factorial of 4 is: 24.

        Process finished with exit code 0
        * */

    }   // end main()
}   // end class
