package shuffledProperly;

public class shuffledProperly {
    public static void main(String[] args) {
        int[] arreglo = {3, 5, 1, 9, 8, 7, 6, 4, 2, 10};
        System.out.println(isShuffledWell(arreglo));
    }

    public static boolean isShuffledWell(int[] arreglo)
    {
        int auxiliar=0;
        int contador=0;
        int aux2=0;
        boolean flag=true;
        for (int i = 0; i < arreglo.length; i++) {
            auxiliar=i;
            aux2=i;
            while (flag && contador<3)
            {
                auxiliar++;


                if(arreglo[aux2]!=arreglo[auxiliar]-1)
                {
                    flag=false;
                }
                contador++;
                auxiliar++;
                if (auxiliar == arreglo.length-3)
                {
                    flag = false;
                }else
                {
                    auxiliar--;
                }
                aux2++;
            }
            if (contador<3)
            {
                contador=0;
                flag=true;
                auxiliar=i;
            }
            while (flag && contador<3)
            {

                if(arreglo[aux2]!=arreglo[auxiliar]+1)
                {
                    flag=false;
                }
                contador++;
                auxiliar++;
                if (auxiliar == arreglo.length-3)
                {
                    flag = false;
                }
                aux2++;

            }
            if (contador>=3)
            {
                return false;
            }


        }
        return true;
    }
}
