package at.gasha.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private Sorter currentSorter;
    private List<Sorter> availableSorters = new ArrayList<>();

    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean isGoing = true;
        BubbleSort bubbleSort = new BubbleSort("BubbleSort");
        InsertionSort insertionSort = new InsertionSort("InsertionSort");
        SelectionSort selectionSort = new SelectionSort("SelectionSort");
        this.availableSorters.add(bubbleSort);
        this.availableSorters.add(insertionSort);
        this.availableSorters.add(selectionSort);
        this.currentSorter = bubbleSort;
        int[] numbers = DataGenerator.generateDataArray(10000, 0, 100);
        while (isGoing) {
            System.out.println("Enter a number to make the following actions:");
            System.out.println("1 - Choose a sorting algorithm");
            System.out.println("2 - Execute a sorting operation");
            System.out.println("3 - Add a sorting algorithm");
            int selectionNumber = scanner.nextInt();
            switch (selectionNumber) {
                case 1:
                    changeSorter();
                    break;
                case 2:
                    sortingArray(this.currentSorter, numbers);
                    break;
            }
        }
    }

    public void sortingArray(Sorter sorter, int[] array) {
        long start = System.currentTimeMillis();
        int[] sortedArray = sorter.sort(array);
        long end = System.currentTimeMillis();
        System.out.println(sorter.getName() + ": " + (end - start) + " ms");
    }

    public void changeSorter() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("You can choose between the following sorters:");
            for (int i = 0; i < this.availableSorters.size(); i++) {
                System.out.println((i + 1) + ": " + this.availableSorters.get(i).getName());
            }
            System.out.println("Please choose an algirithm by typing its index.");
            int selectionNumber = scanner.nextInt();
            if (selectionNumber < 1 || selectionNumber > this.availableSorters.size()) {
                System.out.println("The given index is not valid. Please try again.");
            } else {
                setCurrentSorter(this.availableSorters.get(selectionNumber - 1));
                System.out.println("Algorithm has been changed to Sorter #" + selectionNumber + " -"
                        + this.currentSorter.getName());
                break;
            }
        }
    }

    public Sorter getCurrentSorter() {
        return this.currentSorter;
    }

    public void setCurrentSorter(Sorter sorter) {
        this.currentSorter = sorter;
    }
}