package Java_David_J_Eck.chapter3;

public class MultiplicationTable {

    public static void main(String[] args) {

        int rowNumber;  // Variable to represent the row number.
        int N;  // Variable to represent the number within each row.

        for (rowNumber = 1; rowNumber <= 12; rowNumber++) { // Loop through
            // each row from 1 to 12 (vertical).

            for (N = 1; N <= 12; N++) { // Loop through each number within
                // the row from 1 to 12.

                // Print the product of N and rowNumber in a 4-character column.
                System.out.printf("%4d", N * rowNumber); // No carriage return!
            }
            System.out.println();   // Add a carriage return at end of the
            // line to start a new row.
        }

        /* Output:

        1   2   3   4   5   6   7   8   9  10  11  12
        2   4   6   8  10  12  14  16  18  20  22  24
        3   6   9  12  15  18  21  24  27  30  33  36
        4   8  12  16  20  24  28  32  36  40  44  48
        5  10  15  20  25  30  35  40  45  50  55  60
        6  12  18  24  30  36  42  48  54  60  66  72
        7  14  21  28  35  42  49  56  63  70  77  84
        8  16  24  32  40  48  56  64  72  80  88  96
        9  18  27  36  45  54  63  72  81  90  99 108
       10  20  30  40  50  60  70  80  90 100 110 120
       11  22  33  44  55  66  77  88  99 110 121 132
       12  24  36  48  60  72  84  96 108 120 132 144

        Process finished with exit code 0
        */

        /*
        Explanation

        The algorithm uses two nested for loops to generate the
        multiplication table.

        - Outer Loop: The outer loop (represented by the rows in the grid)
        iterates over the numbers 1 to 12. For each iteration of the outer
        loop, a new row in the multiplication table is started.
        - Inner Loop: For each iteration of the outer loop, the inner loop
        (represented by the columns in the grid) also iterates over the
        numbers 1 to 12.
        - Cell Value: The product of the current numbers of the outer and inner
        loop is then calculated and printed in a 4-character column. This is
        represented by the cells in the table.
        - Carriage Return: After each full iteration of the inner loop,
        a carriage return is added, which moves the cursor to the
        beginning of the next line.

        This process continues until the outer loop has completed all its
        iterations, resulting in a 12x12 multiplication table.

                Conclusion

        The nested for loop in the algorithm allows for the systematic
        generation of a multiplication table. The outer loop controls the row
        number, while the inner loop controls the column number. The product
        of the row and column numbers is calculated and printed for each
        cell in the table, creating a visual representation of the
        multiplication table.
        */

    }   // end main()
}   // end class
