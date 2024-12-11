package at.gasha.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        boolean isGoing = true;
        DataGenerator generator = new DataGenerator();
        List<Sorter> availableSorters = new ArrayList<>();
        BubbleSort bubbleSort = new BubbleSort("BubbleSort");
        InsertionSort insertionSort = new InsertionSort("InsertionSort");
        SelectionSort selectionSort = new SelectionSort("SelectionSort");
        Sorter currentSorter = bubbleSort;
        availableSorters.add(bubbleSort);
        availableSorters.add(insertionSort);
        availableSorters.add(selectionSort);
        int[] numbers = generator.generateDataArray(10000, 0, 100);
        while (isGoing) {
            System.out.println("Enter a number to make the following actions:");
            System.out.println("1 - Choose a sorting algorithm");
            System.out.println("2 - Execute a sorting operation");
            int selectionNumber = scanner.nextInt();
            switch (selectionNumber) {
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    sortingArray(currentSorter, numbers);
                    break;
            }
        }
    }

    public static void sortingArray(Sorter sorter, int[] array) {
        long start = System.currentTimeMillis();
        int[] sortedArray = sorter.sort(array);
        long end = System.currentTimeMillis();
        System.out.println(sorter.getName() + ": " + (end - start) + " ms");
    }
}
