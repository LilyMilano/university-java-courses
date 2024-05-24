package Java_David_J_Eck.chapter3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * This program reads numbers from a file. It computes the sum and
 * the average of the numbers that it reads. The file should contain
 * nothing but numbers of type double; if this is not the case, the
 * output will be the sum and average of however many numbers were
 * successfully read from the file. The name of the file will be
 * input by the user.
 */

public class AverageNumbersFromFile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String fileName;    // The name of the file, to be input by the user

            System.out.print("Enter the name of the file (or press Enter to exit): ");
            fileName = scanner.nextLine();

            if (fileName.isEmpty()) {
                System.out.println("Exiting the program...");
                break;
            }

            try {
                FileReader fileReader = new FileReader(fileName);   // Opens
                // the file for reading.
                BufferedReader bufferedReader =
                        new BufferedReader(fileReader); // Provides buffering
                // capabilities for efficient reading.

                /* At this point, the file is open for reading. */
                double number;  // A number read from the data file.
                double sum = 0; // The sum of all numbers read so far.
                int count = 0;  // The number of numbers that were read.
                String line;

                while ((line = bufferedReader.readLine()) != null) {
                    number = Double.parseDouble(line);
                    count++;
                    sum += number;
                }
                bufferedReader.close();
                // At this point, we have read the entire file.

                System.out.println();
                System.out.println("Number of data values read: " + count);
                System.out.println("The sum of the data values: " + sum);

                if (count  == 0)
                    System.out.println("Can't compute an average of 0 values.");
                else
                    System.out.println("The average of the values is: " + (sum / count));
                break;  // Exit the loop after successfully reading and
                // processing the file.

            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + fileName);
                System.out.println("Please try again.\n");
            } catch (IOException e) {
                System.out.println("Error reading from the file: " + fileName);
                System.out.println("Please try again.\n");
            }
        }   // end while loop

        /*
        * Output:
        Enter the name of the file (or press Enter to exit): numeric.txt
        File not found: numeric.txt
        Please try again.

        Enter the name of the file (or press Enter to exit): numericdata.txt

        Number of data values read: 4
        The sum of the data values: 12.2
        The average of the values is: 3.05

        Process finished with exit code 0
        * */

    }   // end of main()
}   // end of class
