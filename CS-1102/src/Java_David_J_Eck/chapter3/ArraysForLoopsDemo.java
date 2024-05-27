package Java_David_J_Eck.chapter3;

public class ArraysForLoopsDemo {
    public static void main(String[] args) {

        // to print out all the items in an array, list:
        int[] list = {1, 2, 3, 4, 5};

        int i; // the array index
        for (i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

        /* Output:
        * 1
        * 2
        * 3
        * 4
        * 5
        */

        // ********************************************************************
        /*
        * Suppose that A is an array of double, and we want to find the
        * average of all the elements of the array. We can use a for loop to
        * add up the numbers, and then divide by the length of the array to
        * get the average:
        * */

        double[] A = { 2.0, 1.0, 5.5, 3.5 };

        double total;   // the sum of the numbers in the array.
        double average; // The average of the numbers.

        total = 0;

        for (int j = 0; j < A.length; j++) {
            total = total + A[j];   // Add element number j to the total.
        }

        average = total / A.length; // A.length is the number of items

        System.out.println("\nThe average of the numbers in array A is: " + average);

        /* Output:
        * The average of the numbers in array A is: 3.0
        */

        // ********************************************************************

        /* find the largest number in the array B. The strategy is to go
        through the array, keeping track of the largest number found so far.
        We’ll store the largest number found so far in a variable called max.
        As we look through the array, whenever we find a number larger than
        the current value of max, we change the value of max to that larger
        value. After the whole array has been processed, max is the largest
        item in the array overall. The only question is, what should the
        original value of max be? One possibility is to start with max equal
        to B[0], and then to look through the rest of the array, starting
        from B[1], for larger items.
        */

        double [] B = {2.2, 1.7, 3.5, 1, 0.9, 3.6, 4.0, 1.11, 5.8, 3.7};
        double max; // the largest number seen so far.
        max = B[0]; // At first, the largest number seen is B[0].

        for (int k = 1; k < B.length; k++) {
            if (B[k] > max ) {
                max = B[k];
            }
        }
        // At this point, max is the largest item in B.

        System.out.println("\nThe largest number in the array B is: " + max);

        /* Output:
        * The largest number in the array B is: 5.8 */
        // ********************************************************************

        /* Sometimes, you only want to process some elements of the array. In
        that case, you can use an if statement inside the for loop to decide
        whether to process a given element. Let’s look at the problem
        of averaging the elements of an array, but this time,  suppose that
        we only want to average the non-zero elements. In this case, the
        number of items that we add up can be less than the length of the
        array, so we will need to keep a count of the number of items added
        to the sum.
        */

        double[] C = {0, 1, 0, 0, 2, 3};

        double sum = 0; // The sum of non-zero numbers in the array.
        int count = 0;  // The number of non-zero numbers.
        double avg; // The average of the non-zero numbers.

        for (int index = 0; index < C.length; index++) {
            if (C[index] != 0) {    // Only process non-zero elements.
                sum = sum + C[index];   // Add element to the total
                count = count + 1;  // and count it.
            }
        }

        if (count == 0) {
            System.out.println("\nThere were no non-zero elements.");
        }   else {
            avg = sum / count;  // Divide by number of items.
            System.out.printf("%nAverage of %d elements is %1.5g%n", count,
                    avg);
        }

        /* Output:
        * Average of 3 elements is 2.0000
        */

        // ********************************************************************
    }   // end main()
}   // end class
