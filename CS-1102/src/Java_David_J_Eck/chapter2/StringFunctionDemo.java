package Java_David_J_Eck.chapter2;
import java.util.Scanner;

/**
 * In this program, the user is prompted to enter a string.
 * The program then showcases the various string functions.
 */

public class StringFunctionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a String
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse the string
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);

        // Get the length of the string
        int length = input.length();
        System.out.println("Length of the string: " + length);

        // Get the first and last characters of the string
        char firstChar = input.charAt(0);
        char lastChar = input.charAt(length - 1);
        System.out.println("First character: " + firstChar);
        System.out.println("Last character: " + lastChar);

        // Get a substring of the string
        System.out.print("Enter the starting position: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending position: ");
        int end = scanner.nextInt();
        String substring = input.substring(start, end);
        System.out.println("Substring: " + substring);

        // Find the index of a character in the string
        System.out.print("Enter a character to find its index: ");
        char ch = scanner.next().charAt(0);
        int index = input.indexOf(ch);
        System.out.println("Index of " + ch + ": " + index);

        // Convert the string to uppercase and lowercase
        String uppercase = input.toUpperCase();
        String lowercase = input.toLowerCase();
        System.out.println("Uppercase: " + uppercase);
        System.out.println("Lowercase: " + lowercase);

        // Remove leading and trailing spaces from the string
        String trimmed = input.trim();
        System.out.println("Trimmed string: " + trimmed);

        // Check if the string equals or ignores case with another string
        System.out.print("Enter another string to compare: ");
        String otherString = scanner.next();
        boolean equals = input.equals(otherString);
        boolean equalsIgnoreCase = input.equalsIgnoreCase(otherString);
        System.out.println("Equals: " + equals);
        System.out.println("EqualsIgnoreCase: " + equalsIgnoreCase);

        // Close the scanner
        scanner.close();

        /*
        Enter a string: milano
        Reversed string: onalim
        Length of the string: 6
        First character: m
        Last character: o
        Enter the starting position: 2
        Enter the ending position: 4
        Substring: la
        Enter a character to find its index: a
        Index of a: 3
        Uppercase: MILANO
        Lowercase: milano
        Trimmed string: milano
        Enter another string to compare: Milano
        Equals: false
        EqualsIgnoreCase: true
        */
    }

    // Function to reverse a string
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

}
