package Java_David_J_Eck.chapter4_StaticSubroutines;

/**
 * Write a program that prints the 3N+1 sequence starting from a given value.
 * The program should have the following functionality:
 * Define a nextN method that takes an integer currentN as a parameter and
 * returns the next term in the sequence based on the rules: if currentN is
 * odd, the next term is 3*currentN+1, otherwise, the next term is currentN/2.
 * Define a print3NSequence method that takes a starting value as a parameter
 * . This method should print the 3N+1 sequence starting from the given value
 * . It should use a loop to compute and print each term in the sequence
 * until the value becomes 1. Additionally, it should keep track of the count
 * of terms in the sequence.
 * In the main method, call the print3NSequence method with a starting value
 * of 3. Print the initial term of the sequence and then iterate through the
 * sequence, printing each subsequent term. Finally, print the total number
 * of terms in the sequence.
 */

public class Print3N1WithReturn {

    public static void main(String[] args) {
        print3NSequence(3);

        /* Output:
         * The 3N+1 sequence starting from 3

         * 3
         * 10
         * 5
         * 16
         * 8
         * 4
         * 2
         * 1
         *
         * There were 8 terms in the sequence.
         *
         * Process finished with exit code 0
         * */
    }   // end main()

    static int nextN(int currentN) {
        int answer; // answer will be the value returned.
        if (currentN % 2 == 1)  // test if currentN is odd.
            answer = 3 * currentN + 1;  // if so, this is the answer.
        else
            answer = currentN / 2;    // if not, this is the answer.
        return answer;  // (Don't forget to return the answer!)
    }

    static void print3NSequence(int startingValue) {
        int N;  // One of the terms of the sequence.
        int count;  // The number of terms found.

        N = startingValue;  // Start the sequence with startingValue.
        count = 1;

        System.out.println("The 3N+1 sequence starting from " + N + "\n");
        System.out.println(N);  // Print the initial term of sequence

        while (N > 1) {
            N = nextN(N);   // Compute next term, using the function nextN.
            count++;    // Count this term.
            System.out.println(N);  // Print this term.
        }

        System.out.println("\nThere were " + count + " terms in the sequence.");
    }
}   // end class
