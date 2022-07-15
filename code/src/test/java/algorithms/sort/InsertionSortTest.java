package algorithms.sort;

import org.junit.Test;

import org.junit.Assert;

public class InsertionSortTest {

    @Test
    public void sortedArrayTest() {
        int[] unsortedArray = new int[]{ 4,3,2,1 };
        InsertionSort ins = new InsertionSort();
        int[] expectedReqult = new int[]{ 1,2,3,4 };
        Assert.assertArrayEquals((int[]) expectedReqult, ins.sort(unsortedArray));
    }
}
