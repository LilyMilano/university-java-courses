package Java_David_J_Eck.chapter3;

import java.util.Arrays;

/**
 * Simulate choosing people at random and checking the day of the year they
 * were born on.
 * If the birthday is the same as one that was seen previously, stop, and
 * output the number of people who were checked.
 */

public class BirthdayProblem {

    public static void main(String[] args) {

        /* Variables */
        boolean[] used; // For recording the possible birthdays that have
                        // been seen so far. A value of true in used[i] means
                        // that a person whose birthday is the i-th day of
                        // the year has been found.
        int count;  // The number of people who have been checked.

        used = new boolean[365];    //  Initially, all entries are false.
        count = 0;

        /* Check duplicity of a birthday date. */

        while (true) {
            // Select a birthday at random, from 0 to 364.
            // If the birthday has already been used, quit.
            // Otherwise, record the birthday as used.

            int birthday;   // The selected birthday.
            birthday = (int) (Math.random()*365);
            count++;

            System.out.printf("Person %d has birthday number %d%n", count, birthday);

            if (used[birthday]) {
                // This day was found before; it's a duplicate. We are done.
                break;
            }

            used[birthday] = true;
        }   // end while

        System.out.println();
        System.out.println("A duplicate birthday was found after " + count +
                " tries.");
        System.out.println(Arrays.toString(used));

        /*
        Person 1 has birthday number 74
        Person 2 has birthday number 337
        Person 3 has birthday number 121
        Person 4 has birthday number 357
        Person 5 has birthday number 297
        Person 6 has birthday number 192
        Person 7 has birthday number 124
        Person 8 has birthday number 56
        Person 9 has birthday number 264
        Person 10 has birthday number 331
        Person 11 has birthday number 310
        Person 12 has birthday number 77
        Person 13 has birthday number 194
        Person 14 has birthday number 333   // birthday 333
        Person 15 has birthday number 210
        Person 16 has birthday number 106
        Person 17 has birthday number 333   // birthday 333 (duplicate)

        A duplicate birthday was found after 17 tries.
        [false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false]

        Process finished with exit code 0
        */

    }   // end of main()
}   // end class Birthday problem
