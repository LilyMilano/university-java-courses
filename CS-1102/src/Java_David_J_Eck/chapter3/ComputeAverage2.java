package Java_David_J_Eck.chapter3;

import java.util.Scanner;

/**
 * Suppose, for example, we want a program that will find the average of a sequence of real
 * numbers entered by the user, and we want the user to signal the end of the sequence by entering
 * a blank line.*/

public class ComputeAverage2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str; // The user's input.
        double number;  // The input converted into a number.
        double total;   // The total of all numbers entered.
        double avg; // The average of the numbers.
        int count;  // The number of numbers entered.

        total = 0;
        count = 0;

        System.out.println("Enter your numbers, press return to end.");

        while (true) {
            System.out.print("? ");
            str = scanner.nextLine();
            if (str.equals("")) {
                break;  // Exit the loop, since the input line was blank.
            }
            try {
                number = Double.parseDouble(str);
                // If an error occurs, the next two lines are skipped!
                total +=  number;
                count++;
            }
            catch (NumberFormatException e) {
                System.out.println("Not a legal number! Try again.");
            }
        }   // end while

        if (count > 0) {
            avg = total / count;
            System.out.printf("The average of %d numbers is %1.6g%n", count, avg);
        } else {
            System.out.println("No numbers entered.");
        }

        /* Output:
        Enter your numbers, press return to end.
        ? 5.5
        ? 4.2
        ? 6.8
        ?
        The average of 3 numbers is 5.50000
        */

    }   // end of main()
}   // end of class
