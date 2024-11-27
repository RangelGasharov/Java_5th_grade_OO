package at.gasha.datagenerator.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import at.gasha.datagenerator.DataGenerator;

public class DataGeneratorTest {
    @Test
    void testGenerateDataArray() {
        int[] data = DataGenerator.generateDataArray(10);
        Assert.assertEquals(data.length, 10);
    }

    @Test
    void testGenerateDataArray2() {
        int[] data = DataGenerator.generateDataArray(10, 99, 100);
        for (int i = 0; i < data.length; i++) {
            Assert.assertEquals(data[i], 99);
        }
    }
}
