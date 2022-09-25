package algorithm.sort;

public class MergeSort {
    public static void merge(int[] array, int left, int mid, int right) {
        int m = mid-left;
        int n = right-mid+1;

        int[] leftArray = new int[m];
        int[] rightArray = new int[n];

        for(int i=0; i<m; i++) {
            leftArray[i]=array[left+i];
        }

        for(int j=0; j<n; j++) {
            rightArray[j]=array[mid+j];
        }

        int k=0;
        int l=0;
        while((k<m) && (l<n)) {
            if(leftArray[k] <= rightArray[l]) {
                array[left]=leftArray[k];
                k++;
            } else {
                array[left]=rightArray[l];
                l++;
            }
            left++;
        }

        while(k<m) {
            array[left]=leftArray[k];
            k++;
            left++;
        }

        while(l<n) {
            array[left]=rightArray[l];
            l++;
            left++;
        }
    }

    public static void mergeSort(int[] array, int left, int right) {
        if(left < right) {
            int mid = (right-left+1)/2 + left;
            mergeSort(array, left, mid-1);
            mergeSort(array, mid, right);
            merge(array, left, mid, right);
        }
    }

    public static void sort(int[] array) {
        mergeSort(array, 0, array.length-1);
    }
}
