package Java_David_J_Eck.chapter3;

import java.util.Scanner;

enum Season {
    SPRING, SUMMER, FALL, WINTER
}

/**
 * This program utilizes the Season enum, which represents the four seasons:
 * SPRING, SUMMER, FALL, and WINTER.
 * The user is prompted to enter the current season and the program will display
 * the corresponding months associated with the selected season.
 * The user can choose to exit the program by entering EXIT.
 * */

public class EnumInSwitchStatement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Season currentSeason;   // Store the current season selected by the user

        do {
            // Prompt the user to enter the current season:
            System.out.println("Enter the current season (SPRING, SUMMER, " +
                    "FALL, WINTER, EXIT to Exit):");

            String seasonInput = scanner.nextLine().toUpperCase();

            // Check if the user wants to exit the program:
            if (seasonInput.equals("EXIT")) {
                System.out.println("Exiting the program...");
                break;
            }

            try {
                // Convert the user input to the corresponding Season enum:
                currentSeason = Season.valueOf(seasonInput);
            }
            catch (IllegalArgumentException e) {
                // Handle invalid input by displaying an error message and
                // continue to the next iteration:
                System.out.println("Invalid season entered. Please try again.");
                continue;   // The continue statement is then used to skip the
                            // remaining code inside the loop and start the next
                            // iteration, allowing the user to enter a valid
                            // season again.
            }

            // Display the months for the selected season:
            System.out.print("The months in " + currentSeason + " are: ");

            switch (currentSeason) {
                case SPRING -> System.out.println("March, April, May");
                case SUMMER -> System.out.println("June, July, August");
                case FALL -> System.out.println("September, October, November");
                case WINTER -> System.out.println("December, January, " +
                        "February");
            }   // end switch

        } // end do
        while (true);

        scanner.close();

        /* Output:
        Enter the current season (SPRING, SUMMER, FALL, WINTER, EXIT to Exit):
        fall
        The months in FALL are: September, October, November
        Enter the current season (SPRING, SUMMER, FALL, WINTER, EXIT to Exit):
        winter
        The months in WINTER are: December, January, February
        Enter the current season (SPRING, SUMMER, FALL, WINTER, EXIT to Exit):
        Spring
        The months in SPRING are: March, April, May
        Enter the current season (SPRING, SUMMER, FALL, WINTER, EXIT to Exit):
        SUMMER
        The months in SUMMER are: June, July, August
        Enter the current season (SPRING, SUMMER, FALL, WINTER, EXIT to Exit):
        SUMME
        Invalid season entered. Please try again.
        Enter the current season (SPRING, SUMMER, FALL, WINTER, EXIT to Exit):
        exit
        Exiting the program...

        Process finished with exit code 0
        */

    }   // end of main()
}   // end of class
