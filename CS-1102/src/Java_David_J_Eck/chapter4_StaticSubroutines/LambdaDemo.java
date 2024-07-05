package Java_David_J_Eck.chapter4_StaticSubroutines;

/**
 * Functional interfaces in Java provide a way to achieve functional
 * programming by allowing the use of lambda expressions and method references.
 * Lambda expressions and method references are used to
 * represent instances of these functional interfaces.
 * <p>
 * In summary, interfaces in Java act as a datatype (with their own methods)
 * that allows you to work with objects of different classes through a common
 * interface, treating functions as another kind of data inside the computer.
 */

public class LambdaDemo {

    // Functional interface as a method parameter: In the calculate method, a
    // functional interface Operation is used as a method parameter. It takes
    // two integers and an Operation instance and performs the operation on
    // the given numbers.
    public static void calculate(int a, int b, Operation operation) {
        int result = operation.operate(a, b);
        System.out.println(a + " operation " + b + " = " + result);
    }

    // Functional interface as a return type: The getOperation method returns
    // an Operation instance based on the operator passed as an argument. It
    // uses a switch statement to determine the appropriate lambda expression
    // based on the operator.
    public static Operation getOperation(String operator) {
        switch (operator) {
            case "+":
                return (a, b) -> a + b;
            case "-":
                return (a, b) -> a - b;
            case "*":
                return (a, b) -> a * b;
            case "/":
                return (a, b) -> a / b;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    // Method referenced by method reference: The multiply method is a static
    // method that represents an operation for multiplying two integers. It
    // is referenced using a method reference in the multiplication variable.

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        // Lambda expression assigned to a variable
        Operation subtraction = ((a, b) -> a - b);
        System.out.println("10 - 5 = " + subtraction.operate(10, 5));

        // Method reference
        Operation multiplication = LambdaDemo::multiply;
        System.out.println("10*5 = " + multiplication.operate(10, 5));

        // Lambda expression as an argument
        calculate(10, 5, (a, b) -> a + b);

        // Lambda expression as a return value
        Operation addition = getOperation("+");
        System.out.println("10 + 5 = " + addition.operate(10, 5));

        /*
         * Output:
         * 10 - 5 = 5
         * 10*5 = 50
         * 10 operation 5 = 15
         * 10 + 5 = 15
         *
         * Process finished with exit code 0
         * */

    }   // end main()


}   // end class LambdaDemo


// Functional interface: The Operation interface is a functional
// interface that defines a single method operate which takes two
// integers as parameters and returns an integer. This interface
// represents an operation that can be performed on two integers.
interface Operation {
    int operate(int a, int b);
}
