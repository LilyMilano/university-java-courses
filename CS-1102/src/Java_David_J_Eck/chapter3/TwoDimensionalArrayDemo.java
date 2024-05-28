package Java_David_J_Eck.chapter3;

/**
 * Two-dimensional Arrays */

public class TwoDimensionalArrayDemo {

    public static void main(String[] args) {

        int[][]A = new int[5][7];

        int row, col;   // loop-control-variables for accessing rows and
                        // columns in A.

        for (row = 0; row < 5; row++) {
            for (col = 0; col < 7 ; col++) {
                System.out.printf("%7d", A[row][col]);
            }
            System.out.println();
        }
        System.out.println();

        /* Output:
        0      0      0      0      0      0      0
        0      0      0      0      0      0      0
        0      0      0      0      0      0      0
        0      0      0      0      0      0      0
        0      0      0      0      0      0      0

        Process finished with exit code 0
        */
        //**********************************************************************

        /*
        Consider a company that owns 25 stores. Suppose that the company has
        data about the profit earned at each store for each month in the year
        2022. If the stores are numbered from 0 to 24, and if the twelve
        months from January 2022 through December 2022 are numbered from 0 to
        11, then the profit data could be stored in an array, profit, created
        as follows:
        */

        double[][] profit = new double[25][12];
        int store, month;       // Variables for looping through the stores and
                                        // the months

        for (store = 0; store < 25; store++) {
            for (month = 0; month < 12; month++) {
                // Assign the profit value for the current store and month
                profit[store][month] = Math.random()*10000;
                // Print out the profits
                System.out.printf("%14.5g", profit[store][month]);
            }
            System.out.println();
        }
        System.out.println();

        /* the total profit for the company—for the whole year from all its
        stores—can be calculated by adding up all the entries in the array:*/

        double totalProfit = 0;     // Company's total profit in 2022.

        for (store = 0; store < 25 ; store++) {
            for (month = 0; month < 12 ; month++) {
                totalProfit += profit[store][month];
            }
        }
        System.out.printf("Company's total profit in 2022: $%,1.5f",
                totalProfit);

        /* Sometimes it is necessary to process a single row or a single
        column of an array, not the entire array. For example, to compute the
        total profit earned by the company in December, that is, in month
        number 11, you could use the loop:
        */

        double decemberProfit = 0.0;

        for (store = 0; store < 25; store++) {
            decemberProfit += profit[store][11];
        }
        System.out.printf("\nCompany's December profit: $%,1.5f",
                decemberProfit);



    }   // end main()
}   // end class
