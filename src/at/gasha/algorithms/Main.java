package at.gasha.algorithms;

public class Main {
    public static void main(String[] args) {
        DataGenerator generator = new DataGenerator();
        System.out.println("Initial array");
        int[] numbers = generator.generateDataArray(10, 0, 100);
        generator.printArray(numbers);
        System.out.println("Bubblesort array");
        BubbleSort bubbleSort = new BubbleSort("BubbleSort");
        int[] numbersBubbleSort = bubbleSort.sort(numbers);
        generator.printArray(numbersBubbleSort);
        System.out.println("InsertionSort array");
        InsertionSort insertionSort = new InsertionSort("InsertionSort");
        int[] numbersInsertionSort = insertionSort.sort(numbers);
        generator.printArray(numbersInsertionSort);
        System.out.println("SelectionSort array");
        SelectionSort selectionSort = new SelectionSort("SelectionSort");
        int[] numbersSelectionSort = selectionSort.sort(numbers);
        generator.printArray(numbersSelectionSort);
    }
}