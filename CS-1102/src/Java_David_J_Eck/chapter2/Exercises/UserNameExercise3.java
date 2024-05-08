package Java_David_J_Eck.chapter2.Exercises;

import java.util.Scanner;

public class UserNameExercise3 {

    /**
     * 3. Write a program that asks the user’s name, and then greets the user by name. Before
     * outputting the user’s name, convert it to upper case letters. For example, if the user’s
     * name is Fred, then the program should respond “Hello, FRED, nice to meet you!”.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);   // Create the scanner.

        String userName;    // user's name variable received as scanner input.

        System.out.print("Please, enter your full name: ");
        userName = scanner.nextLine();

        System.out.printf("Hello, %s, nice to meet you!%n",
                userName.toUpperCase());

        scanner.close();

        /*
        * Output:
        * Please, enter your full name: fred
        * Hello, FRED, nice to meet you!
        */

    }   // end of main()
}   // end of class
