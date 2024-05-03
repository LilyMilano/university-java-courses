package Java_David_J_Eck.chapter2;
import Java_David_J_Eck.chapter2.textio.TextIO;

public class CreateProfile {
    public static void main(String[] args) {

        String name;    // The user's name.
        String email;   // The user's email address.
        double salary;  // The user's yearly salary.
        String favColor;    // The user's favorite color.

        TextIO.putln("Good afternoon!    This program will create");
        TextIO.putln("your profile file, if you will just answer");
        TextIO.putln("a few simple questions.");
        TextIO.putln();

        /* Gather responses from the user. */

        TextIO.put("What's your name?            ");
        name = TextIO.getln();
        TextIO.put("What's your email address?   ");
        email = TextIO.getln();
        TextIO.put("What is your yearly income?  ");
        salary = TextIO.getlnDouble();
        TextIO.put("What is your favorite color? ");
        favColor = TextIO.getln();

        /* Write the user's information to the file named profile.txt. */

        TextIO.writeFile("profile.txt");    // subsequent output goes to file
        TextIO.putln("Name:             " + name);
        TextIO.putln("Email:            " + email);
        TextIO.putln("Favorite Color:   " + favColor);
        TextIO.putf("Yearly income: %,1.2f%n", salary);

        /* Print a final message to standard output. */

        TextIO.writeStandardOutput();
        TextIO.putln("Thank you.    Your profile has been written to profile" +
                ".txt.");

        /* Output:
        * Good afternoon!    This program will create
        * your profile file, if you will just answer
        * a few simple questions.
        *
        * What's your name?            Liliana Milano
        * What's your email address?   lilianasmr@gmail.com
        * What is your yearly income?  10000000
        * What is your favorite color? red
        * Thank you.    Your profile has been written to profile.txt.
        */

    }   // end of main()
}   // end of the class CreateProfile