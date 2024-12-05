package at.gasha.algorithms.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import at.gasha.algorithms.DataGenerator;

public class DataGeneratorTest {
    @Test
    void testGenerateDataArray() {
        int[] data = DataGenerator.generateDataArray(10);
        Assert.assertEquals(data.length, 10);
    }

    @Test
    void testGenerateDataArray2() {
        int[] data = DataGenerator.generateDataArray(100, 1, 5);
        for (int i = 0; i < data.length; i++) {
            Assert.assertTrue(data[i] >= 1 && data[i] <= 5);
        }
    }
}
