package at.gasha.camera.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.util.Date;

import at.gasha.camera.File;
import at.gasha.camera.SDCard;

public class SDCardTest {
    void testGetCapacityInMB() {
        SDCard sdCard = new SDCard(1000);
        Assert.assertEquals(sdCard.getFreeSpace(), 1000, 0);
    }

    @Test
    void testGetFiles() {

    }

    @Test
    void testGetFreeSpace() {
        SDCard sdCard = new SDCard(1000);
        File file = new File("12345", new Date(), 100);
        sdCard.saveFile(file);
        Assert.assertEquals(sdCard.getFreeSpace(), 900, 0);
    }

    @Test
    void testSaveFile() {

    }
}
