package com.kots.practice.javarush.arrays;

import java.util.Arrays;

/**
 * Arrays class and its methods.
 * Java creators soon figured out arrays are very often used by programmers, so they created a special class
 * with default methods to simplify this work. Class is called Arrays in java.util.Arrays.
 *
 * int[] array = {1, 2, 3};
 * String str = Arrays.toString(array);
 *
 * But if you have 2-dimensional array, this wouldn't work. You have to use Arrays.deepToString() method for it.
 *
 */

public class ArraysTask0513_14_toString_deepToString {
    public static void main(String[] args) {
        System.out.println("Task 0513");
        /**
         * print out 2 pre-defined arrays.
         */
        String[] stringArray = new String[]{"I", "love", "Java"};
        int[] numberArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(Arrays.toString(stringArray));
        System.out.println(Arrays.toString(numberArray));
        System.out.println();

        System.out.println("Task 0513");
        /**
         * print out 2 pre-defined 2-dimensional arrays.
         */
        String[][] strings = new String[][]{{"🙂", "🙂", "🙂", "🙂"}, {"🙃", "🙃", "🙃", "🙃"}, {"😋", "😋", "😋", "😋"}, {"😎", "😎", "😎", "😎"}};
        int[][] ints = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println(Arrays.deepToString(strings));
        System.out.println(Arrays.deepToString(ints));
    }
}
