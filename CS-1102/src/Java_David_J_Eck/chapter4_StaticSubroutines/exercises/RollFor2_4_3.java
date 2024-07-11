package Java_David_J_Eck.chapter4_StaticSubroutines.exercises;

/**
 * Write a function that simulates rolling a pair of dice until the total on
 * the dice comes up to be a given number. The number that you are rolling
 * for is a parameter to the function. The number of times you have to roll
 * the dice is the return value of the function. The parameter should be one
 * of the possible totals: 2, 3, ..., 12. The function should throw an
 * IllegalArgumentException if this is not the case. Use your function in a
 * program that computes and prints the number of rolls it takes to get snake
 * eyes. (Snake eyes means that the total showing on the dice is 2.)
 */
public class RollFor2_4_3 {

    public static void main(String[] args) {
        try {
        System.out.println("It took " + rollFor(2) + " rolls to get snake " +
                "eyes.");
        } catch (IllegalArgumentException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        /* Output:
        * It took 12 rolls to get snake eyes.
        *
        * Process finished with exit code 0
        */
    }   // end of main()

    /**
     * Simulates rolling a pair of dice until a given total comes up.
     * @precondition The desired total is between 2 and 12, inclusive.
     *
     * @param N the total that we want to get on the dice
     * @return the number of times the dice are rolled before the
     * desired total occurs
     * @throws IllegalArgumentException if the parameter, N, is not a number
     *                                  that could possibly come up on a pair
     *                                  of dice
     */
    public static int rollFor(int N) {
        if (N < 2 || N > 12) {
            throw new IllegalArgumentException("Impossible total for a pair " +
                    "of dice.");
        }

        int rollCount = 0;  // Numbers between 1 and 6 representing the dice.
        int die1, die2; // Numbers between 1 and 6 representing the dice.
        int roll;   // Total showing on dice.

        do {
            die1 = (int) (6 * Math.random()) + 1;
            die2 = (int) (6 * Math.random()) + 1;
            roll = die1 + die2;
            rollCount++;
        } while (roll != N);

        return rollCount;
    }   // end of rollFor()
}   // end of class
