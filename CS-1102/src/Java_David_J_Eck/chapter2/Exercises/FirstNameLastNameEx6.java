package Java_David_J_Eck.chapter2.Exercises;

import java.util.Scanner;

public class FirstNameLastNameEx6 {

    /**
     * 6. The program should ask the user to enter their first name and their
     * last name, separated by a space.
     * Break the input string up into two strings, one containing the first
     * name and one containing the last name. You can do that by using the
     * indexOf() subroutine to find the position of the space, and then using
     * substring() to extract each of the two names. Also output the number
     * of characters in each name, and output the user’s initials.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);   // Create the scanner.

        // Declare variables:
        String fullName;    // Stores the full name entered by the user.
        int spaceIndex;     // Stores the index of the space (delimiter to
        // split the full name).
        String firstName;   // Stores the first name extracted from the full
        // name.
        String lastName;    // Stores the last name extracted from the full name.
        int firstNameChars; // Stores the number of characters in the first name.
        int lastNameChars;  // Stores the number of characters in the last name.
        char firstNameInitial;  // Stores the first character of the first name.
        char lastNameInitial;   // Stores the first character of the last name.
        String initials;    // Stores the initials formed by combining the first
        // characters of the first and last names.

        // Gather user's input:
        System.out.print("Enter your first name and last name, separated by a" +
                " space: ");
        fullName = scanner.nextLine().trim();
        System.out.println(fullName);   // Liliana Milano

        // Find the index of the space in the full name (delimiter to split
        // the full name):
        spaceIndex = fullName.indexOf(" ");

        // Extract the first name and last name from the full name:
        firstName = fullName.substring(0, spaceIndex);
        lastName = fullName.substring(spaceIndex + 1);

        // Calculates the number of characters in each name:
        firstNameChars = firstName.length();
        lastNameChars = lastName.length();

        // Retrieves the first character of each name:
        firstNameInitial = firstName.charAt(0);
        lastNameInitial = lastName.charAt(0);

        // Combines the first characters to form the initials:
        initials =
                String.valueOf(firstNameInitial) + String.valueOf(lastNameInitial);

        // Display the results to the user (standard output):
        System.out.printf("""
                    Your first name is %s, which has %d characters
                    Your last name is %s, which has %d characters
                    Your initials are %s""", firstName, firstNameChars,
                lastName, lastNameChars, initials);

        /*
        * Output:
        * Enter your first name and last name, separated by a space: Liliana Milano
        * Liliana Milano
        * Your first name is Liliana, which has 7 characters
        * Your last name is Milano, which has 6 characters
        * Your initials are LM
        */

        scanner.close();    // Close the scanner
    }   // end main()
}   // end class.
