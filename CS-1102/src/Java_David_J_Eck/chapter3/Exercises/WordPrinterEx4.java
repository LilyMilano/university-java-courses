package Java_David_J_Eck.chapter3.Exercises;

import java.util.Scanner;

/**
 *  Exercise 4:
 *  This program will read one line of input typed by the user.
 *  It will print the words from the input, one word to a line.
 *  A word is defined to be a sequence of letters.  All non-letters
 *  in the input are discarded.
 *  The approach to solving this problem is to iterate through the input
 *  string, extract each word, and print it.

 *  Algorithm:

 * While there are more words in the input string, do the following:
 * Get the next word.
 * Print the word.
 *
 */

public class WordPrinterEx4 {

    public static void main(String[] args) {

        /* Gather user's input: */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String line = scanner.nextLine();

        StringBuilder wordCollector = new StringBuilder();  // Store the current word.

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if (Character.isLetter(ch) || (ch == '\'' && wordCollector.length() > 0)) {
                // If the current character is a letter or an apostrophe and
                // there is a letter before it, append it to the current
                // wordCollector:
                wordCollector.append(ch);
            } else if (wordCollector.length() > 0) {
                // If the current character is not a letter or an apostrophe
                // and the wordCollector is not empty, print the current word
                // and reset the StringBuilder:
                System.out.println(wordCollector);
                wordCollector.setLength(0);
            }
        }   // end for loop

        // Print the last word if exists: This means that if the line of text
        // concludes with a word, and there is no punctuation or space
        // immediately after it, the code will recognize it as the last word
        // and print it.
        // For example, let's say a user enters the following line of text:
        // "The quick brown fox jumps over the lazy dog". In this case, the last
        // word is "dog", and there is no punctuation or space after it.
        // The code will detect this and print "dog" as the last word.
        if (wordCollector.length() > 0) {
            System.out.println(wordCollector);
        }

        /*
        * Output:
        * Enter a line of text: Oh c'mon, let's go to Momochi's House!
        * Oh
        * c'mon
        * let's
        * go
        * to
        * Momochi's
        * House

        * Process finished with exit code 0
        * */

    }   // end main()
}   // end class WordPrinterEx4
