package com.kots.practice.codewars;

// https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c/train/java

/*
    We have an array of integers.
    Let's say, this one: {-2, 1, -3, 4, -1, 2, 1, -5, 4}
    We have to find the subarray of contagious array elements, which elements provide the maximum sum.
    How to do it?
    Well, the good thing is that we go from left to right.
    1.
    We take element arr[0] as the base element, add it to a new array and find the sum (=arr[0]).
    Then we iterate through array and add each next element to a new array to find out new sum.
    If the new sum number is bigger than the existing one, we save sum as the temporary result.

    2.
    We iterate through array and take the next element as the new base element. Create new array for it.
    Compare similarly to step 1.

    Corner cases:
    All arr elements are positive: return sum of the elements.
    All arr elements are negative: return 0.
    Array is empty: return 0.
     */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kyu5_MaximumSubarraySum {
    public static int sequence(int[] arr) {
        int max = 0;
        if (isArrayAllNegative(arr) || arr.length == 0) return 0;
        if (isArrayAllPositive(arr)) return getSumOfElements(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            int[] tempArr = new int[arr.length];
            tempArr[i] = arr[i];
            if (getSumOfElements(tempArr) > max) {
                max = getSumOfElements(tempArr);
            }

            for (int j = i + 1; j < arr.length; j++) {
                tempArr[j] = arr[j];
                if (getSumOfElements(tempArr) > max) {
                    max = getSumOfElements(tempArr);
                }
            }
        }
        return max;
    }

    private static int getSumOfElements(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    private static boolean isArrayAllNegative(int[] arr) {
        for (int i : arr) {
            if (i > 0) return false;
        }
        return true;
    }

    private static boolean isArrayAllPositive(int[] arr) {
        for (int i : arr) {
            if (i < 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isArrayAllNegative(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(isArrayAllNegative(new int[]{-2, -1, -3, -4, -1, -2, -1, -5, 0}));
        System.out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));

        System.out.println(sequence(new int[]{}));
        System.out.println(sequence(new int[]{-2, -1, -3, -4, -1, -2, -1, -5, 0}));
        System.out.println(sequence(new int[]{1,2,3,4,5,6,7,8,9}));
    }

}
