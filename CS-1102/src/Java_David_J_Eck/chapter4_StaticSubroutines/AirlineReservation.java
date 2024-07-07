package Java_David_J_Eck.chapter4_StaticSubroutines;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class represents an Airline Reservation system.
 * It allows users to view available seats, reserve a seat, or exit the program.
 */

public class AirlineReservation {

    /**
     * The main method of the AirlineReservation class.
     * It displays a menu and handles user input.
     *
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        // declaring local variables
        boolean[] seats = new boolean[11];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to XYZ Airlines");

        while (true) {
            try {
                System.out.println("""
                        \nPlease select an option:
                        1. View available seats
                        2. Reserve a seat
                        3. Exit
                        """);
                int userChoice = scanner.nextInt();

                switch (userChoice) {
                    case VIEW_SEATS_OPTION -> {
                        displaySeats(seats);
                        break;
                    }
                    case RESERVE_SEAT_OPTION -> {
                        reserveSeat(seats, scanner);
                        break;
                    }
                    case EXIT_OPTION -> {
                        System.out.println("Thank you for using XYZ Airlines.");
                        System.exit(0);
                    }
                    default ->
                            System.out.println("Invalid option. Please try " +
                                    "again.\n");
                }   // end of switch case

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid " +
                        "option.\n");
                scanner.nextLine(); // Clear the invalid input from the scanner
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }   // end of while loop
    }   // end of main()

    /**
     * This method displays the available seats.
     * It prints the seat number and its availability status.
     */

    public static void displaySeats(boolean[] seats) {
        System.out.println("Seats:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Seat " + i + ": " + (!seats[i] ?
                    "Available" : "Reserved"));
        }
    }   // end of displaySeats

    /**
     * This method allows the user to reserve a seat.
     * It prompts the user to enter a seat number and reserves the seat if it
     * is available.
     * If the seat is already reserved, it displays a message indicating that.
     */

    public static void reserveSeat(boolean[] seats, Scanner scanner) {
        System.out.println("Enter seat number to reserve: ");
        int seat = scanner.nextInt();

        if (isValidSeat(seat)) {
            if (!seats[seat]) {
                seats[seat] = true;
                System.out.println("Seat " + seat + " reserved successfully.");
            } else {
                System.out.println("Seat " + seat + " is already reserved.");
            }
        } else {
            System.out.println("Invalid seat number. Please try again.");
        }
    }   // end of reserveSeat()

    public static boolean isValidSeat(int seat) {
        return seat >= 1 && seat <= 10;
    }

    // Constants for switch case options
    private static final int VIEW_SEATS_OPTION = 1;
    private static final int RESERVE_SEAT_OPTION = 2;
    private static final int EXIT_OPTION = 3;

}   // end of class
