package algorithms.sort;

import java.util.Arrays;
import junit.runner.Version;
import algorithms.sort.*;

public class Main {
    public static void main(String[] args) {
        int[] unsortedArray = new int[]{ 4,3,2,1 }; 
        InsertionSort ins = new InsertionSort();
        int[] res = ins.sort(unsortedArray);
        System.out.println(Arrays.toString(res));
        // ins.swap(unsortedArray, 0, 1);
        // System.out.println(Arrays.toString(unsortedArray));
        System.out.println("JUnit version is: " + Version.id());
    }
}