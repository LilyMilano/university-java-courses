package Java_David_J_Eck.chapter3.ComplementaryExercises;

import java.util.Scanner;

/**
 * This class implements a vocational personality test that asks the user a
 * series of questions and determines if they are an artist, engineer, or
 * teacher based in their responses.
 */
public class VocationalTest {

    /**
     * The main method that runs the vocational personality test.
     * It collects user input and evaluate the results.
     *
     * @param args Command line arguments (not used in this program)
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);   // Create a Scanner
        // object to read user input from the console.

        // Run the test and get the results:
        int[] results = runTest(scanner);

        // Output the results based on the counts of responses:
        displayResults(results);

        // Close the scanner to prevent resource leaks:
        scanner.close();

        /*
         * Output:
         * 1. Which of these activities do you enjoy the most?
         * A. Creating art
         * B. Solving problems
         * C. Teaching others
         * Select A, B, or C: ART
         * Please enter a single character (A, B or, C).
         * Select A, B, or C: b
         * 2. How do you prefer to work?
         * A. Independently
         * B. In a team
         * C. Guiding others
         * Select A, B, or C: G
         * Invalid option. Please try again.
         * Select A, B, or C: B
         * 3. What type of projects do you like?
         * A. Creative
         * B. Technical
         * C. Educational
         * Select A, B, or C: B
         * 4. Do you feel more comfortable in an environment?
         * A. Creative
         * B. Structured
         * C. Collaborative
         * Select A, B, or C: a
         * 5. What do you value most in your work?
         * A. Expression
         * B. Innovation
         * C. Knowledge
         * Select A, B, or C: b
         * 6. How would you describe your learning style?
         * A. Visual
         * B. Practical
         * C. Theoretical
         * Select A, B, or C: a
         * 7. What motivates you the most in your career?
         * A. Passion for creativity
         * B. Desire for innovation
         * C. Commitment to education
         * Select A, B, or C: a
         *
         * Results:
         * You are an ** engineer **.
         *
         * Process finished with exit code 0
         */

    }   // end of main

    /**
     * Asks a question and displays the available options.
     *
     * @param question The question to be asked.
     * @param options  The available options for the question.
     */
    private static void askQuestion(String question, String[] options) {
        System.out.println(question);
        for (int j = 0; j < options.length; j++) {
            System.out.println(options[j]);
        }
    }   // end of askQuestion()

    /**
     * Prompts the user for a valid response and returns it.
     *
     * @param scanner The scanner object for reading user input.
     * @return The user's response as a character (A, B, or C).
     */
    private static char getResponse(Scanner scanner) {
        char response = ' ';
        boolean validResponse = false;// Flag to check if the response is valid.

        // Prompt for valid input until the user provides A, B, or C
        while (!validResponse) {
            System.out.print("Select A, B, or C: ");

            try {
                String input = scanner.next();  // Read user input as a string.

                if (input.length() != 1) {  // Check if input is a single
                    // character.
                    throw new IllegalArgumentException("Please enter a single" +
                            " character (A, B or, C).");
                }
                response = input.toUpperCase().charAt(0);  // Convert to
                // uppercase, and get the first
                // character

                // Validate the response within the try block
                if (response != 'A' && response != 'B' && response != 'C') {
                    throw new IllegalArgumentException("Invalid option. " +
                            "Please try again.");
                }
                validResponse = true;   // Set flag to true if response is valid
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage()); // Print the exception
                // message
            } catch (Exception e) {
                System.out.println("Input error. Please select A, B, or C."); // Handle any other exceptions
                scanner.next(); // Clear the scanner buffer on error
            }

        }   // end while loop

        return response;   // Return the valid response
    }   // end of getResponse()

    /**
     * Runs the vocational personality test by asking questions and
     * collecting responses.
     *
     * @param scanner The Scanner object for reading user input
     * @return An array containing the counts of responses for A, B, and C
     */
    private static int[] runTest(Scanner scanner) {
        int countA = 0, countB = 0, countC = 0; // Initialize counters for
        // each response option (A, B, C)

        // Array of questions for the test
        String[] questions = {
                "1. Which of these activities do you enjoy the most?",
                "2. How do you prefer to work?",
                "3. What type of projects do you like?",
                "4. Do you feel more comfortable in an environment?",
                "5. What do you value most in your work?",
                "6. How would you describe your learning style?",
                "7. What motivates you the most in your career?"
        };

        // Two-dimensional array of options for each question
        String[][] options = {
                {"A. Creating art", "B. Solving problems", "C. Teaching " +
                        "others"},
                {"A. Independently", "B. In a team", "C. Guiding others"},
                {"A. Creative", "B. Technical", "C. Educational"},
                {"A. Creative", "B. Structured", "C. Collaborative"},
                {"A. Expression", "B. Innovation", "C. Knowledge"},
                {"A. Visual", "B. Practical", "C. Theoretical"},
                {"A. Passion for creativity", "B. Desire for innovation", "C." +
                        " Commitment to education"}
        };

        // Loop through each question:
        for (int i = 0; i < questions.length; i++) {
            askQuestion(questions[i], options[i]);  // Ask the question and
            char response = getResponse(scanner);   // get the user's response.

            // Count the responses based on user selection:
            if (response == 'A')
                countA++;
            else if (response == 'B')
                countB++;
            else if (response == 'C')
                countC++;
        }

        return new int[]{countA, countB, countC};   // Return the counts as
        // an array of int.

    }   // end of runTest()

    /**
     * Displays the results of the test based on the counts of responses.
     *
     * @param results An array containing the counts of responses for A, B,
     *                and C.
     */
    private static void displayResults(int[] results) {
        System.out.println("\nResults:");

        if (results[0] > results[1] && results[0] > results[2]) {
            System.out.println("You are an ** artist **.");
        } else if (results[1] > results[0] && results[1] > results[2]) {
            System.out.println("You are an ** engineer **.");
        } else if (results[2] > results[0] && results[2] > results[1]){
            System.out.println("You are a ** teacher **.");
        } else
            System.out.println("Undefined results. You are a ** divergent **.");
    }   // end of displayResults()

}   // end of class VocationalTest
