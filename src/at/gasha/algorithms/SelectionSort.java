package at.gasha.algorithms;

public class SelectionSort implements Sorter {
    private String name;

    public SelectionSort(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int indexMin = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    indexMin = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[indexMin] = temp;
        }
        return array;
    }
}
