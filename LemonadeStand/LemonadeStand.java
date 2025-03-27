package LemonadeStand;

public class LemonadeStand {

    /**
     * Determines if a lemonade stand can provide correct change to each customer.
     *
     * @param bills An array of integers representing the bills paid by customers.
     * @return true if the lemonade stand can provide correct change, false otherwise.
     * @author Franco Bernardele
     */
    public static boolean lemonade(int[] bills) {
        int bill5 = 0;
        int bill10 = 0;
        int bill20 = 0;

        for (int bill : bills) {
            switch (bill) {
                case 5:
                    bill5++;
                    break;
                case 10:
                    bill10++;
                    if (bill5 > 0) {
                        bill5--;
                    } else {
                        return false;
                    }
                    break;
                case 20:
                    bill20++;
                    if (bill10 > 0 && bill5 > 0) {
                        bill10--;
                        bill5--;
                    } else if (bill5 >= 3) {
                        bill5 = bill5 - 3;
                    } else {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] numero = {5, 5, 10, 20, 5, 10};
        System.out.println(lemonade(numero)); // Output: true
    }
}