package Java_David_J_Eck.chapter4_StaticSubroutines.exercises;

import java.util.Scanner;

/**
 * This program reads a hexadecimal number input by the user and prints the
 * base-10 equivalent.  If the input contains characters that are not
 * hexadecimal numbers, then an error message is printed.
 */

public class Hex2Dec_4_2 {

    /**
     * The main method is the entry point of the Java program.
     * It reads a hexadecimal number from the user and converts it to its
     * decimal equivalent.
     * The decimal value is then printed to the console.
     *
     * @param args The command-line arguments passed to the program (not used
     *            in this case).
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hex; // Input from user, containing a hexadecimal number.
        long dec;   // Decimal (base-10) equivalent of hexadecimal number.

        System.out.print("Enter a hexadecimal number: ");
        hex = scanner.next();

        try {
            dec = 0;
            for (int i = 0; i < hex.length(); i++) {
                int digit = hexValue(hex.charAt(i));    // Might throw an
                // exception.
                dec = 16 * dec + digit;
            }
            // We get here only if no exception occurred.
            System.out.println("Base-10 value:  " + dec);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Input is not a hexadecimal number.");
        }

        /* Output:
        * Enter a hexadecimal number: 3E
        * Base-10 value:  62
        *
        * Process finished with exit code 0
        */
    }   // end of main()

    /**
     * Returns the hexadecimal value of a given character, or
     * throw new IllegalArgumentException if it is not a valid hexadecimal
     * digit.
     *
     * @param ch the character that is to be converted into a hexadecimal digit
     * @return the hexadecimal value of ch, or throw new
     * IllegalArgumentException
     * if ch is not a legal hexadecimal digit.
     */
    public static int hexValue(char ch) {
        switch (ch) {
            case '0' -> {
                return 0;
            }
            case '1' -> {
                return 1;
            }
            case '2' -> {
                return 2;
            }
            case '3' -> {
                return 3;
            }
            case '4' -> {
                return 4;
            }
            case '5' -> {
                return 5;
            }
            case '6' -> {
                return 6;
            }
            case '7' -> {
                return 7;
            }
            case '8' -> {
                return 8;
            }
            case '9' -> {
                return 9;
            }
            case 'A', 'a' -> {
                return 10;
            }
            case 'B', 'b' -> {
                return 11;
            }
            case 'C', 'c' -> {
                return 12;
            }
            case 'D', 'd' -> {
                return 13;
            }
            case 'E', 'e' -> {
                return 14;
            }
            case 'F', 'f' -> {
                return 15;
            }
            default ->
                    throw new IllegalArgumentException("Not a legal " +
                            "hexadecimal digit: '" + ch + "'.");
        }
    }   // end hexValue()

}   // end class Hex2Dec
