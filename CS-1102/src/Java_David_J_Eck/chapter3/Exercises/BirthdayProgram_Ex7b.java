package Java_David_J_Eck.chapter3.Exercises;

/**
 * This program simulates selecting 365 people at random and finding
 * how many different birthdays they have among them.
 * Simulate choosing people at random and checking the
 * day of the year they were born on.  The number of
 * different days found among 365 people is counted and output.
 */

public class BirthdayProgram_Ex7b {

    public static void main(String[] args) {

        boolean[] used = new boolean[365];  // 365 slots, initially false. To
        // storage the birthdays found among 365 people.

        /* Choose 365 days at random, and mark each day by
        the corresponding entry in the array, used,
        to true.  (If the value is already true, it doesn't
        matter.  We are only interested in whether
        the birthday occurs, not how many times it occurs.)
      */

        for (int i = 0; i < 365; i++) {
            int birthday = (int)(Math.random()*365);    // The selected
            // birthday.
            used[birthday] = true;
        }

        /* Now, count how many entries in the used array are true.
        This is how many different birthdays were found.
        */

        int count = 0;

        for (int day = 0; day < 365; day++) {
            // If this day occurred as a birthday, count it.
            if (used[day]) {
                count++;
            }
        }

        System.out.printf("Among 365 people, there were %d different " +
                "birthdays.%n", count);

        /* Output:
        * Among 365 people, there were 233 different birthdays.

        * Process finished with exit code 0
        * */

    }   // end main()
}   // end class
