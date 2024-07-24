package Java_David_J_Eck.chapter4_StaticSubroutines.exercises;

/**
 * Write a subroutine named “stars” that will output a line of stars to standard output. (A
 * star is the character “*”.) The number of stars should be given as a parameter to the
 * subroutine. Use a for loop. For example, the command “stars(20)” would output
 * ********************
 * Write a main() routine that uses the subroutine that you wrote for Question 7 to output
 * 10 lines of stars with 1 star in the first line, 2 stars in the second line, and so on, as shown
 * below.
 * *
 * **
 * ***
 * ****
 * *****
 * ******
 * *******
 * ********
 * *********
 * **********
 * */
public class PrintStarsLine {

    public static void main(String[] args) {

        final int NUMBER_OF_ROWS = 10;

        stars(NUMBER_OF_ROWS);

        System.out.println();
        for (int i = 1; i <=NUMBER_OF_ROWS ; i++) {
            stars(i);
        }

        /* Output:
        **********

        *
        **
        ***
        ****
        *****
        ******
        *******
        ********
        *********
        **********

        Process finished with exit code 0
        */
    }   // end main()

    public static void stars(int numberOfStars) {
        for (int i = 0; i < numberOfStars ; i++) {
            System.out.print("*");
        }
        System.out.println();
    }   // end stars()

}   // end class
