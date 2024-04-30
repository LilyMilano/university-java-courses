package Java_David_J_Eck.chapter2;

/**
 * This class implements a simple program that will compute
 * the amount of interest that is earned on $17,000 invested
 * at an interest rate of 0.027 for one year. The interest and
 * the value of the investment after one year are printed to
 * standard output.
 */

public class Interest {
    public static void main(String[] args) {

        /* Declare the variables. */

        double principal;   // The value of the investment.
        double rate;        // The annual interest rate.
        double interest;    // The interest earned in one year.

        /* Do the computations */

        principal = 17000;
        rate = 0.027;
        interest = principal * rate;    // Compute the interest.

        principal += interest;
            // Compute value of investment after one year, with interest.
            // (Note: The new value replaces the old value of principal.)

        /* Output the results */

        System.out.print("The interest earned is $");
        System.out.println(interest);
        System.out.print("The value of the investment after one year is $");
        System.out.println(principal);

        /* Output
        * The interest earned is $459.0
        * The value of the investment after one year is $17459.0
        */

    }   // end of main()
}   // end of class Interest
