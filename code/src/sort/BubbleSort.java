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

        int n = arrayCopy.length;
        boolean swapped = false;

        for(int i=0; i < n-1; i++) {
            for(int j=0; j < n-1-i; j++) {
                if(arrayCopy[j] > arrayCopy[j+1]) {
                    swap(arrayCopy, j, j+1);
                    swapped=true;
                }
            }

            if(!swapped) {
                return arrayCopy;
            }
        }

        return arrayCopy;
    }
}
