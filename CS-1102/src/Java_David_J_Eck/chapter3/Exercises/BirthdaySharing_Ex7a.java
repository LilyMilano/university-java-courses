package Java_David_J_Eck.chapter3.Exercises;

/**
 *  How many random people do you have to select before you find
 *  THREE with the same birthday (that is, three people who were born
 *  on the same day of the same month, but not necessarily in the
 *  same year).  This program simulates the process.  (It ignores the
 *  possibility of people born on leap day.)
 */

public class BirthdaySharing_Ex7a {

    public static void main(String[] args) {

        /* Declare and initialize variables */
        int [] count = new int[365]; // The number of times a birthday has
        // been encountered. Initially all entries are 0.

        int peopleCount = 0;

        //_____________________________________________________________________

        /* We enter a loop until we find three people with the same birthday */

        while (true) {

            // Select a birthday at random, from 0 to 364.
            // If the birthday has been encountered 3 times, quit.
            // Otherwise, increment the count for this birthday.

            // Generate a random birthday (between 0 and 364)
            int birthday = (int)(Math.random()*365);
            peopleCount++;

            System.out.printf("Person %d has birthday number %d%n",
                    peopleCount, birthday);

            count[birthday]++;

            if (count[birthday] == 3) {
                // This day was found twice before; it's a triplicate. We are
                // done.
                break;
            }
        }   // end of while loop

        System.out.printf("%nA triplicate birthday was found after %d tries" +
                ".%n", peopleCount);

        /* Output:
        * Person 1 has birthday number 200
        * Person 2 has birthday number 163
        * Person 3 has birthday number 50
        * Person 4 has birthday number 274
        * Person 5 has birthday number 67
        * Person 6 has birthday number 330
        * Person 7 has birthday number 157
        * Person 8 has birthday number 62
        * Person 9 has birthday number 146
        * Person 10 has birthday number 64
        * Person 11 has birthday number 162
        * Person 12 has birthday number 226
        * Person 13 has birthday number 165
        * Person 14 has birthday number 60
        * Person 15 has birthday number 206
        * Person 16 has birthday number 122
        * Person 17 has birthday number 102
        * Person 18 has birthday number 256
        * Person 19 has birthday number 341
        * Person 20 has birthday number 59
        * Person 21 has birthday number 336
        * Person 22 has birthday number 9
        * Person 23 has birthday number 217
        * Person 24 has birthday number 10
        * Person 25 has birthday number 232
        * Person 26 has birthday number 241
        * Person 27 has birthday number 91
        * Person 28 has birthday number 364
        * Person 29 has birthday number 32
        * Person 30 has birthday number 7
        * Person 31 has birthday number 268
        * Person 32 has birthday number 77
        * Person 33 has birthday number 348
        * Person 34 has birthday number 298
        * Person 35 has birthday number 236
        * Person 36 has birthday number 257
        * Person 37 has birthday number 81
        * Person 38 has birthday number 156
        * Person 39 has birthday number 1
        * Person 40 has birthday number 195
        * Person 41 has birthday number 343
        * Person 42 has birthday number 61
        * Person 43 has birthday number 316
        * Person 44 has birthday number 129
        * Person 45 has birthday number 215
        * Person 46 has birthday number 189
        * Person 47 has birthday number 302
        * Person 48 has birthday number 361
        * Person 49 has birthday number 171
        * Person 50 has birthday number 107
        * Person 51 has birthday number 291
        * Person 52 has birthday number 192
        * Person 53 has birthday number 109
        * Person 54 has birthday number 286
        * Person 55 has birthday number 56
        * Person 56 has birthday number 276
        * Person 57 has birthday number 35
        * Person 58 has birthday number 8
        * Person 59 has birthday number 139
        * Person 60 has birthday number 302
        * Person 61 has birthday number 283
        * Person 62 has birthday number 124
        * Person 63 has birthday number 191
        * Person 64 has birthday number 177
        * Person 65 has birthday number 101
        * Person 66 has birthday number 233
        * Person 67 has birthday number 129
        * Person 68 has birthday number 85
        * Person 69 has birthday number 19
        * Person 70 has birthday number 296
        * Person 71 has birthday number 359
        * Person 72 has birthday number 133
        * Person 73 has birthday number 219
        * Person 74 has birthday number 44
        * Person 75 has birthday number 289
        * Person 76 has birthday number 309
        * Person 77 has birthday number 129

        * A triplicate birthday was found after 77 tries.

        * Process finished with exit code 0*/

    }   // end main()
}   // end class
