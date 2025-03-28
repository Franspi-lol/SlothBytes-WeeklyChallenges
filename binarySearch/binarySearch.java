package binarySearch;

public class binarySearch {
    /**
     * Finds the index of the first occurrence of a target value in an integer array.
     *
     * @param arreglo The integer array to search.
     * @param target The target value to find.
     * @return The index of the first occurrence of the target value, or -1 if not found.
     * @author Franco Bernardele
     */
    public static int find_first_ocurrence(int[] arreglo, int target) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arreglo1 = {1, 3, 3, 3, 3, 6, 10, 10, 10, 100};
        int[] arreglo2 = {2, 3, 5, 7, 11, 13, 17, 19};
        System.out.println(find_first_ocurrence(arreglo1, 3)); // Output: 1
        System.out.println(find_first_ocurrence(arreglo2, 6)); // Output: -1
    }
}