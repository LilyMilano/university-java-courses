package Java_David_J_Eck.chapter3.ComplementaryExercises;

/**
 * How many times do you have to flip a coin before it comes up heads three
 * times in a row? Write a computer program that simulates this experiment.
 * The program should report the number of flips it makes before the coin
 * comes up heads three times consecutively.
 * */

public class CoinFlipSimulation {

    public static void main(String[] args) {

    /* Initialize variables */
    int flips = 0;  // Keep track of the number of coin flips.
    int consecutiveHeads = 0;   // Keep track of the number of consecutive
    // heads.

    /* Start a loop that continues until consecutiveHeads reaches 3 */
    do {

        int headOrTail = (int)(Math.random()*2);    // Inside the loop,
        // simulate flipping a coin by generating a random number (0 or 1)
        // representing heads or tails.
        flips++;    // Increment flips by 1.

        if (headOrTail == 0)    // If the result is heads (0), increment
            // consecutiveHeads by 1.
            consecutiveHeads++;
        else if (headOrTail == 1)   // If the result is tails (1), reset
            // consecutiveHeads to 0.
            consecutiveHeads = 0;
        else
            System.out.println("An error occurred. Let's try again.");

    } while( consecutiveHeads != 3);

    /* After the loop ends, output the total number of flips (flips) it took to
    get three consecutive heads.*/

        System.out.println("Consecutive Heads: " + consecutiveHeads);

        System.out.println("It took " + flips + " coin flips to get 3 " +
                "consecutive heads");

        /*
        * Output:
        * Consecutive Heads: 3
        * It took 7 coin flips to get 3 consecutive heads
        *
        * Process finished with exit code 0
        */

    }   // end main()

}   // end class
