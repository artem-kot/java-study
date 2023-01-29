package com.kots.practice.javarush.arrays;

import java.util.Arrays;

/**
 * Arrays.sort(array) will automatically sort array in ascending order.
 * Arrays.sort(array, start, end) will sort a cut of array from start to end (not including) index.
 */

public class ArraysTask0518_sort {
    public static void main(String[] args) {
        System.out.println("Task 1518");
        /**
         * Sort pre-defined array in ascending order.
         */
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
