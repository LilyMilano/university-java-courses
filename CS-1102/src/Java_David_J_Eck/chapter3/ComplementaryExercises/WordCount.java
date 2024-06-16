package Java_David_J_Eck.chapter3.ComplementaryExercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Write a program that reads a line of text and counts the number of words
 * in the text. The program should print the number of words in the text.
 * A word is defined as a sequence of letters separated by spaces.
 * */

public class WordCount {

    public static void main(String[] args) {

        // Read the text file
        File file = new File("textreversal.txt");

        try {
            Scanner scanner = new Scanner(file);

            // Count the number of words:
            int wordCount = 0;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (line != null && !line.isEmpty()) {
                    String[] words = line.split("\\s+");
                    wordCount += words.length;
                }
            }   // end while loop

            // Print the number of words
            System.out.println("Number of words: " + wordCount);
            scanner.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        /* Output:
        * Number of words: 15

        * Process finished with exit code 0
        * * */

        /*
        * The expression "\s+" is a regular expression pattern used in Java
        * to split a string into words based on whitespace characters.
        * In this case, the "\s" represents a whitespace character, which
        * includes spaces, tabs, and line breaks.
        * The "+" symbol is a quantifier that specifies that the preceding
        * pattern (in this case, "\s") should match one or more occurrences.
        * So, "\s+" means one or more whitespace characters.
        * When used with the split() method in Java, the "\s+" pattern is used
        * as the delimiter to split a string into an array of words based on
        * whitespace. */

    }   // end main()
}   // end class
