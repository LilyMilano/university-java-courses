package Java_David_J_Eck.chapter2.Exercises;

import java.util.Scanner;

public class EggCounterEx5 {

    /**
     * 5. This program will convert a given number of eggs into
     *        the number of gross plus the number of dozens plus the
     *        number of left over eggs.
     *           For example, 1342 eggs is 9 gross plus 3 dozen plus 10.
     *        The number of eggs is input by the user, and the computed
     *        results are displayed.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);   // Create the scanner.

        // Declare the variables

        int eggs;   // Number of eggs, input by the user.
        int gross;  // How many gross in that number of eggs?
        int aboveGross; // How many eggs are left over, above an integral
        // number of gross? This number can be computed as eggs%144, and is
        // in the range 0 to 143. This number will be divided into dozens and
        // extras.
        int dozens; // How many dozens in aboveGross?
        int extras; // How many eggs are left over, above integral number of
        // gross and dozens?

        // Ask for user's input
        System.out.print("How many eggs do you have? ");
        eggs = scanner.nextInt();

        // Calculation
        gross = eggs / 144;
        aboveGross = eggs % 144;

        dozens = aboveGross / 12;
        extras = aboveGross % 12;

        // Display the results
        System.out.printf("Your number of eggs is %d gross, %d dozen, and %d" +
                ".%n", gross, dozens, extras);

        scanner.close();    //  Close the scanner.

        /*
        * Output:
        * How many eggs do you have? 1342
        * Your number of eggs is 9 gross, 3 dozen, and 10.
        */

    }   // end main()
}   // end class.
