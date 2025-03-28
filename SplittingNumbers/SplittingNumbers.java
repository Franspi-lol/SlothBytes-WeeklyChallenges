package SplittingNumbers;

import java.util.ArrayList;
import java.util.Arrays;

public class SplittingNumbers {
    /**
     * Splits an integer into its place value components and returns them as an Integer array.
     *
     * @param n The integer to split.
     * @return An Integer array containing the place value components of the input integer.
     * @author Franco Bernardele
     */
    public static Integer[] splittingNumbers(int n) {
        int number = 0;
        int checker = 1;
        boolean negativo = false;
        if (n < 0) {
            negativo = true;
            n = n * (-1);
        }
        ArrayList<Integer> arreglo = new ArrayList<>();
        while (n > 0) {
            number = n % 10;
            n = n / 10;
            number = number * checker;
            arreglo.add(number);
            checker = checker * 10;
        }
        Integer[] arregloa = new Integer[arreglo.size()];
        int arregloIndex = 0;
        for (int i = arreglo.size() - 1; i >= 0; i--) {
            arregloa[arregloIndex] = arreglo.remove(i);
            if (negativo) {
                arregloa[arregloIndex] = arregloa[arregloIndex] * (-1);
            }
            arregloIndex++;
        }
        return arregloa;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(splittingNumbers(-452))); // Output: [-400, -50, -2]
        System.out.println(Arrays.toString(splittingNumbers(9251))); // Output: [9000, 200, 50, 1]
    }
}