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
        SDCard sdCard = new SDCard(0.3);
        File file1 = new File("12345", new Date(), 0.1);
        File file2 = new File("TestFile", new Date(), 0.1);
        sdCard.saveFile(file1);
        sdCard.saveFile(file2);
        Assert.assertEquals(sdCard.getFiles().get(1).getName(), "TestFile");
    }

    @Test
    void testGetFreeSpace() {
        SDCard sdCard = new SDCard(0.3);
        File file = new File("12345", new Date(), 0.1);
        sdCard.saveFile(file);
        Assert.assertEquals(sdCard.getFreeSpace(), 0.2, 0.0000000001);
    }

    @Test
    void testSaveFile() {
        SDCard sdCard = new SDCard(0.3);
        File file1 = new File("12345", new Date(), 0.1);
        File file2 = new File("TestFile", new Date(), 0.1);
        sdCard.saveFile(file1);
        sdCard.saveFile(file2);
        Assert.assertEquals(sdCard.getFiles().get(1).getName(), "TestFile");
    }
}
