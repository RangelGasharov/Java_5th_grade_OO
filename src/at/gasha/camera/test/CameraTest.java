package at.gasha.camera.test;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import at.gasha.camera.Camera;
import at.gasha.camera.Lens;
import at.gasha.camera.Manufacturer;
import at.gasha.camera.SDCard;
import at.gasha.camera.Camera.RESOLUTION;

public class CameraTest {
    private Camera camera;
    private Manufacturer canon;
    private SDCard sdCard;
    private SDCard backupSDCard;
    private Lens lens;
    private Lens backupLens;

    @BeforeEach
    void setupTestData() {
        this.canon = new Manufacturer("Canon", "Japan");
        this.sdCard = new SDCard(16000);
        this.backupSDCard = new SDCard(2000);
        this.lens = new Lens(10, canon);
        this.backupLens = new Lens(16, canon);
        this.camera = new Camera(0.4, "#FF003A", RESOLUTION.HIGH, this.canon, this.sdCard, this.lens);
    }

    @Test
    void testTakePicture() {
        this.camera.takePicture();
        Assert.assertEquals(camera.getSdCard().getFiles().get(0).getSizeInMb(), 6, 0);
    }

    @Test
    void testGetWeight() {
        Assert.assertEquals(camera.getWeight(), 0.4, 0);
    }

    @Test
    void testGetColor() {
        Assert.assertEquals(camera.getColor(), "#FF003A");
    }

    @Test
    void testSetCurrentResolution() {
        this.camera.setCurrentResolution(RESOLUTION.LOW);
        Assert.assertEquals(camera.getCurrentResolution(), RESOLUTION.LOW);
    }

    @Test
    void testGetCurrentResolution() {
        Assert.assertEquals(camera.getCurrentResolution(), RESOLUTION.HIGH);
    }

    @Test
    void testGetManufacturer() {
        Assert.assertEquals(camera.getManufacturer(), this.canon);
    }

    @Test
    void testGetSdCard() {
        Assert.assertEquals(camera.getSdCard(), this.sdCard);
    }

    @Test
    void testGetLens() {
        Assert.assertEquals(camera.getLens(), this.lens);
    }

    @Test
    void testSetLens() {
        this.camera.setLens(backupLens);
        Assert.assertEquals(camera.getLens(), this.backupLens);
    }

    @Test
    void testSetSdCard() {
        this.camera.setSdCard(backupSDCard);
        Assert.assertEquals(camera.getSdCard(), backupSDCard);
    }
}
