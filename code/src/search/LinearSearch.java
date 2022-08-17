package search;

public class LinearSearch {
    public static int search(int[] array, int target) {
        if(array.length==0) {
            return -1;
        }

        for(int i=0; i<array.length; i++) {
            if(array[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
