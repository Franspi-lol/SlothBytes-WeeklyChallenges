package changeEnough;

public class changeEnough {
    /**
     * Determines if the given amount of change is enough to pay a specified amount.
     *
     * @param cambio An array of integers representing the number of quarters, dimes, nickels, and pennies.
     * @param aPagar The amount to pay.
     * @return true if the change is enough to pay the amount, false otherwise.
     * @author Franco Bernardele
     */
    public static boolean changeEnough(int[] cambio, float aPagar) {
        float quarter = (float) (cambio[0] * 0.25);
        float dime = (float) (cambio[1] * 0.10);
        float nickel = (float) (cambio[2] * 0.05);
        float penny = (float) (cambio[3] * 0.01);

        float total = quarter + dime + nickel + penny;
        return total >= aPagar;
    }

    public static void main(String[] args) {
        int[] cambio = {30, 40, 20, 5};
        System.out.println(changeEnough(cambio, 12.55F)); // Output: true
    }
}
