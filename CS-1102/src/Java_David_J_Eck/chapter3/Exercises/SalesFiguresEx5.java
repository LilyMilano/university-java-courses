package Java_David_J_Eck.chapter3.Exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This program reads from a file named "sales.txt".  Each line of the
 * file contains the name of a city, followed by a colon, followed by
 * either a number giving the amount of sales in that city or by a
 * message saying why the sales figure is not available.  The program
 * prints the total sales for all cities and the number of cities for
 * which the figure was not available.
 */

public class SalesFiguresEx5 {
    public static void main(String[] args) {

        /* Initialize Variables */
        String file = "sales.txt";  // Name of the file.
        double totalSales = 0;  // Total sales from all cities.
        int missingCount = 0;   // Number of cities without data.

        try {

        /* Open the file for reading using the Scanner class */
        Scanner scanner = new Scanner(new File(file));

        /* Read the file line by line */
        while (scanner.hasNextLine()) { // Loop through each line in the file

            String line = scanner.nextLine();   // Read the current line.
            String[] parts = line.split(":");   // Split the line at the colon.
            String city = parts[0].trim();  // Extract the city name.
            // System.out.println(city);
            String data = parts[1].trim();  // Extract the data.
            // System.out.println(data);

            /* Process the data: */

            // Check if data is available for the city:
            if (!Character.isDigit(data.charAt(0))) {
                // If is not a numeric figure:
                missingCount++; // Increment the count of cities without
                // valid data.

            } else {    // If it is a numeric figure:
                try {
                    double sales = Double.parseDouble(data);    // Convert
                    // the data to a number.
                    totalSales += sales;    // Add the sales to the total.
                } catch (NumberFormatException e) {
                    System.out.println("Error converting data to a number for" +
                            " city: " + city);  // Handle conversion error.
                }
            }   // end else
        }   // end while

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.printf("Can't open file \"%s\" for reading!%nPlease " +
                    "make sure the file is present before running the program" +
                    ".%n", file);
            System.exit(1); // Terminates the program.
        }

        /* Display the results */
        System.out.printf("Total sales recorded from all cities: $%,14" +
                ".2f%n%n", totalSales); // Print the total sales.

        if (missingCount == 0)
            System.out.println("Data was received from all cities.");
        else if (missingCount == 1) {
            System.out.println("Data was missing from 1 city.");
        } else
            System.out.printf("Data was missing from %d cities.%n", missingCount);

        /* Output:
        * Total sales recorded from all cities: $ 28,249,866.43

        * Data was missing from 19 cities.

        * Process finished with exit code 0
        * */

    }   // end main
}   // end class SalesFiguresEx5
