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
        Liliana Milano

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

        /*
        * In fact, there is actually an easier way to determine whether a given
        * letter occurs in a string, str. The built-in function:
        * str.indexOf(letter) will return -1 if letter does not occur in the
        * string. It returns a number greater than or equal to zero if it does
        * occur. So, we could check whether letter occurs in str simply by
        * checking “if (str.indexOf(letter) >= 0)”.
        * If we used this technique in the above program, we would not need a
        * nested for loop. This gives you a preview of how subroutines can
        * be used to deal with complexity.
        */

    }   // end main()
}   // end class ListLetters
