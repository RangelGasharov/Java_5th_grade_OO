package at.gasha.camera.test;

import java.util.Date;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import at.gasha.camera.File;

public class FileTest {
    @Test
    void testGetCreatedAt() {
        Date creationDate = new Date();
        File file = new File("12345", creationDate, 0.1);
        Assert.assertEquals(file.getCreatedAt(), creationDate);
    }

    @Test
    void testGetName() {
        File file = new File("12345", new Date(), 0.1);
        Assert.assertEquals(file.getName(), "12345");
    }

    @Test
    void testGetSizeInMb() {
        File file = new File("12345", new Date(), 0.1);
        Assert.assertEquals(file.getSizeInMb(), 0.1, 0.00000001);
    }

    @Test
    void testSetName() {
        File file = new File("12345", new Date(), 0.1);
        file.setName("Test");
        Assert.assertEquals(file.getName(), "Test");
    }
}
