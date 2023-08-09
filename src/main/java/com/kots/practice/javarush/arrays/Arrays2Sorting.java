package com.kots.practice.javarush.arrays;

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
public class Arrays2Sorting {

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

    private void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println();
    }

    private int[] copyArray(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    public static void main(String[] args) {
        Arrays2Sorting task = new Arrays2Sorting();
        task.printArray(task.array);
        task.printArray(task.bubbleSort(task.array));
        task.printArray(task.bubbleSortReverse(task.array));
    }

}
