package Java_David_J_Eck.chapter4_StaticSubroutines.exercises;

/**
 * This class defines several public static member variables of type
 * ArrayProcessor that process arrays in various ways. It also defines a
 * function that can create ArrayProcessors for counting occurrences of
 * values in an array. (This program depends on interface ArrayProcessor. The
 * interface ArrayProcessor defines a contract for processing arrays of
 * doubles, and lambda expressions are used to provide the implementation for
 * the apply method of this interface.)
 */

public class LambdaTest {

    /**
     * The counter method returns an ArrayProcessor instance.
     * After iterating through the array, the final count is returned.
     * This function returns an ArrayProcessor that counts
     * the number of times a certain value occurs in an array
     * of doubles.  The parameter specifies the value that is
     * to be counted. This method takes a double value as a parameter and
     * returns an ArrayProcessor instance.
     * The lambda expression inside the counter method defines the
     * implementation of the apply method for the returned ArrayProcessor
     * instance.
     */
    public static ArrayProcessor counter(double value) {
        return array -> {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == value)
                    count++;
            }
            return count;
        };
    }   // end of counter()

    /**
     * An ArrayProcessor that computes and returns the maximum value of an
     * array. (The array must have length at least 1.)
     */
    public static final ArrayProcessor maxer = array -> {
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    };

    /**
     * An ArrayProcessor that computes and returns the minimum
     * value of an array.  (The array must have length at least 1.)
     */
    public static final ArrayProcessor miner = array -> {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    };

    /**
     * An ArrayProcessor that computes and returns the sum of the
     * values in an array.  (The array must have length at least 1.)
     */
    public static final ArrayProcessor sumer = array -> {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    };

    /**
     * An ArrayProcessor that computes and returns the average of the
     * values in an array.  (The array must have length at least 1.)
     */
    public static final ArrayProcessor averager =
            array -> sumer.apply(array) / array.length;

    //______________________________________________________________________

    /**
     * A main() routine to test the (other) public members of this class.
     */
    public static void main(String[] args) {
        double[] firstList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] secondList = {17.0, 3.14, 17.0, -3.4, 17.0, 42.0, 29.2,
                3.14};

        System.out.println("Sum of first list (should be 55): " + sumer.apply(firstList));
        System.out.println("Average of first list (should be 5.5): " + averager.apply(firstList));
        System.out.println("Minimum of second list (should be -3.4): " + miner.apply(secondList));
        System.out.println("Maximum of second list (should be 42.0): " + maxer.apply(secondList));
        System.out.println();
        System.out.println("Count of 17.0 in second list (should be 3): " + counter(17.0).apply(secondList));
        System.out.println("Count of 20.0 in second list (should be 0): " + counter(20.0).apply(secondList));
        System.out.println("Count of 5.0 in first list (should be 1): " + counter(5.0).apply(firstList));

        /* Output:
         * Sum of first list (should be 55): 55.0
         * Average of first list (should be 5.5): 5.5
         * Minimum of second list (should be -3.4): -3.4
         * Maximum of second list (should be 42.0): 42.0
         *
         * Count of 17.0 in second list (should be 3): 3.0
         * Count of 20.0 in second list (should be 0): 0.0
         * Count of 5.0 in first list (should be 1): 1.0
         *
         * Process finished with exit code 0
         */
    }   // end of main()

}   // end of class LambdaTest
