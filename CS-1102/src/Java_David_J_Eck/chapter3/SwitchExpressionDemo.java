package Java_David_J_Eck.chapter3;

/**
 * This program demonstrates the usage of a switch expression to randomly 
 * select a move for a computer game. 
 * The program generates a random number between 0 and 2 (inclusive) 
 * using (int)(3*Math.random()). Based on the generated number, the 
 * switch expression assigns a corresponding move to the computerMove variable. 
 * If the generated number is 1, the computer's move is set to "Rock 🪨". 
 * If the generated number is 2, the computer's move is set to "Paper 🗞️". 
 * Otherwise, if the generated number is 0, the computer's move is set to "Scissors ✂️".
 * */

public class SwitchExpressionDemo {

    public static void main(String[] args) {

        String computerMove = switch ( (int)(3*Math.random()) ) {
            case 1 -> "Rock 🪨";
            case 2 -> "Paper 🗞️";
            default -> "Scissors ✂️";   // required to cover all the possible
                                        // options.
        };  // end switch expression

        System.out.println("The computer's move is: " + computerMove);

        /*
        * Output:
        * The computer's move is: Scissors ✂️
        * */

    }   // end main()
}   // end class
