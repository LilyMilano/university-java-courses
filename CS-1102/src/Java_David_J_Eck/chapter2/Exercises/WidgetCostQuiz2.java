package Java_David_J_Eck.chapter2.Exercises;

import java.util.Scanner;

public class WidgetCostQuiz2 {

    /**
     * Q. 14. Write a complete program that asks the user to enter the number
     * of “widgets” they want to buy and the cost per widget. The program
     * should then output the total cost for all the widgets. Use
     * System.out.printf
     * to print the cost, with two digits after the decimal point. You do not
     * need to include any comments in the program.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many widgets do you want to buy today? ");
        int widgetQuantity = scanner.nextInt();

        System.out.print("Please, enter cost per widget: $");
        double costPerWidget = scanner.nextDouble();

        double totalCost = widgetQuantity * costPerWidget;

        System.out.printf("Then, you will spend $%1.2f.%n", totalCost);

        /*
        * Output:
        * How many widgets do you want to buy today? 10
        * Please, enter cost per widget: $50
        * Then, you will spend $500.00.
        *
        * Process finished with exit code 0
        */
    }   // ends main()
}   // ends class.
