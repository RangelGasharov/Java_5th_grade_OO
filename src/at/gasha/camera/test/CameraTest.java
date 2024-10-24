package at.gasha.camera.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import at.gasha.camera.Camera;
import at.gasha.camera.Lens;
import at.gasha.camera.Manufacturer;
import at.gasha.camera.SDCard;
import at.gasha.camera.Camera.RESOLUTION;

public class CameraTest {
    @Test
    void testTakePicture() {
        Manufacturer canon = new Manufacturer("Canon", "Japan");
        SDCard sdCard = new SDCard(16000);
        Lens lens = new Lens(10, canon);
        Camera camera = new Camera(0.4, "#FF003A", RESOLUTION.HIGH, canon, sdCard, lens);
        camera.takePicture();
        Assert.assertEquals(camera.getSdCard().getFiles().get(0).getSizeInMb(), 6, 0);
    }
}
