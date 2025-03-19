import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

//By Franco Bernardele aka Franspi-lol

public class Main {
    public static void main(String[] args) {
        String[] arr = {"a", "c"};
        Integer[] arr2 = {3, 4, 8, 9, 10};
        System.out.println(bridgeShuffle(arr, arr2));
    }

    public static <T> ArrayList<T> bridgeShuffle(T[] a, T[] b) {
        int i = 0;
        ArrayList<T> list = new ArrayList<>();
        while (a.length > i || b.length > i) {
            if (i< a.length)
            {
                list.add(a[i]);
            }
            if (i<b.length) {
                list.add(b[i]);
            }
            i++;
        }
        return list;
    }

}