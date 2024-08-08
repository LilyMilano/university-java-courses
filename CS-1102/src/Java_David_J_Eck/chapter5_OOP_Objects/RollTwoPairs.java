package Java_David_J_Eck.chapter5_OOP_Objects;

/**
 * Main program that uses the PairOfDice class to count
 * how many times two pairs of dice are rolled before the two pairs come up showing the same
 * value.
 * */
public class RollTwoPairs {

    public static void main(String[] args) {

        PairOfDice firstDice;   // Refers to the first pair of dice.
        firstDice = new PairOfDice();

        PairOfDice secondDice;  // Refers to the second pair of dice.
        secondDice = new PairOfDice();

        int countRolls; // Counts how many times the two pairs of dice have
        // been rolled.

        int total1; // Total showing on a first pair of dice.
        int total2; // Total showing on second pair of dice.

        countRolls = 0;

        do {    // Roll the two pairs of dice until totals are the same.

            firstDice.roll();
            total1 = firstDice.die1 + firstDice.die2;   // Get total.
            System.out.println("First pair comes up " + total1);

            secondDice.roll();
            total2 = secondDice.die1 + secondDice.die2; // Get total
            System.out.println("Second pair comes up " + total2);

            countRolls++;   // Count this roll.

            System.out.println();

        } while (total1 != total2);

        System.out.println("It took " + countRolls + " rolls until the totals" +
                " were the same.");

        /* Output:
        * First pair comes up 8
        * Second pair comes up 2
        *
        * First pair comes up 7
        * Second pair comes up 4
        *
        * First pair comes up 2
        * Second pair comes up 10
        *
        * First pair comes up 5
        * Second pair comes up 5
        *
        * It took 4 rolls until the totals were the same.
        *
        * Process finished with exit code 0
        */

    }   // end main()
}   // end of class RollTwoPairs
