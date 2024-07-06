package Java_David_J_Eck.chapter4_StaticSubroutines;

public class DocTagsDemo {

    /**
     * This subroutine computes the area of a rectangle, given its width and
     * its height. The length and the width should be positive numbers.
     * @param width the length of one side of the rectangle.
     * @param height the length the second side of the rectangle.
     * @return the area of the rectangle.
     * @throws IllegalArgumentException if either the width or the height is
     * a negative number.
     */

    public static double areaOfRectangle(double height, double width) {
        if ( width < 0 || height < 0)
            throw new IllegalArgumentException("Sides must have positive " +
                    "length.");
        double area;
        area = width * height;
        return area;
    }

    public static void main(String[] args) {
        try{
        System.out.println( "The area of the rectangle is: " + areaOfRectangle(-5, 4));
        } catch (IllegalArgumentException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        /* Output:
        * An error occurred: Sides must have positive length.

        * Process finished with exit code 0
        * */

    }   // end main()
}   // end class
