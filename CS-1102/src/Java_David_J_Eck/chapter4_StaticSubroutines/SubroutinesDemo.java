package Java_David_J_Eck.chapter4_StaticSubroutines;

import java.util.Scanner;

public class SubroutinesDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ///////////////////////////////////////////////////////////////////
        printDivisors(7);
        /* Output:
        * The divisors of 7 are:
        * 1
        * 7*/
        System.out.println();

        ///////////////////////////////////////////////////////////////////
        printRow('a', 4);
        /* Output:
        * aaaa */

        ///////////////////////////////////////////////////////////////////
        String inputLine;   // Line of text input by user.
        System.out.print("Enter a line of text: ");
        inputLine = scanner.nextLine();
        System.out.println();
        printRowFromString(inputLine);

        /* Output:
        * Enter a line of text: hello world

        * hhhhhhhhhhhhhhhhhhhhhhhhh
        * eeeeeeeeeeeeeeeeeeeeeeeee
        * lllllllllllllllllllllllll
        * lllllllllllllllllllllllll
        * ooooooooooooooooooooooooo
        *
        * wwwwwwwwwwwwwwwwwwwwwwwww
        * ooooooooooooooooooooooooo
        * rrrrrrrrrrrrrrrrrrrrrrrrr
        * lllllllllllllllllllllllll
        * ddddddddddddddddddddddddd
        *
        * Process finished with exit code 0
        * */

        ///////////////////////////////////////////////////////////////////
        int[] numbers;  // Array of integers to be printed
        numbers = new int[3];
        numbers[0] = 42;
        numbers[1] = 17;
        numbers[2] = 256;

        printValuesInList(numbers);

        /* Output:
        * [42,17,256]
        * Process finished with exit code 0
        * */
        ///////////////////////////////////////////////////////////////////

    }   // end main()
// ------------------------------------------------------------------------
    /**
     * Print all the divisors of N.
     * We assume that N is a positive integer.
     */

    static void printDivisors(int N) {
        int D;  // One of the possible divisors of N.
        System.out.println("The divisors of " + N + " are:");
        for (D = 1; D <=N ; D++) {
            if ( N % D == 0)    // Does D evenly divide N?
                System.out.println(D);
        }
    }
// ------------------------------------------------------------------------
    /**
     * Write one line of output containing N copies of the
     * character ch. If N <= 0, an empty line is output.
     */

    private static void printRow( char ch, int N) {
        int i;  // Loop-control variable for counting off the copies.
        for (i = 1; i <= N ; i++) {
            System.out.print(ch);
        }
        System.out.println();
    }
// ------------------------------------------------------------------------

    /**
     * For each character in str, write a line of output
     * containing 25 copies of that character.
     * The algorithm is pretty clear:
     * For each position i in the string str, call printRow(str.charAt(i),25)
     * to print one line of the output that contains 25 copies of character
     * number i from the string.
     */

    private static void printRowFromString(String str) {
        int j;  // Loop-control variable for counting off the chars.
        for (j = 0; j < str.length() ; j++) {
            printRow(str.charAt(j), 25);
        }
    }
// ------------------------------------------------------------------------
    /**
     * Write a subroutine to print all the values in an integer array in a
     * neat format, separated by commas and enclosed in a pair of square
     * brackets. To tell it which array to print, the subroutine would
     * have a parameter of type int[ ]
     */

    static void printValuesInList(int[] list) {
        System.out.print('[');
        for (int k = 0; k < list.length; k++) {
            if (k > 0) {
                System.out.print(',');  // No comma in front of list[0]
            }
            System.out.print(list[k]);
        }
        System.out.print(']');
    }   // end printValuesInList subroutine

}   // end class SubroutinesDemo





















