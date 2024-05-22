package Java_David_J_Eck.chapter3;

import java.util.Scanner;

public class Switch_If {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a integer number in the range 1 to 9: ");
        int N = scanner.nextInt();

        /* Multiway If Statement */

        if (N == 1) {
            System.out.println("The number is 1.");
        }
        else if ( N == 2 || N == 4 || N == 8 ) {
            System.out.println("The number is 2, 4, or 8.");
            System.out.println("(That's a power of 2!)");
        }
        else if ( N == 3 || N == 6 || N == 9 ) {
            System.out.println("The number is 3, 6, or 9.");
            System.out.println("(That's a multiple of 3!)");
        }
        else if ( N == 5) {
            System.out.println("The number is 5.");
        }
        else {
            System.out.println("The number is 7 or is outside the range 1 to " +
                    "9.");
        }

        /* Switch Statement */
        switch (N) {    // (N is the same integer variable)
            case 1 -> System.out.println("The number is 1.");
            case 2, 4, 8 -> {
                System.out.println("The number is 2, 4, or 8.");
                System.out.println("(That's a power of 2!)");
            }
            case 3, 6, 9 -> {
                System.out.println("The number is 3, 6, or 9.");
                System.out.println("(That's a power of 3!)");
            }
            case 5 -> System.out.println("The number is 5.");
            default -> System.out.println("The number is 7 or is outside the " +
                    "range 1 to 9.");
        }

        /* Output
        Please enter a integer number in the range 1 to 9: 6
        The number is 3, 6, or 9.
        (That's a multiple of 3!)
        The number is 3, 6, or 9.
        (That's a power of 3!)

        Process finished with exit code 0
        */

        scanner.close();

    }   // end of main()
}   // end of class
