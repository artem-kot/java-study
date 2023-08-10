package com.kots.practice.javarush.arrays;

import java.util.Date;

/**
 * There are several important operations we can do with the arrays.
 * Operation 2. Search.
 *
 * There are 2 most commonly mentioned search algorithms: linear and binary.
 * Linear suggests to compare elements of array with the target value. It can be used with unsorted
 * arrays.
 * Binary suggests to comare target element with the element in the middle of the sorted array.
 * If the target element is higher than the middle element, we take right half. Else - left half.
 */
public class Arrays3Search extends Arrays0Utils {

    int[] array = {-6, 17, 5, 0, 9, -1, 10};
    String success = "Number was found at index ";
    String failure = "Number was not found";

    private String linearSearch(int[] array, int number) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return success + i;
            }
        }
        return failure;
    }

    private String binarySearch(int[] array, int number) {
        Arrays2Sorting sorter = new Arrays2Sorting();
        array = sorter.bubbleSort(array);

        int left = 0;
        int right = array.length-1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == number) {
                return success + mid;
            } else if (array[mid] < number) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return failure;
    }


    public static void main(String[] args) {
        Arrays3Search task = new Arrays3Search();
        printArray(task.array);
        System.out.println(task.linearSearch(task.array, 6));
        System.out.println(task.linearSearch(task.array, 9));
        System.out.println();
        System.out.println(task.binarySearch(task.array, 6));
        System.out.println(task.binarySearch(task.array, 9));

    }

    /*
    Results show that sorting an array of 7 elements is faster with bubble sort.
     */

}
