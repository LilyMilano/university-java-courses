package Java_David_J_Eck.chapter4_StaticSubroutines.exercises;

/**
 * The given program is designed to perform an experiment where a pair of
 * dice is rolled repeatedly until a desired total comes up. The program then
 * counts the number of rolls required to achieve the desired total and
 * calculates the average number of rolls over a specified number of
 * experiments. The program prints out the average number of rolls for each
 * possible total from 2 to 12.
 */
public class DiceRollStats_4_4 {

    public static final int NUMBER_OF_EXPERIMENTS = 10000;

    /**
     * Calculates the average number of rolls to get a given total for each
     * possible total from 2 to 12.
     * Prints the total on dice and the average number of rolls.
     */
    public static void main(String[] args) {
        double averageRollCount;

        System.out.println("Total On Dice    Average Number of Rolls");
        System.out.println("_____________    _______________________");

        // Loop through each possible total from 2 to 12:
        for (int desiredTotal = 2; desiredTotal <= 12; desiredTotal++) {
            // Calculate the average number of rolls for the desired total.
            averageRollCount = getAverageRollCount(desiredTotal);
            System.out.printf("%10d%22.4f%n", desiredTotal, averageRollCount);
            // Use 10 spaces to output desiredTotal, and use 22 spaces to output
            // averageRollCount, with 4 digits after the decimal.
        }

        /* Output:
        *  Total On Dice    Average Number of Rolls
           _____________    _______________________
                    2               36.4526
                    3               18.0109
                    4               12.0515
                    5                9.0213
                    6                7.1011
                    7                5.9925
                    8                7.0282
                    9                8.9442
                   10               11.8133
                   11               18.0545
                   12               36.3018

        Process finished with exit code 0
        * */

    }   // end of main()

    /**
     * Calculates the average number of rolls to get a given total by
     * performing the experiment multiple times.
     *
     * @param desiredTotal the total that we want to get on the dice
     * @return the average number of rolls that it takes to get the specified
     * total
     * @throws IllegalArgumentException if the desiredTotal is not a valid
     *                                  total for a pair of dice
     */
    public static double getAverageRollCount(int desiredTotal) {
        int rollCountPerExperiment; // Number of rolls in one experiment.
        int totalRollCount = 0; // Total number of rolls in all the experiments.

        // Loop through the specified number of experiments.
        for (int i = 0; i < NUMBER_OF_EXPERIMENTS; i++) {
            // Get the number of rolls for the desired total.
            rollCountPerExperiment = rollFor(desiredTotal);
            // Add the number of rolls to the total count.
            totalRollCount += rollCountPerExperiment;
        }
        // Return the average number of rolls.
        return ((double) totalRollCount) / NUMBER_OF_EXPERIMENTS;
    }   // end of getAverageRollCount()

    /**
     * Simulates rolling a pair of dice until a given total comes up.
     *
     * @param desiredTotal the total that we want to get on the dice
     * @return the number of times the dice are rolled before the desired
     * total occurs
     * @throws IllegalArgumentException if the desiredTotal is not a valid
     *                                  total for a pair of dice
     */
    public static int rollFor(int desiredTotal) {
        if (desiredTotal < 2 || desiredTotal > 12) {
            throw new IllegalArgumentException("Impossible total for a pair " +
                    "of dice.");
        }
        int die1, die2; // Numbers between 1 and 6 representing the dice.
        int roll;   // Total showing on dice.
        int rollCount = 0;  // Number of rolls made.

        do {
            // Generate a random number between 1 and 6 for the first die.
            die1 = (int) (6 * Math.random()) + 1;
            // Generate a random number between 1 and 6 for the second die.
            die2 = (int) (6 * Math.random()) + 1;

            roll = die1 + die2; // Calculate the total roll.
            rollCount++;    // Increment the roll count.
        } while (roll != desiredTotal); // Repeat the loop until the desired
        // total is rolled.

        return rollCount;   // Return the number of rolls it took to reach
        // the desired total.
    }   // end of rollFor()

}   // end of class
