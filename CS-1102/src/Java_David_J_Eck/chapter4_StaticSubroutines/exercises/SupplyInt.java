package Java_David_J_Eck.chapter4_StaticSubroutines.exercises;

import java.util.Scanner;

/**
 * Suppose that SupplyInt is a functional interface that defines the method
 * public int get().
 * Write a lambda expression of type SupplyInt that gets a random integer in
 * the range 1 to 6 inclusive. Write another lambda expression of type
 * SupplyInt that gets an int by asking the user to enter an integer and then
 * returning the user’s response.
 * In the main() method, we call the get() method on each SupplyInt instance
 * to obtain the random integer and user input, respectively. We then print
 * the values to the console.
 */
public interface SupplyInt {

    public int get();   // abstract method
}

class IntGetter {

    public static void main(String[] args) {

        SupplyInt randomIntSupplier = () -> (int) (Math.random() * 6) + 1;
        int randomInt = randomIntSupplier.get();
        System.out.println("Random integer: " + randomInt);

        //________________________________________________________________

        SupplyInt userInputSupplier = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            return scanner.nextInt();
        };
        int userInput = userInputSupplier.get();
        System.out.println("User input: " + userInput);

        //________________________________________________________________

        /* Output:
        * Random integer: 4
        * Enter an integer: 7
        * User input: 7
        *
        * Process finished with exit code 0
        * */
    }   // end of main()

}   // end of class
