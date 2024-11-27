package at.gasha.datagenerator;

import java.util.Random;

public class DataGenerator {
    public static int[] generateDataArray(int size) {
        int[] data = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt();
        }
        return data;
    }

    public static int[] generateDataArray(int size, int min, int max) {
        int[] data = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt(min, max);
        }
        return data;
    }

    void printArray(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
