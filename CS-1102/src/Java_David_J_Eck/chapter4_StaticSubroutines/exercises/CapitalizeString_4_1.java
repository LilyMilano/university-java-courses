package Java_David_J_Eck.chapter4_StaticSubroutines.exercises;

import java.util.Scanner;

/**
 * This program will get a line of input from the user and will print a copy
 * of the line in which the first character of each word has been changed to
 * upper case.  The program was written to test the printCapitalized
 * subroutine.
 */

public class CapitalizeString_4_1 {

    /**
     * The main method of the program. It prompts the user to enter a string,
     * performs input validation to ensure a non-empty string is entered, and
     * then prints the capitalized version of the input string using the
     * printCapitalized method.
     *
     * @param args the command-line arguments
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a string: ");
            String line = scanner.nextLine();

            // Input validation
            while (line.trim().isEmpty()) {
                System.out.println("Invalid input. Please enter a non-empty " +
                        "string.");
                System.out.print("Enter a string: ");
                line = scanner.nextLine();
            }

            System.out.print("Capitalized version: ");
            printCapitalized(line);

        } catch (IllegalStateException e) {
            System.out.println("The scanner is closed.");
            System.exit(0);
        }

        /* Output:
         * Enter a string:
         * Invalid input. Please enter a non-empty string.
         * Enter a string: Added a comment explaining the purpose of the main
         * method.
         * Capitalized version: Added A Comment Explaining The Purpose Of The
         * Main Method.
         *
         * Process finished with exit code 0
         * */

    }   // end of main()

    /**
     * Prints a copy of the input string with the first letter of each word
     * capitalized.
     *
     * @param str the input string
     * @precondition str is not null
     * @postcondition The returned string will have the first letter of each
     * word capitalized.
     */
    public static void printCapitalized(String str) {
        boolean prevChIsLetter = false; // Flag to track if the previous
        // character was a letter.
        String capitalizedString = "";  // Initialize an empty string to
        // store he capitalized result.

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);    // Get the current character.

            if (Character.isLetter(ch)) { // Check if the current character
                // is a letter
                // If the previous character was a letter, leave the current
                // character as it is
                // Otherwise, capitalize the current character.
                ch = prevChIsLetter ? ch : Character.toUpperCase(ch);
                prevChIsLetter = true;  // Update the flag since the current
                // character is a letter.
            } else {
                prevChIsLetter = false;  // Update the flag since the current
                // character is not a letter

            }
            capitalizedString += ch;    // Concatenate the current character
            // to the result string.
        }   // end of for loop.

        System.out.println(capitalizedString);  // Print the capitalized result.
    }   // end of printCapitalized()
}   // end of class
