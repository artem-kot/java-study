package com.kots.practice.javarush.arrays;

import java.util.Arrays;

/**
 * Arrays.fill(array, value) will fill array with similar values.
 * Arrays.fill(array, startIndex, endIndex, value) will fill array from startIndex to endIndex (not including)
 * with similar values.
 * Attention! It works for 1-dimensional arrays ONLY.
 */

public class ArraysTask0516_17_fill_copyOf {
    public static void main(String[] args) {
        System.out.println("Task 0516");
        /**
         * Fill the arrays based on it's length.
         * If the length is an even number, fill the first half with valueStart values and the second half with valueEnd
         * values.
         * If the length is an odd number, fill the first bigger half with valueStart values and the rest wuth valueEnd.
         */

        int[] array = new int[20];
        int valueStart = 10;
        int valueEnd = 13;

        if (array.length % 2 == 0) {
            Arrays.fill(array, 0, array.length / 2, valueStart);
            Arrays.fill(array, array.length / 2, array.length, valueEnd);
        } else {
            Arrays.fill(array, 0, array.length / 2 + 1, valueStart);
            Arrays.fill(array, array.length / 2 + 1, array.length, valueEnd);
        }
        System.out.println(Arrays.toString(array));
        System.out.println();

        /**
         * We can create a copy of an array using Arrays.copyOf(array, length);
         * This creates new array of a specified length. If old array was bigger, out-of-the-length values will be
         * ignored. If it was smaller, redundant elements will contain default value.
         *
         * Another variation of this one is Arrays.copyOfRange(array, start, end);
         * This one will cut initial array from start to end index and will create a new one using this cut. Note, end
         * index can be out of the borders of the initial array. It's gonna be fine, trust me. Default values will be
         * added there.
         */
        System.out.println("Task 0517");
        /**
         * Cut initial sampleArray in 2 and add those into 2-dimensional array called "result".
         * If array.length is odd, bigger half should be added to the first subarray.
         */
        int[][] result = new int[2][];
        int[] sampleArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int half = sampleArray.length / 2;

        if (sampleArray.length % 2 == 0) {
            result[0] = Arrays.copyOfRange(sampleArray, 0, half);
            result[1] = Arrays.copyOfRange(sampleArray, half, sampleArray.length);
        } else {
            result[0] = Arrays.copyOfRange(sampleArray, 0, half + 1);
            result[1] = Arrays.copyOfRange(sampleArray, half + 1, sampleArray.length);
        }

        System.out.println(Arrays.deepToString(result));

    }
}

