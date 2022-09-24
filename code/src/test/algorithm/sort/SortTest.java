package test.algorithm.sort;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

import sort.InsertionSort;
import sort.MergeSort;
import sort.BubbleSort;
import sort.HeapSort;

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
    int[][] ans = {answerEmptyArray, answerOneElementArray, answerIdenticalElementArray,
    answerIncreaseOrderArray, answerDecreaseOrderArray, answerUnsortedArray1, answerUnsortedArray2};

    private int[][] cloneInput() {
        int[][] result = {emptyArray.clone(), oneElementArray.clone(), identicalElementArray.clone(),
            increaseOrderArray.clone(), decreaseOrderArray.clone(), unsortedArray1.clone(), unsortedArray2.clone()};

        return result;
    }

    @Test
    public void testBubbleSort () {
        int[][] inputArray = cloneInput();
        for(int i=0; i<ans.length; i++) {
            BubbleSort.sort(inputArray[i]);
            assertArrayEquals(ans[i], inputArray[i]);
        }
    }


    @Test
    public void testInsertionSort () {
        int[][] inputArray = cloneInput();
        for(int i=0; i<ans.length; i++) {
            InsertionSort.sort(inputArray[i]);
            assertArrayEquals(ans[i], inputArray[i]);
        }
    }

    @Test
    public void testMergeSort () {
        int[][] inputArray = cloneInput();
        for(int i=0; i<ans.length; i++) {
            MergeSort.sort(inputArray[i]);
            assertArrayEquals(ans[i], inputArray[i]);
        }
    }

    @Test
    public void testHeapSort () {
        int[][] inputArray = cloneInput();
        for(int i=0; i<ans.length; i++) {
            HeapSort.sort(inputArray[i]);
            assertArrayEquals(ans[i], inputArray[i]);
        }
    }
}
