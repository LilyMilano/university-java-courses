package Java_David_J_Eck.chapter3;

import java.util.Scanner;

/**
 * Consider the problem of printing out
 * the values of the three variables in increasing order. For example, if the values are 42, 17, and
 * 20, then the output should be in the order 17, 20, 42.
 */

public class IncreasingOrder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /* One way to approach this is to ask, where does x belong in the
        list? */

        int x, y, z;

        System.out.print("Enter the integer value x: ");
        x = scanner.nextInt();
        System.out.print("Enter the integer value y: ");
        y = scanner.nextInt();
        System.out.print("Enter the integer value z: ");
        z = scanner.nextInt();

        if (x < y && x < z) {   // x comes first
            if (y < z) {    // y comes second
                System.out.println( x + " " + y + " " + z );
            }
            else
                System.out.println( x + " " + z + " " + y );
        } else if ( x > y && x > z) {   // x comes last
            if ( y < z) {   // y comes first
                System.out.println( y + " " + z + " " + x );
            }
            else
                System.out.println( z + " " + y + " " + x );
        }
        else {                      // x in the middle
            if ( y < z ) {
                System.out.println( y + " " + x + " " + z );
            }
            else {
                System.out.println( z + " " + x + " " + y);
            }
        }

        System.out.println();

        /*
        Output:
        Enter the integer value x: 44
        Enter the integer value y: 11
        Enter the integer value z: 22
        11 22 44
        */

        /*
        There is an alternative approach to this problem that begins by asking,
        “which order should a and b be printed in?” Once that’s known, you
        only have to decide where to stick in c.
        */

        int a, b, c;

        System.out.print("Enter the integer value a: ");
        a = scanner.nextInt();
        System.out.print("Enter the integer value b: ");
        b = scanner.nextInt();
        System.out.print("Enter the integer value c: ");
        c = scanner.nextInt();

        if ( a < b ) {  // a comes before b
            if ( c < a ) {   // c comes first
                System.out.println( c + " " + a + " " + b );
            }
            else if ( c > b ) {     // c comes last
                System.out.println( a + " "  + b + " " + c );
            }
            else    // c in the middle
                System.out.println( a + " " + c + " " + b );
        }
        else {  // b comes before a
            if ( c < b ) {  // c comes first
                System.out.println( c + " " + b + " " + a );
            }
            else if ( c > a) {    // c comes last
                System.out.println( b + " " + a + " " + c );
            }
            else    // c is in the middle
                System.out.println( b + " " + c + " "  + a );
        }

        scanner.close();

        /* Output
        Enter the integer value a: 42
        Enter the integer value b: 17
        Enter the integer value c: 20
        17 20 42
        */

    }   // end of main()
}   // end of class
