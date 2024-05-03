package Java_David_J_Eck.chapter2;
import Java_David_J_Eck.chapter2.textio.TextIO;

/**
 * This class implements a simple program that will compute the amount of
 * interest that is earned on an investment over a period of one year. The
 * initial amount of the investment and the interest rate are input by the
 * user. The value of the investment at the end of the year is output. The
 * rate must be input as a decimal, not a percentage (for example, 0.05
 * rather than 5).
 */

public class Interest2 {
    public static void main(String[] args) {

        double principal;   // The value of the investment.
        double rate;        // The annual interest rate.
        double interest;    // The interest earned during the year.

        System.out.print("Enter the initial investment: ");
        principal = TextIO.getlnDouble();

        System.out.print("Enter the annual interest rate (as a decimal): ");
        rate = TextIO.getlnDouble();

        interest = principal * rate;    // Compute this year's interest.
        principal += interest;           // Add it to the principal.

        System.out.printf("The amount of interest is $%1.2f%n", interest);
        System.out.printf("The value after one year is $%1.2f%n", principal);

        /*
        * Output:
        * Enter the initial investment: 100
        * Enter the annual interest rate (as a decimal): 0.1
        * The amount of interest is $10.00
        * The value after one year is $110.00
        */

    }   // end o main()
}   // end of class Interest2
