package Java_David_J_Eck.chapter3;

import java.util.Scanner;

/**
 * let’s write a program that will read the numbers input by the
 * user and then print them in the reverse of the order in which they
 * were entered. Assume that an input value equal to zero marks the
 * end of the data.
 */

public class ReverseInputNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers;  // An array for storing the input values.
        int count;    // The number of numbers saved in the array.
        int num;      // One of the numbers input by the user.
        int i;        // for-loop variable

        numbers = new int[100]; // Space for 100 ints.
        count = 0;  // No numbers have been saved yet.

        System.out.println("Enter up to 100 positive integers; enter 0 to end" +
                ".");

        while (true) {  // Get the numbers and put them in the array.
            System.out.print("? ");
            num = scanner.nextInt();
            if (num <=0) {
                // Zero marks the end of input; we have all the numbers.
                break;
            }
            numbers[count] = num;   // Put num in position count.
            count++;    // Count the number.
        }   // end while

        System.out.println("\nYour numbers in reverse order are:\n");

        for ( i = count - 1; i >=0 ; i--) {
            System.out.println(numbers[i]);
        }

        /* Output:
        Enter up to 100 positive integers; enter 0 to end.
        ? 10
        ? 20
        ? 30
        ? 0

        Your numbers in reverse order are:

        30
        20
        10

        Process finished with exit code 0
        */

    }   // end main()
}   // end class ReverseInputNumbers
