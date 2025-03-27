public class FormatearNumero {

    /**
     * Formats an integer array representing a phone number into a string with parentheses, spaces, and hyphens.
     *
     * @param numero An integer array representing a phone number (e.g., [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]).
     * @return A formatted string representing the phone number (e.g., "(123) 456-7890").
     * @author Franco Bernardele (Franspi-lol)
     */
    static String devolverNro(int[] numero) {
        String numeroReturn = "(";
        for (int i = 0; i < numero.length; i++) {
            if (i == 3) {
                numeroReturn += ") ";
            }
            if (i == 6) {
                numeroReturn += "-";
            }
            numeroReturn += numero[i];
        }
        return numeroReturn;
    }

    public static void main(String[] args) {
        int[] phoneNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String formattedNumber = devolverNro(phoneNumber);
        System.out.println(formattedNumber); // Output: (123) 456-7890
    }
}
