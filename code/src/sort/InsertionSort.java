package sort;

public class InsertionSort {
    public static int[] sort(int[] array) {
        int[] arrayCopy = new int[array.length];
        System.arraycopy(array, 0, arrayCopy, 0, arrayCopy.length);

        for(int i=1; i<arrayCopy.length; i++) {
            int key=arrayCopy[i];
            int j=i-1;
            while((j>=0) && (key<arrayCopy[j])) {
                arrayCopy[j+1]=arrayCopy[j];
                j--;
            }
            arrayCopy[j+1]=key;
        }
        
        return arrayCopy;
    }
}
