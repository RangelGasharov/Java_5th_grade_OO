package at.gasha.camera.test;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import at.gasha.camera.Lens;
import at.gasha.camera.Manufacturer;

public class LensTest {
    private Lens lens;
    private Manufacturer canon;

    @BeforeEach
    void setupTestData() {
        this.canon = new Manufacturer("Canon", "Japan");
        this.lens = new Lens(10, this.canon);
    }

    @Test
    void testGetFocalLength() {
        Assert.assertEquals(this.lens.getFocalLength(), 10);
    }

    @Test
    void testGetManufacturer() {
        Assert.assertEquals(this.canon, this.lens.getManufacturer());
    }
}