package test.algorithm.exam;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import exam.Perimeter;
import exam.StringSort;

public class examTest {
    @Test
    public void perimeterTest() {
        assertEquals(Perimeter.getTriangleNum(12), 1);
        assertEquals(Perimeter.getTriangleNum(24), 1);
        assertEquals(Perimeter.getTriangleNum(120), 3);
    }

    String s1 = "my/2019-01-01T09:00:01";
    String s2 = "my/2019-01-01T09:00:01";
    String s3 = "abc/2018-12-24T08:00:00/test/you";
    String s4 = "1/2018-12-24T08:00:00/test/Test1";
    String s5 = "123/2018-12-24T08:00:09/test/me/";
    String s6 = "123/2018-12-24T08:00:10/test/me/1999-12-24T08:00:09/1998-12-24T08:00:09";
    String s7 = "123/2018-12-24T08:00:11/test/me/1900-12-24T08:00:09";

    String[] input = {s1, s2, s3, s4, s5, s6, s7};
    String[] ans = {s4, s3, s5, s6, s7, s1};

    @Test
    public void stringSortTest() {
        assertArrayEquals(ans, StringSort.stringSort(input));
    }
}
