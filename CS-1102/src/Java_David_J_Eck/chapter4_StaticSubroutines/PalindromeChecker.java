package Java_David_J_Eck.chapter4_StaticSubroutines;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a word: ");
            String word = scanner.next();

            if (word.equalsIgnoreCase(reverse(word))) {
                System.out.println("The word " + word + " is palindrome.");
            } else
                System.out.println("The word " + word + " is not palindrome.");

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        /* Output:
        * Enter a word: level
        * The word level is palindrome.
        *
        * Process finished with exit code 0
        * */

    }   // end main()

    static String reverse(String str) {
        String copy;    // The reversed copy.
        int i;  // One of the positions in str, from str.length() - 1 down to 0.

        copy = "";  // Start with an empty string.

        for (i = str.length() - 1; i >= 0; i--) {
            // Append i-th char of str to copy.
            copy += str.charAt(i);
        }
        return copy;
    }   // end of reverse function

}   // end of class
