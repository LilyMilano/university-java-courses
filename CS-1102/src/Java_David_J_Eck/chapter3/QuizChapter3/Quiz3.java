package Java_David_J_Eck.chapter3.QuizChapter3;

import java.util.Scanner;

public class Quiz3 {

    public static void main(String[] args) {

        /*
         * 7. Write a for loop that will print out all the multiples of 3
         * from 3 to 36,
         * that is: 3 6 9 12 15 18 21 24 27 30 33 36.
         * */

        for (int i = 1; i <= 12; i++) {
            int multiple = 3 * i;
            System.out.print(multiple + " ");
        }

        System.out.println();

        for (int i = 3; i <= 36; i += 3) {
            System.out.print(i + " ");
        }

        /* Output:
         * 3 6 9 12 15 18 21 24 27 30 33 36
         * 3 6 9 12 15 18 21 24 27 30 33 36
         * Process finished with exit code 0
         */
        // *****************************************************************************
        /*
         * 8. Write a program to ask the user
         * to enter an integer, read the user’s response, and tell the user
         * whether the number entered is even or odd. ( Recall that an integer
         *  n is even if n % 2 == 0.)
         * */

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPlease, enter an integer: ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("Your number is 0");
        } else if (number % 2 == 0) {
            System.out.println("Your number is even.");
        } else
            System.out.println("Your number is odd.");

        /* Output:
         * Please, enter an integer: 22
         * Your number is even.
         *
         * Process finished with exit code 0
         * */
        System.out.println();
        // *****************************************************************************

        /*
         * 9. Write a code segment that will print out two different random
         * integers selected from the range 1 to 10. All possible outputs
         * should have the same probability. Hint: You can easily select two
         * random numbers, but you have to account for the fact that the two
         * numbers that you pick might be the same.
         * */
        System.out.println("Here two different random integers from 1 to " +
                "10: ");

        while (true) {
            int number1 = (int) (Math.random() * 10) + 1;
            int number2 = (int) (Math.random() * 10) + 1;

            if (number1 != number2) {
                System.out.println("Number 1: " + number1);
                System.out.println("Number 2: " + number2);
                break;
            } else {
                System.out.println("The two integers are equal. Let's try " +
                        "again:");
            }
        } // end while

        /* Output:
         * Here two different random integers from 1 to 10:
         * The two integers are equal. Let's try again:
         * Number 1: 5
         * Number 2: 2
         * */
        System.out.println();
        // *****************************************************************************

        /*
         * 10. Suppose that s1 and s2 are variables of type String, whose
         * values are
         * expected to be string representations of values of type int. Write a
         * code segment that will compute and print the integer sum of those
         * values, or will print an error message if the values cannot
         * successfully be converted into integers. (Use a try..catch
         * statement.)
         */
        System.out.print("Enter the first string: ");
        String s1 = scanner.next();

        System.out.print("Enter the second string: ");
        String s2 = scanner.next();

        try {
            int num1 = Integer.parseInt(s1);
            int num2 = Integer.parseInt(s2);

            int sum = num1 + num2;

            System.out.println("The sum is: " + sum);

        } catch (NumberFormatException e) {
            System.out.println("Error: Cannot convert the strings to integers" +
                    ".");
        }

        /* Output:
         * Enter the first string: 111
         * Enter the second string: 222
         * The sum is: 333
         */

        System.out.println();

// *****************************************************************************

        /* 11. Show the exact output that would be produced by the following
        main() routine:
         */

        int N;
        N = 1;
        while (N <= 32) {
            N = 2 * N;
            System.out.println(N);
        }

        /* Output:
         * 2
         * 4
         * 8
         * 16
         * 32
         * 64
         */
        System.out.println();

// *****************************************************************************

        /* 12. Show the exact output produced by the following main() routine:
         * */

        // public static void main(String[] args) {
        int x, y;
        x = 5;
        y = 1;
        while (x > 0) {
            x = x - 1;
            y = y * x;
            System.out.println(y);
        }

        /* Output:
         * 4
         * 12
         * 24
         * 24
         * 0
         * */

        //}
        System.out.println();
// *****************************************************************************

        /* 13. What output is produced by the following program segment?
        Why? (Recall that name.charAt(i) is the i-th character in the string,
        name.) */

        String name;
        int i;
        boolean startWord;
        name = "Richard M. Nixon";
        startWord = true;
        for (i = 0; i < name.length(); i++) {
            if (startWord)
                System.out.println(name.charAt(i));
            if (name.charAt(i) == ' ')
                startWord = true;
            else
                startWord = false;
        }

        /*
         * R
         * M
         * N
         * * */

        /* Explanation:
        The whitespace character ' ' is responsible for setting startWord
        to true. Then, in the next iteration, when the following
        character (the first letter after the whitespace) is tested,
        hence the flag is true, the first letter of the word is printed.
        */

        System.out.println();

// *****************************************************************************
        /*
         * 14. Suppose that numbers is an array of type int[ ].
         * Write a code segment that will count and output the number of times
         * that the number 42 occurs in the array.*/

        int[] numbers = {4, 12, 1, 42, 7, 11, 42, 22, 10, 11, 7, 42, 33};
        int count = 0;
        for (int j = 0; j < numbers.length; j++) {

            if (numbers[j] == 42)
                count++;
        }

        System.out.printf("The number 42 occurs %d times in the array.", count);

        /* Output:
         * The number 42 occurs 3 times in the array.
         * Process finished with exit code 0
         * */

        System.out.println();

// *****************************************************************************
        /*
         * 15. Define the range of an array of numbers to be the maximum
         * value in the array minus the minimum value. Suppose that raceTimes
         * is an array of type double[ ]. Write a code segment that will find
         * and print the range of raceTimes.*/

        // Suppose raceTimes is an array of type double[]:
        double[] raceTimes = {9.5, 10.2, 8.7, 11.1, 9.9};

        // Initialize min and max to the first element of raceTimes:
        double min = raceTimes[0];
        double max = raceTimes[0];

        // Iterate over the elements of raceTimes looking for the max and min
        // values in the array:
        for (int j = 1; j < raceTimes.length ; j++) {
            if(raceTimes[j] < min)
                min = raceTimes[j];
            else if (raceTimes[j] > max ) {
                max = raceTimes[j];
            }
        }   // end for loop

        // Calculate the range:
        double range = max - min;

        // Print the range:
        System.out.printf("%nThe range of raceTimes is: %1.2f%n", range);

        /* Output:
        * The range of raceTimes is: 2.40

        * Process finished with exit code 0
        * */

// *****************************************************************************
        scanner.close();

    }   // end main()
}   // end class
