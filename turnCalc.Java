//Made a bit of a mess for myself by using Java, but hey i did two versions: one for String and one for int.
    public static String turnCalcInt(int num)
    {
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
        for (int i = arreglo.length-1; i>=0; i--) {
            valor = Integer.parseInt(String.valueOf(arreglo[i]));
            result += map.get(valor);
        }
        return result;
    }

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