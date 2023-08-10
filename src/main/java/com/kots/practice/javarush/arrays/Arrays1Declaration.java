package com.kots.practice.javarush.arrays;

/**
 * There are a few ways to declare and initialise an array.
 * Option 1. Literally no sugar.
 * type[] name = new type[] {value1, value2, value3};
 *
 * Option 2. Literally sugar.
 * type[] name = {value1, value2, value3};
 *
 * Option 3. Dynamic initialisation.
 * type[] name = new type[n];
 * where 'n' is an integer, showing the length of array. After this declaration we have to
 * initialise n elements of array in one way or another. E.g. using cycle.
 *
 * for (int i = 0; i < name.length; i++) {
 *     name[i] = i;
 * }
 *
 * We can also create multidimensional arrays.
 * type[][] name = {{value1, value2}, {value3}};
 */
public class Arrays1Declaration extends Arrays0Utils {

    int[] array1 = new int[] {1,2,3};
    int[] array2 = {1,2,3};
    int[] array3 = new int[3];
    int[][] array4 = {{1, 2}, {3}};

    public static void main(String[] args) {
        Arrays1Declaration task = new Arrays1Declaration();
        fillArrayWithDefaultIntegers(task.array3);

        printArray(task.array1);
        printArray(task.array2);
        printArray(task.array3);
        printArray(task.array4);
    }

}
