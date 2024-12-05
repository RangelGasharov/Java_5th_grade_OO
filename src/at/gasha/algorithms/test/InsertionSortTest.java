package at.gasha.algorithms.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import at.gasha.algorithms.InsertionSort;

public class InsertionSortTest {
    @Test
    void testGetName() {
        InsertionSort insertionSort = new InsertionSort("Test");
        Assert.assertEquals(insertionSort.getName(), "Test");
    }

    @Test
    void testSort() {
        int[] data = { 3, 1, 5, 6, 2, 4, 9, 8, 7 };
        int[] sortedData = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        InsertionSort insertionSort = new InsertionSort("Test");
        Assert.assertArrayEquals(sortedData, insertionSort.sort(data));
    }
}
