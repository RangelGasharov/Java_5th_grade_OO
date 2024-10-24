package at.gasha.camera.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import at.gasha.camera.Manufacturer;

public class ManufacturerTest {
    @Test
    void testGetCountry() {
        Manufacturer canon = new Manufacturer("Canon", "Japan");
        Assert.assertEquals(canon.getCountry(), "Japan");
    }

    @Test
    void testGetName() {
        Manufacturer canon = new Manufacturer("Canon", "Japan");
        Assert.assertEquals(canon.getName(), "Canon");
    }

    @Test
    void testSetCountry() {
        Manufacturer canon = new Manufacturer("Canon", "Japan");
        canon.setCountry("Test");
        Assert.assertEquals(canon.getCountry(), "Test");
    }
}
