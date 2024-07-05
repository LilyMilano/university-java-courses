package Java_David_J_Eck.chapter4_StaticSubroutines;

import java.util.Scanner;

/**
 * A program that computes and displays several 3N+1 sequences. Starting
 * values for the sequences are input by the user. Terms in the sequence
 * are printed in columns, with five terms on each line of output.
 * After a sequence has been displayed, the number of terms in that
 * sequence is reported to the user.
 */

public class ThreeN1Revisited {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This program will print out 3N+1 sequences");
        System.out.println("for starting values that you specify.");
        System.out.println();

        int K; // Starting point for sequence, specified by the user.

        do {
            System.out.println("Enter a starting value,");
            System.out.print("To end the program enter 0: ");
            K = scanner.nextInt();  // get starting value from user

            if (K > 0)  // Print sequence, but only if K is > 0
                print3NSequence(K);
        } while (K > 0);    // Continue only if K > 0

        /* Output:
        * This program will print out 3N+1 sequences
        * for starting values that you specify.
        *
        * Enter a starting value,
        * To end the program enter 0: 3
        * The 3N+1 sequence starting from 3
        *
        *        3      10       5      16       8
        *        4       2       1
        *
        * There were 8 terms in the sequence.
        *
        * Enter a starting value,
        * To end the program enter 0: 0
        *
        * Process finished with exit code 0
        * */

    }   // end of main()

    /**
     * print3NSequence prints a 3N+1 sequence to standard output, using
     * startingValue as the initial value of N. It also prints the number
     * of terms in the sequence. The value of the parameter, startingValue,
     * must be a positive integer.
     */

    static void print3NSequence(int startingValue) {

        int N;  // One of the terms in the sequence.
        int count;  // The number of terms found.
        int onLine; // The number of terms that have been output so far on
        // the current line.

        N = startingValue;  // Start the sequence with startingValue;
        count = 1;  // We have one term so far.

        System.out.println("The 3N+1 sequence starting from " + N + "\n");
        System.out.printf("%8d", N);    // Print initial term, using 8
        // characters.
        onLine = 1; // There's now 1 term on current output line.

        while (N > 1) {
            N = nextN(N);   // Compute next term
            count++;    // count this term
            if (onLine == 5) {  // If current output line is full
                System.out.println();   // ...then output a carriage return
                onLine = 0; // ...and note that there are no terms on the new
                // line.
            }
            System.out.printf("%8d", N);    // Print this term in an 8-char
            // column.
            onLine++;   // Add 1 to the number of terms on this line.
        }

        System.out.println(); // end current line of output
        System.out.println(); // and then add a blank line
        System.out.println("There were " + count + " terms in the sequence.\n");
    }   // end of print3NSequence

    /**
     * * nextN computes and returns the next term in a 3N+1 sequence,
     * * given that the current term is currentN.
     */

    static int nextN(int currentN) {
        if (currentN % 2 == 1)
            return 3 * currentN + 1;
        else
            return currentN / 2;
    } // end of nextN()


}   // end of class
