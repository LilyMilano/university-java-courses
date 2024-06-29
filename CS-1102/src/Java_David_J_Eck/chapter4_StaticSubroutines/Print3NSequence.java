package Java_David_J_Eck.chapter4_StaticSubroutines;

import java.util.Scanner;

/**
 * This program prints a 3N+1 sequence to standard output, using
 * startingValue as the initial value of N. It also prints the number
 * of terms in the sequence. The value of the parameter, startingValue,
 * must be a positive integer.
 */

public class Print3NSequence {
    
    static void print3NSequence(int startingValue) {
        
        int N;  // One of the terms in the sequence.
        int count;  // The number of terms.
        
        N = startingValue;  // The first term is whatever value is passed to 
        // the subroutine as a parameter.
        
        count = 1;  // We have one term, the starting value, so far.

        System.out.printf("""
                The 3N+1 sequence starting from %d%n%n""", N);
        
        System.out.println(N);  // print the initial term of sequence
        
        while (N > 1) {
            if (N % 2 == 1) // N is odd
                N = 3 * N + 1;
            else N = N / 2;
            count++;    // Count this term
            System.out.println(N);  // Print this term
        }

        System.out.println("\nThere were " + count + " terms in the sequence" +
                ".\n");
    }   // end of print3NSequence subroutine

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                This program will print out 3N+1 sequences
                for starting values that you specify.""");
        System.out.println();

        int K;  // Input frm user; loop ends when K < 0.

        do {
            System.out.println("Enter a starting value.");
            System.out.print("To end the program, enter 0: ");
            K = scanner.nextInt();  // Get starting value from user.

            if(K > 0)
                print3NSequence(K);
        } while (K > 0);

    }   // end main()

    /*
    * Output:
    * This program will print out 3N+1 sequences
    * for starting values that you specify.
    *
    * Enter a starting value.
    * To end the program, enter 0: 3
    * The 3N+1 sequence starting from 3
    *
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
    * Enter a starting value.
    * To end the program, enter 0: 0
    * */
}   // end class
