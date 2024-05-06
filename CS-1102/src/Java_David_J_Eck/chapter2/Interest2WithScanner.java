package Java_David_J_Eck.chapter2;

import java.util.Scanner;

public class Interest2WithScanner {
    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);     // Create the scanner.

        double principal;   // The value of the investment.
        double rate;        // The annual interest rate.
        double interest;    // The interest earned during the year.

        System.out.print("Enter the initial investment: ");
        principal = stdin.nextDouble();

        System.out.print("Enter the annual interest rate (as decimal): ");
        rate = stdin.nextDouble();

        interest = principal * rate;    // Compute this year's interest.
        principal += interest;           // Add it to principal.

        System.out.printf("The amount of interest is $%,1.2f%n", interest);
        System.out.printf("The value after one year is $%,1.2f%n", principal);

        /* Output:
        Enter the initial investment: 1000000
        Enter the annual interest rate (as decimal): 0.1
        The amount of interest is $100,000.00
        The value after one year is $1,100,000.00
        */

    }   // end of main()
}   // end of class Interest2WithScanner
