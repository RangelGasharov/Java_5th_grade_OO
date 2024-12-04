package at.gasha.algorithms;

public class Main {
    public static void main(String[] args) {
        DataGenerator generator = new DataGenerator();
        System.out.println("Initial array");
        int[] numbers = generator.generateDataArray(10, 0, 100);
        generator.printArray(numbers);
        System.out.println("Bubblesort array");
        BubbleSort bubbleSort = new BubbleSort();
        int[] numbersBubbleSort = bubbleSort.sort(numbers);
        generator.printArray(numbersBubbleSort);
    }
}