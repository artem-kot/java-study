package com.kots.practice.javarush.arrays;
import java.util.Arrays;

/**
 * Binary search works in 2 steps:
 * 1. Array is sorted in ascending order.
 * 2. Value we are searching for is compared to the middle of an array. If our value is larger, method searches in the
 * right half, otherwise, in the left half. It cuts a half in a half and repeats step 2 until the value is found.
 *
 * int index = Arrays.binarySearch(array, value);
 * Note: array in the brackets must already be SORTED.
 * Note: if there are several similar elements in the array, method will return only 1 index.
 * Note: if no matches found, index will be negative.
 *
 */

public class ArraysTask0519_binarySearch {
    public static void main(String[] args) {
        System.out.println("Task 1519");
        /**
         * Print out in the console "true" if element is found in the array and "false" if not.
         */
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int element = 5;
        int[] copy = Arrays.copyOf(array, array.length);
        Arrays.sort(copy);
        if(Arrays.binarySearch(copy, element) >= 0){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

}
