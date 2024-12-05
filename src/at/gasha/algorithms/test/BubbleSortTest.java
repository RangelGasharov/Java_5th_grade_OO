package at.gasha.algorithms.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import at.gasha.algorithms.BubbleSort;

public class BubbleSortTest {
    @Test
    void testGetName() {
        BubbleSort bubbleSort = new BubbleSort("Test");
        Assert.assertEquals(bubbleSort.getName(), "Test");
    }

    @Test
    void testSort() {
        int[] data = new int[] { 3, 1, 5, 6, 2, 4, 9, 8, 7 };
        int[] sortedData = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        BubbleSort bubbleSort = new BubbleSort("Test");
        Assert.assertArrayEquals(sortedData, bubbleSort.sort(data));
    }
}