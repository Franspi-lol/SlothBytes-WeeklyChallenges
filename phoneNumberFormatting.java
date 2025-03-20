static String devolverNro(int[] numero)
    {
        String numeroReturn = "(";
        for (int i = 0; i < numero.length; i++) {
            if (i == 3)
            {
                numeroReturn += ") ";
            }
            if (i==6)
            {
                numeroReturn += "-";
            }
            numeroReturn += numero[i];

        }
        return numeroReturn;
    }

public void main() {
}