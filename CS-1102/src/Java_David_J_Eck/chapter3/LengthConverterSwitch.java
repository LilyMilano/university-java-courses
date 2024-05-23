package Java_David_J_Eck.chapter3;

import java.util.Scanner;

/**
 * This program will convert measurements expressed in inches,
 feet, yards, or miles into each of the possible units of measure.
 The measurement is input by the user, followed by the unit of measure.
 For example: "17 feet", "1 inch", or "2.73 mi".
 Abbreviations in, ft, yd, and mi are accepted.
 * The program will continue to read and convert measurements until the user
 enters an input of 0.
 */

public class LengthConverterSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int optionNumber;   // Option number from menu, selected by the user.
        double measurement;    // A numerical measurement, input by the user.
                                // The unit of measurement depends on which
                                // option the user has selected.
        double inches = 0;          // The same measurement, converted into inches.
        double feet, yards, miles;  // Measurement expressed in each
                                    // possible unit of measure.

        /* Display menu of options, and get user's selected option number. */
        System.out.print("""
                What unit of measurement does your input use?
                
                    1. inches
                    2. feet
                    3. yards
                    4. miles
                
                Enter the number of your choice:
                """);

        optionNumber = scanner.nextInt();

        /* Read user's measurement and convert to inches. */

        switch (optionNumber) {
            case 1 -> {
                System.out.println("Enter the number of inches: ");
                measurement = scanner.nextDouble();
                inches = measurement;
            }
            case 2 -> {
                System.out.println("Enter the number of feet: ");
                measurement = scanner.nextDouble();
                inches = measurement * 12;
            }
            case 3 -> {
                System.out.println("Enter the number of yards: ");
                measurement = scanner.nextDouble();
                inches = measurement * 36;
            }
            case 4 -> {
                System.out.println("Enter the number of miles: ");
                measurement = scanner.nextDouble();
                inches = measurement * 12 * 5280;
            }
            default -> {
                System.out.println("Error! Illegal option number! I quit!");
                System.exit(1);
            }
        }   // end switch

        /* Now go on to convert inches to feet, yards, and miles... */
        feet = inches / 12;
        yards = inches / 36;
        miles = inches / (12 * 5280);

        /* Output measurement in terms of each unit of measure. */

        System.out.printf("""
                    That's equivalent to:
                    %14.5g inches
                    %14.5g feet
                    %14.5g yards
                    %14.5g miles%n
                    """, inches, feet, yards, miles);

        /*
         *  ************************************************************************
         *
         * Alternatively, this example could be designed to ask the use to enter
         * the unit of measure as a string, instead of as an option number,
         * and then use that string directly in a switch statement:
         *  ************************************************************************
         */

        String units;   // Unit of measurement, entered by the user.
        double measurement2;    // A numerical measurement, input by the user.
        double inches2 = 0;
        double feet2, yards2, miles2;  // Measurement expressed in each
                                                // possible unit of measure.

        System.out.println("What unit of measurement does your input use? ");
        units = scanner.next().toLowerCase();
        System.out.println("Enter the number of " + units + ": ");
        measurement2 = scanner.nextDouble();

        switch (units) {
            case "inch", "inches", "in" -> inches2 = measurement2;
            case "foot", "feet", "ft" -> inches2 = measurement2 * 12;
            case "yard", "yards", "yd" -> inches2 = measurement2 * 36;
            case "mile", "miles", "mi" -> inches2 = measurement2 * 12 * 5280;
            default -> {
                System.out.println("Wait a minute! Illegal unit of measure! I" +
                        " quit!");
                System.exit(1);
            }
        }   // end switch

        feet2 = inches2 / 12;
        yards2 = inches2 / 36;
        miles2 = inches2 / ( 12 * 5280);

        System.out.printf("""
                    That's equivalent to:
                    %14.5g inches
                    %14.5g feet
                    %14.5g yards
                    %14.5g miles
                    """, inches2, feet2, yards2, miles2);

        /*
         *  *********************************************************************
        Output:

        What unit of measurement does your input use?

            1. inches
            2. feet
            3. yards
            4. miles

        Enter the number of your choice:
        3
        Enter the number of yards:
        1
        That's equivalent to:
            36.000 inches
            3.0000 feet
            1.0000 yards
            0.00056818 miles

        What unit of measurement does your input use?
        YARD
        Enter the number of yard:
        1
        That's equivalent to:
            36.000 inches
            3.0000 feet
            1.0000 yards
            0.00056818 miles

        Process finished with exit code 0
        */

    }   // end of main()
}   // end of class
