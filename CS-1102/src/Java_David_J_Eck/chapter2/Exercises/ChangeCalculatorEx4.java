package Java_David_J_Eck.chapter2.Exercises;

import java.util.Scanner;

public class ChangeCalculatorEx4 {

    /**
     * 4. Write a program that helps the user count his change. The program should ask how many
     * quarters the user has, then how many dimes, then how many nickels, then how many
     * pennies. Then the program should tell the user how much money he has, expressed in
     * dollars.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);   // Create the scanner

        // Declare variables
        double quarters;
        double dimes;
        double nickels;
        double pennies;
        double dollars;

        // Gather user input

        System.out.print("How many quarters do you have? ");
        quarters = scanner.nextDouble();

        System.out.print("How many dimes do you have? ");
        dimes = scanner.nextDouble();

        System.out.print("How many nickels do you have? ");
        nickels = scanner.nextDouble();

        System.out.print("How many pennies do you have? ");
        pennies = scanner.nextDouble();

        // Calculation of the total dollars

        dollars = quarters/4 + dimes/10 + nickels/20 + pennies/100;

        // Display the results

        System.out.printf("You have a total of %1.2f dollars in your purse.%n"
                , dollars);

        /*
        * Output:
        * How many quarters do you have? 2
        * How many dimes do you have? 10
        * How many nickels do you have? 20
        * How many pennies do you have? 100
        * You have a total of 3.50 dollars in your purse.
        */

    }   // end of main()
}   // end of class
