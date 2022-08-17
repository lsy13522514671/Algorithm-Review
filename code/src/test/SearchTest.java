package test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import search.BinarySearch;
import search.LinearSearch;


public class SearchTest {
    int[] emptyArray = {};
    int[] oneElementArray = { 99 };
    int[] identicalElementArray = { 5, 5, 5, 5, 5 };
    int[] increaseOrderArray1 = { 0, 1, 2, 3, 4 };
    int[] increaseOrderArray2 = { 0, 2, 7, 11, 15 };
    int[] increaseOrderArray3 = { 1, 12, 77, 98, 105, 200, 200, 299 };
    int[] decreaseOrderArray = { 9, 7, 5, 2, 1, 0 };
    int[] unsortedArray1 = { 71, 2, 3, 66, 1, 17 };
    int[] unsortedArray2 = { 1, 2, 7, 5, 3, 1, 2, 18, 0 };

    @Test
    public void testBinarySearch() {
        assertEquals(BinarySearch.search(increaseOrderArray1 , 4), 4);
        assertEquals(BinarySearch.search(increaseOrderArray1 , 8), -1);
        assertEquals(BinarySearch.search(increaseOrderArray2 , 0), 0);
        assertEquals(BinarySearch.search(increaseOrderArray2 , 78), -1);
        assertEquals(BinarySearch.search(increaseOrderArray2 , 6), -1);
        assertEquals(BinarySearch.search(increaseOrderArray2 , 11), 3);
        assertEquals(BinarySearch.search(increaseOrderArray3 , 200), 6);
        assertEquals(BinarySearch.search(increaseOrderArray3 , 150), -1);
        assertEquals(BinarySearch.search(increaseOrderArray3 , 300), -1);
    }

    @Test
    public void testLinearSearch () {
        assertEquals(LinearSearch.search(emptyArray, 1), -1);
        assertEquals(LinearSearch.search(oneElementArray, 3), -1);
        assertEquals(LinearSearch.search(oneElementArray, 99), 0);
        assertEquals(LinearSearch.search(identicalElementArray, 5), 0);
        assertEquals(LinearSearch.search(identicalElementArray, 999), -1);
        assertEquals(LinearSearch.search(increaseOrderArray1 , 4), 4);
        assertEquals(LinearSearch.search(increaseOrderArray1 , 8), -1);
        assertEquals(LinearSearch.search(increaseOrderArray2 , 11), 3);
        assertEquals(LinearSearch.search(increaseOrderArray3 , 300), -1);
        assertEquals(LinearSearch.search(decreaseOrderArray, 1), 4);
        assertEquals(LinearSearch.search(unsortedArray1, 1), 4);
        assertEquals(LinearSearch.search(unsortedArray1, 17), 5);
        assertEquals(LinearSearch.search(unsortedArray1, 18), -1);
        assertEquals(LinearSearch.search(unsortedArray2, 5), 3);
    }
}
