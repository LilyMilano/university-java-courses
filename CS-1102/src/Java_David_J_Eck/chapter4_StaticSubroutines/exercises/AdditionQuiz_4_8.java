package Java_David_J_Eck.chapter4_StaticSubroutines.exercises;

import java.util.Scanner;

/**
 * This program administers a ten-question addition quiz to the user.  The
 * numbers
 * for the problem are chosen at random.  The numbers and the answers are one or
 * two digits.  After asking the user the ten questions, the computer grades the
 * quiz, telling the user the correct answer for any problem they got wrong.
 */
public class AdditionQuiz_4_8 {
    static Scanner scanner = new Scanner(System.in);   // global scanner

    public static void main(String[] args) {
        int[] firstNums = new int[10];  // The first numbers in the ten problems
        int[] secondNums = new int[10]; // The second numbers in the ten
        // problems
        int[] answers = new int[10];    // The user's answers
        System.out.println("ADDITION QUIZ:");
        createQuiz(firstNums, secondNums);
        administerQuiz(firstNums, secondNums, answers);
        gradeQuiz(firstNums, secondNums, answers);

        /* Output:
        * ADDITION QUIZ:
        * Question  1: What is 36 +  7  ? 43
        * Question  2: What is 31 + 34  ? 65
        * Question  3: What is  8 + 16  ? 24
        * Question  4: What is 35 +  6  ? 41
        * Question  5: What is 24 + 48  ? 70
        * Question  6: What is 13 + 41  ? 54
        * Question  7: What is 14 + 38  ? 52
        * Question  8: What is  8 + 13  ? 21
        * Question  9: What is 50 + 11  ? 61
        * Question 10: What is  4 + 38  ? 42
        *
        * Here are the correct answers:
        *     Question  1: 36 +  7 = 43.    You were CORRECT.
        *     Question  2: 31 + 34 = 65.    You were CORRECT.
        *     Question  3:  8 + 16 = 24.    You were CORRECT.
        *     Question  4: 35 +  6 = 41.    You were CORRECT.
        *     Question  5: 24 + 48 = 72.    You said 70, which is INCORRECT.
        *     Question  6: 13 + 41 = 54.    You were CORRECT.
        *     Question  7: 14 + 38 = 52.    You were CORRECT.
        *     Question  8:  8 + 13 = 21.    You were CORRECT.
        *     Question  9: 50 + 11 = 61.    You were CORRECT.
        *     Question 10:  4 + 38 = 42.    You were CORRECT.
        *
        * You got 9 questions correct.
        * Your grade on the quiz is 90
        *
        *
        * Process finished with exit code 0
        */
    }   // end of main()

    /**
     * Creates the arrays that hold the numbers for the questions and fills
     * them with random numbers.  The parameters are arrays that will hold
     * the random numbers for the first and second operands of each addition
     * problem.  The arrays must have already been created when this subroutine
     * is called!
     */
    private static void createQuiz(int[] firstNumbers, int[] secondNumbers) {
        for (int i = 0; i < 10 ; i++) {
            firstNumbers[i] = (int)(Math.random() * 50 + 1);    // in the
            // range 1 to 50
            secondNumbers[i] = (int)(Math.random() * 50);   // in the range 0
            // to 49
        }
    }   // end of createQuiz()

    /**
     * Asks the user each of the ten quiz questions and gets the user's answers.
     * The first two parameters hold the operands for the quiz questions.
     * The user's
     * answers to the ten problems will be stored in the third array.  All
     * arrays
     * exist before this subroutine is called, and the first two arrays have
     * already been filled with values.
     */
    private static void administerQuiz(int[] firstNumbers,
                                        int[] secondNumbers,
                                        int[] userAnswers) {
        for (int i = 0; i < 10 ; i++) {
            int questionNumber = i + 1;
            System.out.printf("Question %2d: What is %2d + %2d  ? ",
                    questionNumber, firstNumbers[i], secondNumbers[i]);
            userAnswers[i] = scanner.nextInt();
        }
    }   // end of administerQuiz()

    /**
     * Shows all the questions, with their correct answers, and computes a grade
     * for the quiz.  For each question, the user is told whether they got
     * it right.  The first two parameters hold the operands for the quiz questions,
     * and the third parameter holds the answers that the user gave to the quiz.
     */
    private static void gradeQuiz(int[] firstNumbers, int[] secondNumbers,
                                    int[] userAnswers) {
        System.out.println();
        System.out.println("Here are the correct answers: ");
        int correctAnswerCounter = 0;
        int grade;
        for (int i = 0; i < 10 ; i++) {
            int questionNum = i + 1;
            int correctAnswer = firstNumbers[i] + secondNumbers[i];
            System.out.printf("    Question %2d: %2d + %2d = %2d.    ",
                    questionNum, firstNumbers[i], secondNumbers[i], correctAnswer);
            if (userAnswers[i] == correctAnswer) {
                System.out.println("You were CORRECT.");
                correctAnswerCounter++;
            }
            else {
                System.out.println("You said " + userAnswers[i] + ", which is" +
                        " INCORRECT.");
            }
        }   // end for loop
        grade = correctAnswerCounter * 10;
        System.out.println();
        System.out.println("You got " + correctAnswerCounter + " questions " +
                "correct.");
        System.out.println("Your grade on the quiz is " + grade);
        System.out.println();
    }   // end of gradeQuiz()
}   // end of class
