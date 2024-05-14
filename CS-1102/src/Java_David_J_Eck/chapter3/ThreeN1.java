package Java_David_J_Eck.chapter3;

import java.util.Scanner;

/**
 * This program prints out a 3N+1 sequence starting from a positive
 * integer specified by the user.
 It also counts the number of
 * terms in the sequence, and prints out that number.
 */

public class ThreeN1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N;  // for computing terms in the sequence
        int counter;    // for counting the terms

        System.out.print("Starting point for sequence: ");
        N = scanner.nextInt();
        while ( N <= 0) {
            System.out.print(
                    "The starting point must be positive. Please try again: ");
            N = scanner.nextInt();
        }
        // At this point, we know that N > 0

        counter = 0;
        while (N != 1) {
            if (N % 2 == 0 )
                N /= 2;
            else
                N = 3 * N + 1;
            System.out.println(N);
            counter++;
        }

        System.out.printf("%nThere were %d terms in the sequence.", counter);

        /*
        * Output:
        * Starting point for sequence: -1
        * The starting point must be positive. Please try again: 3
        * 10
        * 5
        * 16
        * 8
        * 4
        * 2
        * 1

        * There were 7 terms in the sequence.
        * Process finished with exit code 0
        */

    }   // end of main()
}   // end of class ThreeN1
