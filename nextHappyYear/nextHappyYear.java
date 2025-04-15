package nextHappyYear;

public class nextHappyYear {
    public static void main(String[] args) {

    }
    public static int happyYear(int year)
    {
        int[] yearArray = separarCifras(year);
        int nextHappyYear = 0;



        return nextHappyYear;
    }

    public static int[] separarCifras(int numero)
    {
        String numeroStr = String.valueOf(numero);
        int[] cifras = new int[numeroStr.length()];
        for (int i = 0; i < numeroStr.length(); i++) {
            cifras[i] = Character.getNumericValue(numeroStr.charAt(i));
        }
        return cifras;
    }
}
