package Java_David_J_Eck.chapter3;

import java.util.Scanner;

public class ExceptionsDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a floating point number: ");
        String str = scanner.next();

        double x;

        try {
            x = Double.parseDouble(str);    // this call throw the exception
            System.out.printf("The number is: %14.5g", x);
        }
        catch (NumberFormatException e) {
            System.out.println("Not a legal number.");
            System.out.println("Error: " + e);
            x = Double.NaN;
            System.out.println("Value of x: " + x);
        }

        /* Output:
        * Enter a floating point number: 11,1
        Not a legal number.
        Error: java.lang.NumberFormatException: For input string: "11,1"
        Value of x: NaN

        Process finished with exit code 0
        */

    }   // end of main()
}   // end of class
