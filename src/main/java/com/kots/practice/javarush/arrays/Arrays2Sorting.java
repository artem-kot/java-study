package com.kots.practice.javarush.arrays;

import java.util.Date;

/**
 * There are several important operations we can do with the arrays.
 * Operation 1. Sorting.
 *
 * There are many different algorithms to sort an array of elements.
 * Among others you can name:
 * Selection Sort, Bubble Sort, Insertion Sort, Merge Sort, Quick Sort, Heap Sort, Counting Sort,
 * Radix Sort, Bucket Sort, Bingo Sort Algorithm, ShellSort, TimSort, Comb Sort, Pigeonhole Sort,
 * Cycle Sort, Cocktail Sort, Strand Sort, Bitonic Sort, Pancake sorting, BogoSort or Permutation Sort,
 * Gnome Sort, Sleep Sort – The King of Laziness, Stooge Sort, Tag Sort (To get both sorted and original),
 * Tree Sort, Odd-Even Sort / Brick Sort, 3-way Merge Sort.
 *
 * The most popular ones are:
 * Quick Sort
 * Merge Sort
 * Heap Sort
 */
public class Arrays2Sorting extends Arrays0Utils {

    int[] array = {-6, 17, 5, 0, 9, -1, 10};


    /*
    We start with one of the easiest to implement.
     */
    private int[] bubbleSort (int[] arr) {
        var array = copyArray(arr);
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    var temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    private int[] bubbleSortReverse (int[] arr) {
        var array = copyArray(arr);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j+1] > array[j]) {
                    var temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }


    /*
    Now one of the most popular ones: quick sort.
     */

    private int[] quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = quickSortPartition(array, low, high);
            quickSort(array, low, pivotIndex-1);
            quickSort(array, pivotIndex+1, high);
        }
        return array;
    }

    private int quickSortPartition(int[] array, int low, int high){
        int pivot = array[high];
        int i = low-1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                var temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        var temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
        return i+1;
    }

    public static void main(String[] args) {
        Arrays2Sorting task = new Arrays2Sorting();
        printArray(task.array);
        printArray(task.bubbleSort(task.array));
        printArray(task.bubbleSortReverse(task.array));

        printArray(task.array);
        var array = copyArray(task.array);
        printArray(task.quickSort(array, 0, array.length-1));

        /*
        Let's measure time for execution of each algorithm.
         */

        Date currentTime = new Date();

        /*
        some operation here
         */

        System.out.println("Starting bubble sort");
        Date start = new Date();
        task.bubbleSort(task.array);
        System.out.println("Completed in: " + (start.getTime() - currentTime.getTime()));

        var array2 = copyArray(task.array);
        System.out.println("Starting quick sort");
        start = new Date();
        task.quickSort(array2, 0, array2.length-1);
        System.out.println("Completed in: " + (start.getTime() - currentTime.getTime()));
    }

    /*
    Results show that sorting an array of 7 elements is faster with bubble sort.
     */

}
