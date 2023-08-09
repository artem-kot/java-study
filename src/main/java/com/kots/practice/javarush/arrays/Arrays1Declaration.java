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
public class Arrays1Declaration {

    int[] array1 = new int[] {1,2,3};
    int[] array2 = {1,2,3};
    int[] array3 = new int[3];
    int[][] array4 = {{1, 2}, {3}};
    private void fillArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
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

    private void printArray(int[][] array) {
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j != array[i].length-1 || i != array.length-1) {
                    System.out.print(array[i][j] + ", ");
                } else {
                    System.out.print(array[i][j]);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Arrays1Declaration task = new Arrays1Declaration();
        task.fillArray(task.array3);

        task.printArray(task.array1);
        task.printArray(task.array2);
        task.printArray(task.array3);
        task.printArray(task.array4);
    }

}
