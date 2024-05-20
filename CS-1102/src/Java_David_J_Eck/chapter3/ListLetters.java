package Java_David_J_Eck.chapter3;

import java.util.Scanner;

/**
 * This program reads a line of text entered by the user.
 * It prints a list of the letters that occur in the text,
 * and it reports how many different letters were found.
 */

public class ListLetters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        String str; // Line of text entered by the user.
        int count;  // Number of different letters found in str.
        char letter; // A letter of the alphabet.

        System.out.println("Please type in a line of text.");
        str = scanner.nextLine().toUpperCase();
        
        count = 0;
        System.out.println("\nYour input contains the following letters:");
        for (letter = 'A'; letter <= 'Z'; letter++) {
            for (int i = 0; i < str.length(); i++) {
                if (letter == str.charAt(i)) {
                    System.out.println(letter);
                    count++;
                    break;
                }
            }
        }
        System.out.printf("%nThere were %d different letters.", count);
        
        scanner.close();

        /* Output:
        Please type in a line of text.
        Lilliana Milano

        Your input contains the following letters:
        A
        I
        L
        M
        N
        O

        There were 6 different letters.
        Process finished with exit code 0
        */
        
    }   // end main()
}   // end class ListLetters
