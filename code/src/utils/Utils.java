package utils;

import java.util.List;

public class Utils {
    public static <T>  void printList(List<T> r) {
        System.out.print("[");
        for(int i=0; i < r.size(); i++) {
            if(i<r.size()-1) {
                System.out.print(r.get(i)+",");
            } else {
                System.out.print(r.get(i));
            }
        }

        System.out.print("]");
        System.out.print("\n");
    }

    public static Integer[][] convertInt2DArray(int[][] r) {
        Integer[][] result = new Integer[r.length][r[0].length];

        for(int i=0; i < r.length; i++) {
            for(int j=0; j<r[0].length; j++) {
                result[i][j] = r[i][j];
            }
        }

        return result;
    }

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

    public static <T> void print2DArray(T[][] in) {
        System.out.print("[");
        for(int i=0; i < in.length; i++) {
            System.out.print("[");
            for(int j=0; j < in[0].length; j++) {
                if(j<in[i].length-1) {
                    System.out.print(in[i][j]+",");
                } else {
                    System.out.print(in[i][j]);
                }
            }

            if(i<in.length-1) {
                System.out.print("],");
            } else {
                System.out.print("]");
            }
        }
        System.out.print("]");
        System.out.print("\n");
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
