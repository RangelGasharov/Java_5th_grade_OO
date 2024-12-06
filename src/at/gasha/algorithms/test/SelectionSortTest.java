package at.gasha.algorithms.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import at.gasha.algorithms.BubbleSort;
import at.gasha.algorithms.SelectionSort;

public class SelectionSortTest {
    @Test
    void testGetName() {
        SelectionSort selectionSort = new SelectionSort("Test");
        Assert.assertEquals(selectionSort.getName(), "Test");
    }

    @Test
    void testSort() {
        int[] data = new int[] { 3, 1, 5, 6, 2, 4, 9, 8, 7 };
        int[] sortedData = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        SelectionSort selectionSort = new SelectionSort("Test");
        Assert.assertArrayEquals(sortedData, selectionSort.sort(data));
    }
}
