package Java_David_J_Eck.chapter3.ComplementaryExercises;

import java.util.Scanner;

/**
 * Write a program that reads one line of input text and breaks it up
 * into sentences. The sentences should be output one per line.
 * A sentence is defined to be a sequence of words ending with a period,
 * question mark, or exclamation point. Any characters in the input that
 * are not part of a sentence should be discarded.
 */

public class SentenceBreaker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Gather user's input
        System.out.println("Enter a paragraph: ");
        String paragraph = scanner.nextLine();

        // Initialize variables
        String sentence = "";

        // Iterate over each character in the input paragraph
        for (int i = 0; i < paragraph.length(); i++) {

            char ch = paragraph.charAt(i);

            // Check if the character is part of a sentence
            if (Character.isLetter(ch) || ch == ',' || (ch == '\'' && sentence.length() > 0) || (Character.isWhitespace(ch))) {

                sentence += ch;
            }
            // Check if the character is the end of a sentence
            else if (ch == '.' || ch == '?' || ch == '!') {
                sentence += ch;
                // Print the sentence and reset the variable
                System.out.println(sentence.trim());
                sentence = "";
            }
        }   // end for loop

        // Print the last sentence if exists
        if (!sentence.isEmpty()) {
            System.out.println(sentence.trim());
        }

        /* Output:
        * Enter a paragraph:
        * Only forty years of professional mourning kept the overwhelming
        * frustration and hatred from showing on Amerigo Bonasera's face. His beautiful young daughter was still in the hospital with her broken jaw wired together; and now these two animals went free? It had all been a farce! He watched the happy parents cluster around their darling sons. Oh, they were all happy now, they were smiling now.
        * Only forty years of professional mourning kept the overwhelming
        * frustration and hatred from showing on Amerigo Bonasera's face.
        * His beautiful young daughter was still in the hospital with her
        * broken jaw wired together and now these two animals went free?
        * It had all been a farce!
        * He watched the happy parents cluster around their darling sons.
        * Oh, they were all happy now, they were smiling now.
        *
        * Process finished with exit code 0
        */

        /*flow of the program.
        It starts by prompting the user to enter a paragraph.
        Then, it initializes the sentence variable.
        The program iterates over each character in the paragraph.
        For each character, it checks if it is part of a sentence.
        If it is, the character is appended to the sentence.
        If the character is the end of a sentence, the sentence is printed, and the variable is reset.
        Finally, the last sentence is printed if it exists.
        The program ends after that.

        */

    }   // end main()
}   // end class
