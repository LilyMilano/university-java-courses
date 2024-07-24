package Java_David_J_Eck.chapter4_StaticSubroutines.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Write a program that finds the average of the first N elements of an
 * array of type double.
 * The array and N are parameters.
 */
public class ArrayAverage {

    /**
     * Main method to execute the program.
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        int size = getArraySize(scanner);
        // Generate a random array of the specified size:
        double[] array = generateRandomArray(size);
        // Get the value of N from the user:
        int N = getNValue(scanner, size);
        // Call the findAverage function and store the result:
        double average = findAverage(array, N);
        // Print the elements of the array:
        printArrayElements(array);
        System.out.println();

        // Print the average:
        System.out.printf("The average is: %.2f%n", average);

        scanner.close();

        /* Output:
        *
        * Enter the size of the array: ten
        * Invalid input. Please enter a positive integer.
        * Enter the size of the array: 4
        * Enter the value of N (between 1 and 4): 6
        * Invalid input. Please enter a positive integer between 1 and 4.
        * Enter the value of N (between 1 and 4): 2
        *  Element 1: 54.58
        *  Element 2: 17.48
        *  Element 3: 46.85
        *  Element 4: 20.20
        *
        * The average is: 36.03
        *
        * Process finished with exit code 0
        */

    }   // end of main()

    /**
     * Gets the size of the array from the user.
     * @param scanner The Scanner object for user input.
     * @return The size of the array.
     */
    public static int getArraySize(Scanner scanner) {
        int size = 0;
        while (size <= 0) {
            try {
                System.out.print("Enter the size of the array: ");
                size = scanner.nextInt();
                if (size <= 0) {
                    System.out.println("Invalid input. Please enter a positive integer.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a positive integer.");
                scanner.nextLine(); // Clear the input buffer
            }
        }
        return size;
    }   // end of getArraySize()

    /**
     * Generates a random array of the specified size.
     * @param size The size of the array to generate.
     * @return The generated array.
     */
    public static double[] generateRandomArray(int size) {
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = Math.random() * 100 + 1;
        }
        return array;

        /* Get the elements of the array from user:
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size ; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextDouble();
        }
        */
    }   // end of generateRandomArray()

    /**
     * Gets the value of N from the user.
     * @param scanner The Scanner object for user input.
     * @param size The size of the array.
     * @return The value of N.
     */
    public static int getNValue(Scanner scanner, int size) {
        int N = 0;
        while (N < 1 || N > size) {
            System.out.printf("Enter the value of N (between 1 and %d): ", size);
            try {
                N = scanner.nextInt();
                if (N < 1 || N > size) {
                    System.out.printf("Invalid input. Please enter a positive integer between 1 and %d.%n", size);
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a positive integer.");
                scanner.nextLine(); // Clear the input buffer
            }
        }
        return N;
    }   // end of getNValue()

    /**
     * Finds the average of the first N elements of the array.
     * @param array The input array.
     * @param N The number of elements to consider for average.
     * @return The average of the first N elements.
     */
    public static double findAverage(double[] array, int N) {
        double acum = 0;
        for (int i = 0; i < N ; i++) {
            acum += array[i];
        }
        return acum / N;
    }   // end of findAverage()

    /**
     * Prints the elements of the array.
     * @param array The input array.
     */
    public static void printArrayElements(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf(" Element %d: %.2f%n", (i + 1), array[i]);
        }
    }   // end of printArrayElements()

}   // end of class ArrayAverage
