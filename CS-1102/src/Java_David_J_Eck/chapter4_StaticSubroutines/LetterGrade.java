package Java_David_J_Eck.chapter4_StaticSubroutines;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Return the letter grade corresponding to the numerical grade that is
 * passed to the function as a parameter.
 */

public class LetterGrade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the numerical grade between 0 and 100: ");
            int numGrade = scanner.nextInt();

            if (numGrade < 0 || numGrade > 100) {
                System.out.println("Invalid numerical grade. Please enter a " +
                        "grade" +
                        " between 0 and 100.");
            } else {
                System.out.println("The corresponding letter grade is " + letterGrade(numGrade));
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid numerical" +
                    " grade.");
        }

        /* Output:
         * Enter the numerical grade between 0 and 100: 71
         * The corresponding letter grade is C
         *
         * Process finished with exit code 0
         * */
    }   // end main()

    static char letterGrade(int numericalGrade) {
        if (numericalGrade >= 90)
            return 'A'; // 90 or above gets an A
        else if (numericalGrade >= 80)
            return 'B'; // 80 to 89 gets a B
        else if (numericalGrade >= 65)
            return 'C'; // 65 to 79 gets a C
        else if (numericalGrade >= 50)
            return 'D'; // 50 to 64 gets a D
        else
            return 'F'; // anything else gets an F
    }   // end of function letterGrade

}   // end class
