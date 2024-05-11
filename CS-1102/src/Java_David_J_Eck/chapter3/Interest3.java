package Java_David_J_Eck.chapter3;

import java.util.Scanner;

/**
 This class implements a simple program that will compute the amount of
 interest that is earned on an investment over a period of 5 years.
 The initial amount of the investment and the interest rate are input by the
 user.
 The value of the investment at the end of each year is output.
 */

public class Interest3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double principal;   // The value of the investment.
        double rate;    // The annual interest rate.

        /* Get the initial investment and interest rate from the user. */

        System.out.print("Enter the initial investment: ");
        principal = scanner.nextDouble();
        System.out.println();

        System.out.print("""
                Enter the annual interest rate.
                Enter a decimal not a percentage:\s""");
        rate = scanner.nextDouble();
        System.out.println();

        /* Simulate the investment for 5 years. */

        int years;  // Counts the number of years that have passed.

        years = 0;
        while (years < 5) {
            double interest;    // Interest for this year.
            interest = principal * rate;
            principal += interest;  // Add it to principal.
            years++;    // Count the current year.
            System.out.printf("The value of the investment after %d years is " +
                    "$%1.2f%n", years, principal);
        }   // end of while loop

        /*
        Output:
        Enter the initial investment: 100

        Enter the annual interest rate.
        Enter a decimal not a percentage: 0.1

        The value of the investment after 1 years is $110.00
        The value of the investment after 2 years is $121.00
        The value of the investment after 3 years is $133.10
        The value of the investment after 4 years is $146.41
        The value of the investment after 5 years is $161.05

        Process finished with exit code 0
        */

    }   // end of main()
}   // end of class Interest3
