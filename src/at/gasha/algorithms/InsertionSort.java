package at.gasha.algorithms;

public class InsertionSort implements Sorter {
    private String name;

    public InsertionSort(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            int currentNumber = array[i];

            while (j >= 0 && array[j] > currentNumber) {
                array[j + 1] = array[j];
                j -= 1;
            }
            array[j + 1] = currentNumber;
        }
        return array;
    }
}
