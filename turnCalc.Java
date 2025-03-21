import java.util.HashMap;
import java.util.Map;

public class NumberConverter {

    /**
     * Converts an integer to a string representation using a custom mapping.
     *
     * @param num The integer to convert.
     * @return The string representation of the integer based on the custom mapping.
     * @author Franco Bernardele (Franspi-lol)
     */
    public static String turnCalcInt(int num) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(2, "Z");
        map.put(3, "E");
        map.put(4, "H");
        map.put(5, "S");
        map.put(6, "G");
        map.put(7, "L");
        map.put(8, "B");
        map.put(9, "");
        map.put(0, "O");
        String number = String.valueOf(num);
        char[] arreglo = number.toCharArray();
        int valor;
        String result = "";
        for (int i = arreglo.length - 1; i >= 0; i--) {
            valor = Integer.parseInt(String.valueOf(arreglo[i]));
            result += map.get(valor);
        }
        return result;
    }

    /**
     * Converts a string representation of a number to a string using a custom mapping.
     *
     * @param num The string representation of the number to convert.
     * @return The string representation based on the custom mapping.
     * @author Franco Bernardele (Franspi-lol)
     */
    public static String turnCalcString(String num) {
        Map<Character, String> map = new HashMap<>();
        map.put('1', "I");
        map.put('2', "Z");
        map.put('3', "E");
        map.put('4', "H");
        map.put('5', "S");
        map.put('6', "G");
        map.put('7', "L");
        map.put('8', "B");
        map.put('9', "");
        map.put('0', "O");
        char[] arreglo = num.toCharArray();
        String result = "";
        for (int i = arreglo.length - 1; i >= 0; i--) {
            result += map.get(arreglo[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(turnCalcInt(1234567890)); // Output: OBGLSHEZI
        System.out.println(turnCalcString("1234567890")); // Output: OBGLSHEZI
    }
}
