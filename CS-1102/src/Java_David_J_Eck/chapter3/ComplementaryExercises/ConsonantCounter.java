package Java_David_J_Eck.chapter3.ComplementaryExercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Write a program that reads a line of text and counts the number of
 * consonants in the text. The program should print the number of consonants
 * in the text. A consonant is defined as any letter that is not a vowel.
 */

public class ConsonantCounter {

    public static void main(String[] args) {

        // Step 1: Read the text file
        File file = new File("consonants.txt");

        try {
            Scanner scanner = new Scanner(file);

            // Step 2: Count the number of consonants:
            int vowels = 0;
            int consonants = 0;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (line != null && !line.isEmpty()) {

                    line = line.toLowerCase();

                    for (int i = 0; i < line.length(); i++) {
                        char ch = line.charAt(i);

                        if (Character.isLetter(ch)) {
                            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                                vowels++;
                            } else
                                consonants++;
                        }
                    }
                }   // end conditional if
            }   // end while loop

            // Step 3: Print the number of consonants:
            System.out.println("Number of consonants: " + consonants);

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        /* Output:
        * Number of consonants: 22

        * Process finished with exit code 0
        * */

    }   // end main()
}   // end class
