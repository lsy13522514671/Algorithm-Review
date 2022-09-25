package algorithm.search;

public class BinarySearch {
    public static int search(int[] array, int target) {
        if(array.length==0) {
            return -1;
        }

        int left=0;
        int right=array.length-1;
        int mid = (right-left+1)/2 + left;

        while(left <= right) {
            if(array[mid] == target) {
                return mid;
            } else if(array[mid] < target) {
                left=mid+1;
            } else {
                right=mid-1;
            }
            mid = (right-left+1)/2 + left;
        }

        return -1;
    }
}
