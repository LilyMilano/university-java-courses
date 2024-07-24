package Java_David_J_Eck.chapter4_StaticSubroutines.exercises;

/**
 * Program to remove all occurrences of the value 0 from an input
 * array list and return a new array without the 0 values.
 */
public class StripZeros {

    public static void main(String[] args) {

        // Test the stripZeros function:
        int[] inputArray = {0, 5, 0, 8, 0, 0, 3, 0, 0};

        System.out.print("Input array: ");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();

        System.out.print("Result array: ");
        int[] resultArray = stripZeros(inputArray);
        for (int i = 0; i < resultArray.length ; i++) {
            System.out.print(resultArray[i] + " ");
        }

        /*
        * Output:
        * Input array: 0 5 0 8 0 0 3 0 0
        * Result array: 5 8 3
        * Process finished with exit code 0
        */

    }   // end of main()

    public static int[] stripZeros(int[] list) {
        int count = 0; // Count the number of non-zero elements in the input
        // array.

        // Iterate over each element in the input array using a for loop.
        // If the current element is not equal to 0, it increments the count
        // variable.
        for (int i = 0; i < list.length; i++) {
            if (list[i] != 0) {
                count++;
            }
        }

        // Create a new array newList with a length equal to the value of
        // count. This new array will store the non-zero elements.
        int[] newList = new int[count];

        // Initialize a variable j to 0, which will be used as an index
        // for the newList array.
        int j = 0;

        // Iterate over each element in the input array again using a for
        // loop. If the current element is not equal to 0, it assigns the
        // current element to newList[j] and increments j.
        for (int i = 0; i < list.length; i++) {
            if (list[i] != 0) {
                newList[j] = list[i];
                j++;
            }
        }

        // Finally, it returns the newList array, which contains only the
        // non-zero elements from the input array:
        return newList;
    }    // end of stripZeros()

}   // end of class StripZeros
