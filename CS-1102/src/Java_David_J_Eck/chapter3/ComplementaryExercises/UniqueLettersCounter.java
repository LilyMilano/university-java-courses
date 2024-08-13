package Java_David_J_Eck.chapter3.ComplementaryExercises;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter a line of text and counts
 * how many different letters exist in that string. The program should be
 * case-insensitive, meaning that it treats uppercase and lowercase letters
 * as the same. Use an array to track which letters have been found. If a
 * letter appears more than once, it should only be counted the first time it
 * is encountered. Finally, the program should display the total number of
 * unique letters found and list those letters.
 */
public class UniqueLettersCounter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Prompt user for input:
        System.out.println("Enter a line of text: ");
        String input = scanner.nextLine();

        // Convert input to lowercase to ensure case insensitivity:
        input = input.toLowerCase();

        // Array to track  the presence of letters (26 for each letter in the
        // English alphabet)
        boolean[] letterFound = new boolean[26];
        int uniqueCount = 0;

        //Iterate through each character in the input using a traditional for
        // loop:
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);  // Get the character at the current
            // index.

            // Check if the character is a letter:
            if (Character.isLetter(ch)) {
                int index = ch - 'a';   // Get the index of the letter (0 for 'a', 1 for 'b', etc.)

                if (!letterFound[index]) {  // If this letter hasn't been
                    // counted yet:
                    letterFound[index] = true;  // Mark it as found
                    uniqueCount++;  // Increment the unique letter count.
                }
            }
        }

        // Output the results:
        System.out.println("Total unique letters found: " + uniqueCount);
        System.out.print("Letters found: ");
        for (int i = 0; i < letterFound.length; i++) {
            if (letterFound[i]) {
                System.out.print((char) (i + 'a') + " "); // Print the letter.
            }
        }
        System.out.println();
        // Close the scanner:
        scanner.close();

        /*
        * Output:
        *
        * Enter a line of text:
        * Liliana Milano
        * Total unique letters found: 6
        * Letters found: a i l m n o
        *
        * Process finished with exit code 0
        */

    }   // end of main()
}   // end of class UniqueLettersCounter
