package Java_David_J_Eck.chapter2.Exercises;

public class RollTheDice {

    /**
    Write a program that simulates rolling a pair of dice. You can simulate
    rolling one die by choosing one of the integers 1, 2, 3, 4, 5, or 6 at random.
    The number you pick represents the number on the die after it is rolled.
    */

    public static void main(String[] args) {

        int firstDie;  //   result of rolling die 1.
        int secondDie;  // result of rolling die 2.
        int total;  // addition of die 1 and die 2.

        firstDie = (int)(Math.random()*6) + 1;  // compute a random number 1-6.
        secondDie = (int)(Math.random()*6) + 1;  // compute a random number 1-6.
        total = firstDie + secondDie;

        System.out.printf("The first die comes up %d%n", firstDie);
        System.out.printf("The second die comes up %d%n", secondDie);
        System.out.printf("Your total roll is %d%n", total);

        /*
        Output:
        The first die comes up 5
        The second die comes up 3
        Your total roll is 8
        */

    }   // end of main()
}   // end of class
