package Java_David_J_Eck.chapter4_StaticSubroutines;

import java.util.Scanner;

public class GuessingGame {

    /**
     * Write a program that plays a guessing game with the user. The computer
     * will choose a random number between 1 and 100, and the user will try
     * to guess it. The computer tells the user whether the guess is high or
     * low or correct. If the user gets the number after ten guesses or
     * fewer, the user wins the game. After each game,the user has the
     * option of continuing with another game.
     */


    public static void main(String[] args) {

        // Create a Scanner object to read user input:
        Scanner scanner = new Scanner(System.in);

        // Display the initial message to the user:
        System.out.println("""
                Let's play a game. I'll pick a number between
                1 and 100, and you try to guess it.""");

        boolean playAgain;  // store true if the user wants to play again

        // Allow the user to play the game multiple times:
        do {
            playGame(scanner); // Call subroutine to play one game.
            System.out.print("Would you like to play again? (true or false): ");

            // Handle user input for playing again:
            while (true) {
                try {
                    playAgain = scanner.nextBoolean();
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter 'true' or" +
                            " 'false'.");
                    scanner.nextLine(); // Clear the invalid input from the
                    // scanner
                }
            }   // end inner while loop
        } while (playAgain);

        // Display a farewell message when the user decides to stop playing:
        System.out.println("Thanks for playing. Goodbye.");

        scanner.close(); // Close the scanner to release system resources.
    }   // end main()

    // Subroutine to play the guessing game:
    static void playGame(Scanner scanner) {
        int computersNumber;    //A random number picked by the computer.
        int usersGuess; // A number entered by the user as a guess.
        int guessCount; // Number of guesses the user has made.

        // Generate a random number between 1 and 100 for the user to guess
        computersNumber = (int) (Math.random() * 100) + 1;

        guessCount = 0;
        System.out.print("\nWhat is your first guess? ");

        // Allow the user to make multiple guesses:
        while (true) {
            try {
                usersGuess = scanner.nextInt(); // Get the user's guess.
                guessCount++;

                // Check if the user's guess is correct:
                if (usersGuess == computersNumber) {
                    System.out.println("You got it in " + guessCount + " " +
                            "guesses!" +
                            " My " +
                            "number was " + computersNumber);
                    break;  // The game is over; the user has won.
                }
                // Check if the user has reached the maximum number of
                // guesses:
                if (guessCount == 10) {
                    System.out.printf("""
                            %nYou didn't get the number in 10 guesses.
                            You lose. My number was %d""", computersNumber);
                    System.out.println();
                    break;  // The game is over; the user has lost.
                }
                // If the game continues, inform the user if the guess was
                // too high or too low
                if (usersGuess < computersNumber) {
                    System.out.print("That's too low. Try again: ");
                } else if (usersGuess > computersNumber)
                    System.out.print("That's too high. Try again: ");

            } catch (Exception e) {
                // Handle invalid input and prompt the user to enter a valid
                // integer
                System.out.println("Invalid input. Please enter a integer " +
                        "between 1 and 100.");
                scanner.nextLine(); // Clear the invalid input from the scanner.
            }
        }   // end while loop

        System.out.println();

    }   // end playGame()

}   // end class
