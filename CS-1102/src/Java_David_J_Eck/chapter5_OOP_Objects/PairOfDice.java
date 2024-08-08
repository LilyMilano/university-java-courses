package Java_David_J_Eck.chapter5_OOP_Objects;

public class PairOfDice {

    // Instance Variables:
    public int die1;    // Number showing on the first die.
    public int die2;    // Number showing on the second die.

    // Constructors:
    public PairOfDice() {
        // Constructor. Rolls the dice, so that they initially show some
        // random values.
        roll(); // Call the roll() method to roll the dice.
    }
    public PairOfDice(int val1, int val2) {
        // Constructor. Create a pair of dice that are initially showing the
        // values val1 and val2.
        die1 = val1;    // Assign specified values to the instance variables.
        die2 = val2;
    }

    // Methods:
    public void roll() {
        // Roll the dice by setting each of the dice to be a random number
        // between 1 and 6.
        die1 = (int)(Math.random() * 6) + 1;
        die2 = (int)(Math.random() * 6) + 1;
    }
}   // end class PairOfDice
