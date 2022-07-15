package algorithms.sort;

import java.util.Arrays;

public class InsertionSort implements IArraySort {

    public int[] sort(int[] sourceArray) {
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        for (int j=1; j < arr.length; j++) {
            int key = arr[j];
            int i = j - 1;
            while (i >= 0 && key<arr[i]) {
                arr[i+1] = arr[i];
                System.out.println(Arrays.toString(arr));
                i--;
            }
            arr[i+1]= key;
        }
        return arr;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
