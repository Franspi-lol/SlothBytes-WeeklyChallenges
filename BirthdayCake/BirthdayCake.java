package BirthdayCake;



public class BirthdayCake {
    public static void main(String[] args) {
        System.out.println(birthdayCakeCandles(new int[]{}));
    }

    public static int birthdayCakeCandles(int[] velas)
    {
        if (velas.length==0)
            return 0;
        int mayor = 0;
        int cantidad = 0;

        for (int i = 0; i < velas.length; i++) {
            if (mayor == 0)
            {
                if (i==0)
                {
                    mayor = velas[i];
                }
            }else
            {
                if (velas[i]>mayor)
                {
                    mayor = velas[i];
                    cantidad = 1;
                }else if (velas[i] == mayor)
                {
                    cantidad++;
                }

            }

        }
        return cantidad;
    }
}

