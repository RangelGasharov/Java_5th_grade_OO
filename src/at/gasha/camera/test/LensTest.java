package at.gasha.camera.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import at.gasha.camera.Lens;
import at.gasha.camera.Manufacturer;

public class LensTest {
    @Test
    void testGetFocalLength() {
        Manufacturer canon = new Manufacturer("Canon", "Japan");
        Lens lens = new Lens(10, canon);
        Assert.assertEquals(lens.getFocalLength(), 10);
    }

    @Test
    void testGetManufacturer() {
        Manufacturer canon = new Manufacturer("Canon", "Japan");
        Lens lens = new Lens(10, canon);
        Assert.assertEquals(canon, lens.getManufacturer());
    }
}