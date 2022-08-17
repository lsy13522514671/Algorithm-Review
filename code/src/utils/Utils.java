package utils;

public class Utils {
    public static void printArray(int[] array) {
        if(array.length==0) {
            System.out.println("[ ]");
            return;
        }

        String listTemp = "[ ";
        for(int e : array) {
            listTemp=listTemp+e+", ";
        }

        listTemp=listTemp.substring(0, listTemp.length()-2);
        listTemp=listTemp+" ]";
        System.out.println(listTemp);
    }

    public static boolean check(int[] array) {
        if(array.length <= 1) {
            return true;
        }

        for(int i=0; i<array.length-1; i++) {
            if(array[i] > array[i+1]) {
                return false;
            }
        }

        return true;
    }
}
