package at.gasha.camera;

import java.util.ArrayList;

public class SDCard {
    private double capacityInMb;
    private ArrayList<File> files = new ArrayList<File>();

    public SDCard(double capacityInMb) {
        this.capacityInMb = capacityInMb;
    }

    public void saveFile(File file) {
        if (getFreeSpace() > file.getSizeInMb()) {
            this.files.add(file);
        } else {
            System.out.println("There is no more free space available!");
        }
    }

    public double getFreeSpace() {
        double occupiedCapacity = 0;
        for (File file : this.files) {
            occupiedCapacity += file.getSizeInMb();
        }
        return this.capacityInMb - occupiedCapacity;
    }

    public double getCapacityInMb() {
        return capacityInMb;
    }

    public ArrayList<File> getFiles() {
        return files;
    }
}
