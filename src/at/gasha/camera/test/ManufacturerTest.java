package at.gasha.camera.test;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import at.gasha.camera.Manufacturer;

public class ManufacturerTest {
    private Manufacturer canon;

    @BeforeEach
    void setupTestDate() {
        this.canon = new Manufacturer("Canon", "Japan");
    }

    @Test
    void testGetCountry() {
        Assert.assertEquals(this.canon.getCountry(), "Japan");
    }

    @Test
    void testGetName() {
        Assert.assertEquals(this.canon.getName(), "Canon");
    }

    @Test
    void testSetCountry() {
        this.canon.setCountry("Test");
        Assert.assertEquals(this.canon.getCountry(), "Test");
    }
}
