package Java_David_J_Eck.chapter3;

/**
 * The code segment iterates through each character of s1 and s2 using nested
 * while loops. It compares each character of s1 with each character of s2 to
 * check for a common character.
 * If a common character is found, the nothingInCommon variable is set to false,
 * and the bigloop is broken out of using the labeled break statement.
 */

public class CommonCharacterCheck {

    public static void main(String[] args) {

        String s1 = "extra";
        String s2 = "mile";

        boolean nothingInCommon = true; // Assume s1 and s2 have no chars in
        // common.
            int i, j;   // Variables for iterating through the chars in s1
        // and s2.

        i = 0;
        bigloop: while (i < s1.length()) {

            j = 0;
            while (j < s2.length()) {
                if (s1.charAt(i) == s2.charAt(j)) { // s1 and s2 have a
                    // common char.
                    nothingInCommon = false;    // so nothingInCommon is
                    // false
                    break bigloop;  // break out of BOTH loops.
                }
                j++;    // Go on to the next char in s2.
            }
            i++;    // Go on to the next char in s1.
        }
        if (nothingInCommon) {
            System.out.println("No common characters found.");
        }
        else {
            System.out.println("Common characters found.");
        }

        /*
        * Output:
        * Common characters found.
        *
        * Process finished with exit code 0
        */

        /*
        Explanation:
        In this case, when the code compares the first character of s1
        ("e") with the last character of s2 ("e"), it finds a match.
        Therefore, the nothingInCommon variable is set to false, indicating
        that a common character has been found. As a result, the correct
        output for the given strings s1 = "extra" and s2 = "mile" should be
        "Common characters found."
        */

    }   // end main()
}   // end class
