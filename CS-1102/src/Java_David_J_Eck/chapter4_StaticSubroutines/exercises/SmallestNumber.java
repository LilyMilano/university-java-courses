package Java_David_J_Eck.chapter4_StaticSubroutines.exercises;

import java.util.Scanner;

/**
 * Write a subroutine with three parameters of type int. The subroutine
 * should determine which of its parameters is smallest. The value of the
 * smallest parameter should be returned as the value of the subroutine.
 */
public class SmallestNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a first integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter a second integer: ");
        int b = scanner.nextInt();
        System.out.print("Enter a third integer: ");
        int c = scanner.nextInt();

        System.out.println("The smallest integer is: " + findSmallest(a, b, c));

        /* Output:
        * Enter a first integer: 5
        * Enter a second integer: -1
        * Enter a third integer: 0
        * The smallest integer is: -1
        *
        * Process finished with exit code 0
        * */
    }   // end of main()

    public static int findSmallest(int num1, int num2, int num3) {
        int smallest = num1;    // Assume num1 is the smallest initially

        if (num2 < smallest) {  // If num2 is smaller than the current smallest
            smallest = num2;    // update the value of smallest to num2.
        }
        if (num3 < smallest) {  // Now, if num3 is smaller than the current
            // smallest, update the value of smallest to num3.
            smallest = num3;
        }
        return smallest;    // Return the smallest value among num1, num2, num3.
    }   // end of findSmallest()
}   // end of class SmallestNumber
