package WordBuckets;

import java.util.Arrays;

public class wordBuckets {
    public static void main(String[] args) {
        String palabras = "Arreglo de palabras";
        System.out.println(Arrays.toString(split_into_buckets(palabras, 1)));
    }

    public static String[] split_into_buckets(String palabras, int limiteCaracteres)
    {
        String[] palabrasArray = palabras.split(" ");
        int sumador = 0;
        for (int i = 0; i < palabrasArray.length; i++) {
            System.out.println(palabrasArray[i].length());

        }
        return palabrasArray;
    }
}
