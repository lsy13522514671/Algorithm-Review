package algorithm.sort;

public class HeapSort {
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void heapify(int[] array, int n, int i) {
        int largest = i;
        int lChild = 2*i+1;
        int rChild = 2*i+2;

        if((lChild<n) && (array[largest] < array[lChild])) {
            largest=lChild;
        }

        if((rChild<n) && (array[largest] < array[rChild])) {
            largest=rChild;
        }

        if(largest!=i) {
            swap(array, i, largest);
            heapify(array, n, largest);
        }
    }

    public static void sort(int[] array) {
        int n = array.length;

        for(int i=n/2-1; i>=0; i--) {
            heapify(array, n, i);
        }

        for(int i=n-1; i>0; i--) {
            swap(array, i, 0);
            heapify(array, i, 0);
        }
    }
}
