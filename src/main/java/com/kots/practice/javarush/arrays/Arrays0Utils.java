package com.kots.practice.javarush.arrays;

public class Arrays0Utils {

    static void fillArrayWithDefaultIntegers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
    }

    static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println();
    }

    static void printArray(int[][] array) {
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

    static int[] copyArray(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

}
