package Chapter_01;

public class ReadingExercises{
    public static void main(String[] args) {
        System.out.println("Hello there!");

        // Exercise 1.3: Try out each of the following errors.

        // 1. Remove one of the opening curly braces.
        // Output: java: '{' expected

        // 2. Remove one of the closing curly braces.
        // Output: java: reached end of file while parsing

        // 3. Instead of main, write mian.
        // Error: Main method not found in class Chapter_01.ReadingExercises, please define the main method as:
        //   public static void main(String[] args)
        //or a JavaFX application class must extend javafx.application.Application

        // 4. Remove the word static.
        // Error: Main method not found in class Chapter_01.ReadingExercises, please define the main method as:
        //   public static void main(String[] args)
        //or a JavaFX application class must extend javafx.application.Application

        // 5. Remove the word public.
        // Error: Main method not found in class Chapter_01.ReadingExercises, please define the main method as:
        //   public static void main(String[] args)
        //or a JavaFX application class must extend javafx.application.Application

        // 6. Remove the word System.
        // java: cannot find symbol
        //  symbol:   variable out
        //  location: class Chapter_01.ReadingExercises

        // 7. Replace println with Println.
        // java: cannot find symbol
        //  symbol:   method Println(java.lang.String)
        //  location: variable out of type java.io.PrintStream

        // 8. Replace println with print.
        // Hello there!
        // Process finished with exit code 0

        // 9. Delete one parenthesis.
        // java: ')' or ',' expected

        // 10. Add an extra parenthesis.
        // java: ';' expected
    }
}
