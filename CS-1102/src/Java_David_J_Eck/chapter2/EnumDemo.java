package Java_David_J_Eck.chapter2;

public class EnumDemo {
        // Define two enum types for use in this program.
    enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }
    enum Month { JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC }

    public static void main(String[] args) {
        Day tgif;   // Declare a variable of type Day.
        Month libra;  // Declare a variable of type Month.

        tgif = Day.FRIDAY;  // Assign a value of type Day to tgif.
        libra = Month.OCT;   // Assign a value of type Month to libra.

        System.out.println("My sign is libra, since I was born in " + libra);   // OCT
        System.out.println("That's the " + libra.ordinal() + "-th month of " +
                "the year.");
        System.out.println("\t(Counting from 0, of course!)");

        System.out.println("Isn't nice to get to " + tgif + "?");     // FRIDAY
        System.out.println(tgif + " is the " + tgif.ordinal() + "-th day of " +
                "the week.");

        /*
        * Output:

        My sign is libra, since I was born in OCT
        That's the 9-th month of the year.
	        (Counting from 0, of course!)
        Isn't nice to get to FRIDAY?
        FRIDAY is the 5-th day of the week.

        */
    }
}
