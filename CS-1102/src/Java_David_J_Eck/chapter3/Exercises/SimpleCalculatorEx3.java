package Java_David_J_Eck.chapter3.Exercises;

import java.util.Scanner;

/**
 * This program evaluates simple expressions such as 2 + 2
 * and 34.2 * 7.81, consisting of a number, an operator,
 * and another number.  The operators +, -, *, / are allowed.
 * The program will read and evaluate expressions until
 * the user inputs a line that starts with the number 0.
 */

public class SimpleCalculatorEx3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double firstNum;    // First number in the expression.
        double secondNum;   // Second number in the expression.
        char operator;    // The operator in the expression.
        double value;       // The value of the expression.

        System.out.println("""
                Enter expressions such as 2 + 2 or 34.2 * 7.81
                using any of the operators +, -, *, /
                To end, enter a 0.""");

        while (true) {
            System.out.print("? ");

            try {
                // Read the first number from user input
                firstNum = scanner.nextDouble();
                if (firstNum == 0)
                    break;

                // Read the operator from user input
                operator = scanner.next().charAt(0);

                // Read the second number from user input
                secondNum = scanner.nextDouble();

                // Evaluate the expression using the enhanced switch statement
                value = switch (operator) {
                    case '+' -> firstNum + secondNum;  // Addition
                    case '-' -> firstNum - secondNum;  // Subtraction
                    case '*' -> firstNum * secondNum;  // Multiplication
                    case '/' -> {
                        if (secondNum != 0) {
                            yield firstNum / secondNum;  // Division
                        } else {
                            throw new ArithmeticException("Cannot divide by " +
                                    "zero.");
                        }
                    }
                    default ->
                            throw new IllegalArgumentException("Unknown " +
                                    "operator: " + operator);
                };

                // Display the value of the expression
                System.out.printf("Value is %15.2f%n", value);

            } catch (Exception e) {
                // Handle invalid input and clear the input stream
                System.out.println("Invalid input. Please try again.");
                scanner.nextLine();
                continue;  // Continue to the next iteration of the loop
            }

        }   // end while

        System.out.println("Goodbye");

        /*
         * Output:
         * Enter expressions such as 2 + 2 or 34.2 * 7.81
         * using any of the operators +, -, *, /
         * To end, enter a 0.
         * ? 10 + 10
         * Value is           20.00
         * ? 10 - 10
         * Value is            0.00
         * ? 10 * 10
         * Value is          100.00
         * ? 10 / 10
         * Value is            1.00
         * ? 10 / 0
         * Invalid input. Please try again.
         * ? 10 . 10
         * Invalid input. Please try again.
         * ? l + 1
         * Invalid input. Please try again.
         * ? 0
         * Goodbye

         * Process finished with exit code 0
         * */

    }   // end main()
}   // end class SimpleCalculatorEx3