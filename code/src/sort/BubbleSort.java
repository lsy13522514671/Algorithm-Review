package sort;

public class BubbleSort {
    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void sort(int[] array) {
        if(array.length<2) {
            return ;
        }

        int n = array.length;
        boolean swapped = false;

        for(int i=0; i < n-1; i++) {
            for(int j=0; j < n-1-i; j++) {
                if(array[j] > array[j+1]) {
                    swap(array, j, j+1);
                    swapped=true;
                }
            }

            if(!swapped) {
                return ;
            }
        }
    }
}
