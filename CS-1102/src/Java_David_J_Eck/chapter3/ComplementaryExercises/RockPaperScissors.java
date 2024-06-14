package Java_David_J_Eck.chapter3.ComplementaryExercises;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Write a program that simulates the game of rock, paper, scissors.
 * The user enters their choice and the computer makes a random choice.
 * The program should simulate this game continuously until the user
 * decides to quit.
 */

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Enter your choice (rock = 1, paper = 2, " +
                    "scissors = 3). Press 0 to quit: ");

            try {

                int userChoice = scanner.nextInt();

                if (userChoice == 0) {
                    System.out.println("Exiting...");
                    scanner.close();    // Close the scanner
                    System.exit(0); // Exit the program
                }

                switch (userChoice) {
                    case 1 -> System.out.println("Your choice was: Rock 🪨");
                    case 2 -> System.out.println("Your choice was: Paper 🗞️");
                    case 3 ->
                            System.out.println("Your choice was: Scissors ✂️");
                    default -> {
                        System.out.println("Invalid selection. Try again.");
                        continue;
                    }
                }

                int computerChoice = (int) (Math.random() * 3) + 1;

                switch (computerChoice) {
                    case 1 -> System.out.println("Computer choice was: Rock " +
                            "🪨");
                    case 2 ->
                            System.out.println("Computer choice was: Paper " +
                                    "🗞️");
                    default ->
                            System.out.println("Computer choice was: Scissors" +
                                    " " +
                                    "✂️");
                }

                if (userChoice == 1 && computerChoice == 1 || userChoice == 2 && computerChoice == 2 || userChoice == 3 && computerChoice == 3) {
                    System.out.println("You tied!");
                } else if (userChoice == 1 && computerChoice == 3 || userChoice
                        == 2 && computerChoice == 1 || userChoice == 3 && computerChoice == 2) {
                    System.out.println("You won!");
                } else
                    System.out.println("You lost!");

                /* Output:
                 * Enter your choice (rock = 1, paper = 2, scissors = 3).
                 * Press 0 to quit: 3
                 * Your choice was: Scissors ✂️
                 * Computer choice was: Scissors ✂️
                 * You tied!
                 * Enter your choice (rock = 1, paper = 2, scissors = 3).
                 * Press 0
                 * to quit: 0
                 * Exiting...
                 *
                 * Process finished with exit code 0
                 * * */

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid " +
                        "integer.");
                scanner.nextLine(); // Clear the input buffer
                continue;
            }

        }   // end of while loop
    }   // end main()
}   // end class
