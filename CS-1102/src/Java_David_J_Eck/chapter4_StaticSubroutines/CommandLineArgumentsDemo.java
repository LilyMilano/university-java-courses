package Java_David_J_Eck.chapter4_StaticSubroutines;

public class CommandLineArgumentsDemo {

    public static void main(String[] args) {

        System.out.println("You entered " + args.length + " command-line " +
                "arguments");

        if (args.length > 0) {
            System.out.println("They were:");
            for (int i = 0; i < args.length ; i++) {
                System.out.println("    " + args[i]);
            }
        }
    }   // end main()

    /* Output:
    * You entered 0 command-line arguments
    *
    * Process finished with exit code 0
    * */
}   // end class CommandLineArgumentsDemo
