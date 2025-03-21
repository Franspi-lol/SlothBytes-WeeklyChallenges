import java.util.ArrayList;

/**
 * This class provides a method to perform a "bridge shuffle" on two arrays.
 * The bridge shuffle interleaves the elements of the two input arrays,
 * adding elements from each array alternately to a new ArrayList.
 *
 * @author Franco Bernardele (Franspi-lol)
 */
public class bridgeShuffle {

    /**
     * The main method demonstrates the bridgeShuffle method with sample arrays.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        String[] arr = {"a", "c"};
        Integer[] arr2 = {3, 4, 8, 9, 10};
        System.out.println(bridgeShuffle(arr, arr2)); // Output: [a, 3, c, 4, 8, 9, 10]
    }

    /**
     * Performs a bridge shuffle on two input arrays.
     * The method interleaves the elements of the two arrays,
     * adding them alternately to a new ArrayList.
     * If one array is shorter than the other, the remaining elements of the longer array
     * are appended to the end of the ArrayList.
     *
     * @param a The first input array.
     * @param b The second input array.
     * @param <T> The type of elements in the arrays (generic).
     * @return An ArrayList containing the interleaved elements of the input arrays.
     */
    public static <T> ArrayList<T> bridgeShuffle(T[] a, T[] b) {
        int i = 0; // Index to iterate through both arrays.
        ArrayList<T> list = new ArrayList<>(); // ArrayList to store the shuffled elements.

        while (a.length > i || b.length > i) { // Continue until both arrays are fully processed.
            if (i < a.length) { // Add element from the first array if it exists.
                list.add(a[i]);
            }
            if (i < b.length) { // Add element from the second array if it exists.
                list.add(b[i]);
            }
            i++; // Increment the index.
        }
        return list; // Return the shuffled ArrayList.
    }
}
