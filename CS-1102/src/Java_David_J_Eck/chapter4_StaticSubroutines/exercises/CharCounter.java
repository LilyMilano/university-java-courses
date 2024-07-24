package Java_David_J_Eck.chapter4_StaticSubroutines.exercises;

import java.util.Scanner;

/**
 * Write a function named countChars that has a String and a char as
 * parameters. The function should count the number of times the character
 * occurs in the string, and it should return the result as the value of the
 * function.
 */
public class CharCounter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.print("Enter the desired character: ");
        char desiredChar = scanner.nextLine().charAt(0);

        System.out.println("The char " + desiredChar + " occurs " +
                countChars(str, desiredChar) + " times.");

        /* Output:
        * Enter a string: Purpose
        * Enter the desired character: p
        * The char p occurs 2 times.
        *
        * Process finished with exit code 0
        */
    }   // end of main()

    public static int countChars(String str, char searchedChar) {

        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(searchedChar)) {
                counter++;
            }
        }
        return counter;
    }   // end of countChars()

}   // end of class CharCounter
