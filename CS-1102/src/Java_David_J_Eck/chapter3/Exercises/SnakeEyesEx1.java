package Java_David_J_Eck.chapter3.Exercises;

/** 1. How many times do you have to roll a pair of dice before they come up snake eyes? You
 could do the experiment by rolling the dice by hand. Write a computer program that
 simulates the experiment. The program should report the number of rolls that it makes
 before the dice come up snake eyes. (Note: “Snake eyes” means that both dice show a
 value of 1.) Exercise 2.2 explained how to simulate rolling a pair of dice.*/

public class SnakeEyesEx1 {

    public static void main(String[] args) {

        // Declaring variables:
        int countRolls = 0; // The number of rolls made before snake eyes.
        int die1;   // The value of the first  die.
        int die2;   // The value of the second die.

        do {
            // Rolling the pair of dice
            die1 = (int) (Math.random() * 6) + 1;   // Generates a random
            // number between 1 and 6 for die1.
            die2 = (int) (Math.random() * 6) + 1;   // Generates a random
            // number between 1 and 6 for die2.

            countRolls++;   // Increment the roll count by 1.

            // Checking Snake eye ( continuation condition)
        } while (die1 != 1 || die2 != 1);   // Continue rolling until both
        // dice show a value of 1.

        // Output the number of rolls that it makes before the dice come up
        // snake eye:
        System.out.printf("%nThe number of rolls before the dice come up " +
                "snake eye " +
                "was: %d.%n", countRolls);

        /*
        * Output:
        * The number of rolls before the dice come up snake eye was: 8.

        * Process finished with exit code 0
        * */

    }   // end main()
}   // end class
