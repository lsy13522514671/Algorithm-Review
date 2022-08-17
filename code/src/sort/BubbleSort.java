package sort;

public class BubbleSort {
    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static int[] sort(int[] array) {
        if(array.length<2) {
            return array;
        }

        int[] arrayCopy = new int[array.length];
        System.arraycopy(array, 0, arrayCopy, 0, arrayCopy.length);

        for(int i=1; i < arrayCopy.length; i++) {
            for(int j=i-1; j>=0; j--) {
                if(arrayCopy[i] < arrayCopy[j]) {
                    swap(arrayCopy, i, j);
                    i=j;
                } else {
                    break;
                }
            }
        }

        return arrayCopy;
    }
}
