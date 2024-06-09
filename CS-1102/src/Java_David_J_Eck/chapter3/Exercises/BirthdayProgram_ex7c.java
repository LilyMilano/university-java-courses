package Java_David_J_Eck.chapter3.Exercises;

/**
 * How many random people do you have to select before you
 *  have found someone with every possible birthday (ignoring
 *  leap years)?  This program simulates the process.
 */

public class BirthdayProgram_ex7c {

    /**
     * Simulate choosing people at random and checking the
     * day of the year they were born on.  People are chosen
     * until all 365 possible birthdays (ignoring leap years)
     * have been found.  Then the number of people surveyed
     * is output.
     */

    public static void main(String[] args) {

        boolean[] used = new boolean[365]; // For recording the possible
        // birthdays that have been seen so far. A value of true in used[i]
        // means that a person whose birthday is the i-th day of the year has
        // been found.

        int peopleCount = 0;    // The number of people who has been checked.

        int birthdaysFound = 0; // The number of different birthdays that
        // have been found.

        while (birthdaysFound < 365) {
            // Select a birthday at random, from 0 to 364.
            // If the birthday has not already been used,
            // add 1 to birthdaysFound.
            int birthday = (int)(Math.random()*365); // The selected birthday.
            peopleCount++;
            if (!used[birthday]) {
                birthdaysFound++;
                used[birthday] = true;
            }
        }   // end while

        System.out.println(peopleCount + " people were checked.");

        /* Output:
        * 2200 people were checked.

        * Process finished with exit code 0
        * */

    }   // end main()
}   // end class
