package com.kots.practice.javarush.arrays;

import java.util.Arrays;

/**
 * If you want to compare several arrays by the elements, you better use Arrays.equals(array1, array2, ... arrayN);
 * As usual, with multidimensional arrays we have to use Arrays.deepEquals();
 */

public class ArraysTask0515_ArraysEquals {
    public static void main(String[] args) {
        System.out.println("Task 0515");
        /**
         * Compare 2 multidimensional arrays.
         */
        int[][] arrayFirst = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] arraySecond = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(Arrays.deepEquals(arrayFirst, arraySecond));
    }
}
