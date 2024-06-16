package Java_David_J_Eck.chapter3.ComplementaryExercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Write a program that reads a line from a file of text and prints it in
 * reverse order.
 * The program should read the text, reverse it, and then print the reversed
 * text in uppercase.
 * */

public class TextReversal {

    public static void main(String[] args) {

        try {

            // Specify the file path:
            String filePath = "textreversal.txt";

            // Create a File object with the specified file path:
            File file = new File(filePath);

            // Create a scanner to read the file:
            Scanner scanner = new Scanner(file);

            // Read all the lines from the file and print them in reverse order:
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String reversedUppercaseLine =
                        reverseString(line).toUpperCase();

                System.out.println(reversedUppercaseLine);
            }   // end while

            // Close the scanner:
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("The file was not found: " + e.getMessage());
        }

        /* Output:
        * !DLROW ,OLLEH
        * .TXET ELPMAS A SI SIHT
        * .ESACREPPU NI DETNIRP DNA DESREVER EB LLIW TI
        *
        * Process finished with exit code 0
        * * */

    }   // end main()

    // Helper subroutine to reverse a string:
    public static String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while(left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);

    }   // end reverseString subroutine()
}   // end class
