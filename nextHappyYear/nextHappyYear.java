package nextHappyYear;

import java.util.HashSet;
import java.util.Set;

public class nextHappyYear {
    /**
     * Finds the next happy year after a given year. A happy year is a year with no repeated digits.
     *
     * @param year The starting year.
     * @return The next happy year.
     * @author Franco Bernardele
     */
    public static int happyYear(int year) {
        boolean flag = true;
        while (flag) {
            year = ++year;
            flag = tieneValoresRepetidos(separarCifras(year));
        }
        return year;
    }

    /**
     * Checks if an integer array contains any repeated values.
     *
     * @param array The integer array to check.
     * @return true if the array contains repeated values, false otherwise.
     */
    public static boolean tieneValoresRepetidos(int[] array) {
        Set<Integer> seen = new HashSet<>();
        for (int num : array) {
            if (!seen.add(num)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Separates the digits of an integer into an integer array.
     *
     * @param numero The integer to separate.
     * @return An integer array containing the digits of the input integer.
     */
    public static int[] separarCifras(int numero) {
        String numeroStr = String.valueOf(numero);
        int[] cifras = new int[numeroStr.length()];
        for (int i = 0; i < numeroStr.length(); i++) {
            cifras[i] = Character.getNumericValue(numeroStr.charAt(i));
        }
        return cifras;
    }

    public static void main(String[] args) {
        System.out.println(happyYear(1995)); // Output: 2013
        System.out.println(happyYear(2025));
    }
}