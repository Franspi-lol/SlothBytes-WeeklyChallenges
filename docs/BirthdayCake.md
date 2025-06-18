The `BirthdayCake` class contains a method, `birthdayCakeCandles`, that takes an integer array representing the height of candles on a cake. It returns the count of how many candles are the tallest.

## Class: `BirthdayCake`

### Author

Franco Bernardele

### Usage Example

```java
package BirthdayCake;

public class BirthdayCake {
    public static void main(String[] args) {
        // Example 1: A non-empty array of candles
        int[] velas1 = {3, 2, 1, 3};
        System.out.println(birthdayCakeCandles(velas1)); // Output: 2

        // Example 2: An empty array of candles
        int[] velas2 = {};
        System.out.println(birthdayCakeCandles(velas2)); // Output: 0

        // Example 3: An array with all candles of the same height
        int[] velas3 = {4, 4, 4, 4};
        System.out.println(birthdayCakeCandles(velas3)); // Output: 4
    }

    /**
     * Calculates how many candles are the tallest on a birthday cake.
     *
     * @param velas An array of integers representing the height of the candles.
     * @return The number of candles that are the tallest. Returns 0 if the array is empty.
     */
    public static int birthdayCakeCandles(int[] velas) {
        if (velas.length == 0) {
            return 0;
        }

        int mayor = 0;
        int cantidad = 0;

        // Find the height of the tallest candle
        for (int vela : velas) {
            if (vela > mayor) {
                mayor = vela;
            }
        }

        // Count how many candles are of the tallest height
        for (int vela : velas) {
            if (vela == mayor) {
                cantidad++;
            }
        }

        return cantidad;
    }
}
```