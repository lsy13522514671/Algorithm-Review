package test;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

import sort.InsertionSort;
import sort.MergeSort;
import sort.BubbleSort;

public class SortTest {
    int[] emptyArray = {};
    int[] oneElementArray = { 99 };
    int[] identicalElementArray = { 5, 5, 5, 5, 5 };
    int[] increaseOrderArray = { 0, 1, 2, 3, 4 };
    int[] decreaseOrderArray = { 9, 7, 5, 2, 1, 0 };
    int[] unsortedArray1 = { 71, 2, 3, 66, 1, 17 };
    int[] unsortedArray2 = { 1, 2, 7, 5, 3, 1, 2, 18, 0 };

    int[] answerEmptyArray = {};
    int[] answerOneElementArray = { 99 };
    int[] answerIdenticalElementArray = { 5, 5, 5, 5, 5 };
    int[] answerIncreaseOrderArray = { 0, 1, 2, 3, 4 };
    int[] answerDecreaseOrderArray = { 0, 1, 2, 5, 7, 9 };
    int[] answerUnsortedArray1 = { 1, 2, 3, 17, 66, 71 };
    int[] answerUnsortedArray2 = { 0, 1, 1, 2, 2, 3, 5, 7, 18 };

    @Test
    public void testBubbleSort () { 
        assertArrayEquals(answerEmptyArray, BubbleSort.sort(emptyArray));
        assertArrayEquals(answerOneElementArray, BubbleSort.sort(oneElementArray));
        assertArrayEquals(answerIdenticalElementArray, BubbleSort.sort(identicalElementArray));
        assertArrayEquals(answerIncreaseOrderArray, BubbleSort.sort(increaseOrderArray));
        assertArrayEquals(answerDecreaseOrderArray, BubbleSort.sort(decreaseOrderArray));
        assertArrayEquals(answerUnsortedArray1, BubbleSort.sort(unsortedArray1));
        assertArrayEquals(answerUnsortedArray2, BubbleSort.sort(unsortedArray2));
    }

    @Test
    public void testInsertionSort () {
        assertArrayEquals(answerEmptyArray, InsertionSort.sort(emptyArray));
        assertArrayEquals(answerOneElementArray, InsertionSort.sort(oneElementArray));
        assertArrayEquals(answerIdenticalElementArray, InsertionSort.sort(identicalElementArray));
        assertArrayEquals(answerIncreaseOrderArray, InsertionSort.sort(increaseOrderArray));
        assertArrayEquals(answerDecreaseOrderArray, InsertionSort.sort(decreaseOrderArray));
        assertArrayEquals(answerUnsortedArray1, InsertionSort.sort(unsortedArray1));
        assertArrayEquals(answerUnsortedArray2, InsertionSort.sort(unsortedArray2));
    }

    @Test
    public void testMergeSort () { 
        assertArrayEquals(answerEmptyArray,  MergeSort.sort(emptyArray));
        assertArrayEquals(answerOneElementArray, MergeSort.sort(oneElementArray));
        assertArrayEquals(answerIdenticalElementArray,  MergeSort.sort(identicalElementArray));
        assertArrayEquals(answerIncreaseOrderArray, MergeSort.sort(increaseOrderArray));
        assertArrayEquals(answerDecreaseOrderArray, MergeSort.sort(decreaseOrderArray));
        assertArrayEquals(answerUnsortedArray1, MergeSort.sort(unsortedArray1));
        assertArrayEquals(answerUnsortedArray2, MergeSort.sort(unsortedArray2));
    }
}
