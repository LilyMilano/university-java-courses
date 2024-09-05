package Java_David_J_Eck.chapter5_OOP_Objects;

/**
 * This class represents an outer class that contains a static nested class
 * and an inner class.
 * It demonstrates the use of static and non-static members.
 */
public class NestedInnerClass_OuterClass {
    // Final instance variable of the outer class:
    private final int outerInstanceVariable = 10;

    /**
     * This method prints a message indicating it is an instance method of
     * the outer class.
     */
    public void outerInstanceMethod() {
        System.out.println("Outer instance method (non-static).");
    }

    /**
     * This static method prints a message indicating it is a static method
     * of the outer class.
     */
    public static void outerStaticMethod() {
        System.out.println("Outer static method (belongs to the outer class).");
    }

    /**
     * This static nested class can access static members of the outer class
     * directly.
     */
    public static class StaticNestedClass {
        /**
         * This method accesses non-static members of the outer class by
         * creating an instance of it.
         */
        public void accessOuterMembers() {
            // Create an instance of NestedInnerClass_OuterClass to access
            // its non-static members:
            NestedInnerClass_OuterClass outerInstance =
                    new NestedInnerClass_OuterClass();

            // Access the outer class's non-static method:
            outerInstance.outerInstanceMethod();    // Outputs: Outer 
            // instance method (non-static).

            // Access the outer class's non-static variable:
            System.out.println(outerInstance.outerInstanceVariable);    // 
            // Outputs: 10
        }

        /**
         * This method calls the static method of the outer class directly.
         */
        public void callOuterStaticMethod() {
            // Call the static method of the outer class directly:
            outerStaticMethod();    // Outputs: Outer static method (belongs
            // to the outer class.
        }
    }   // end of StaticNestedClass

    /**
     * This inner class can access both static and non-static members of the
     * outer class.
     */
    public class InnerClass {   // non-static nested class (inner class)

        /**
         * This method accesses outer class members directly.
         */
        public void accessOuterMethods() {
            // Access the outer class's non-static method directly:
            outerInstanceMethod();  // Outputs: Outer
            // instance method (non-static).

            // Access the outer class's non-static method directly:
            outerStaticMethod();    // Outputs: Outer static method (belongs
            // to the outer class.

            // Access the outer class's non-static variable directly:
            System.out.println(outerInstanceVariable);  // Outputs: 10
        }
    }   // end of InnerClass

    /**
     * Main method to demonstrate the functionality of the OuterClass,
     * StaticNestedClass, and InnerClass.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Create an instance of the StaticNestedClass:
        StaticNestedClass staticNestedInstance = new StaticNestedClass();

        // Access outer class members from the static nested class:
        staticNestedInstance.accessOuterMembers();
        staticNestedInstance.callOuterStaticMethod();

        // Create an instance of InnerClass:
        NestedInnerClass_OuterClass outerInstance =
                new NestedInnerClass_OuterClass();
        InnerClass innerInstance = outerInstance.new InnerClass();

        // Access outer class members from the inner class:
        innerInstance.accessOuterMethods();

        /*
         * Outer instance method (non-static).
         * 10
         * Outer static method (belongs to the outer class).
         * Outer instance method (non-static).
         * Outer static method (belongs to the outer class).
         * 10
         */

        /*
        * Creating Instances
        * Static Nested Class:
        * To create an instance of the StaticNestedClass, you can do so directly
        * without needing an instance of the OuterClass. This is because
        * static nested classes do not have a reference to an instance of the
        * outer class.
        * *
        * Inner Class:
        * In contrast, to create an instance of the InnerClass, you must first
        * create an instance of the OuterClass. This is done because inner
        * are associated with an instance of the outer class.
        * *
        * The inner class has an implicit reference to the outer class instance,
        * allowing it to access both static and non-static members of the
        * outer class directly.
        */
    }   // end of main()

}   // end of NestedInnerClass_OuterClass
