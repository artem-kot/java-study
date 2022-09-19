package com.kots.practice.javarush.arrays;

/**
 * Multidimensional arrays again.
 * So, if we can create 2-dimensional, probably, we can create 3-, 4-, x-dimensional arrays as well?
 * Yes, we can.
 * E.g. Type[][][][] array = new Type[2][3][4][5];
 * Easy, right? Well, now try to work with it. Basically it's a container of containers of containers of containers
 * of containers of memory blocks storing values. I'd say we avoid anything that's deeper than 2 dimensional arrays.
 */

public class ArraysTask0512 {
    public static void main(String[] args) {
        System.out.println("Task 0512");
        /**
         * Print in the console pre-defined multiArray.
         */

        int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};
        for(int i = 0; i < multiArray.length; i++){
            for(int j = 0; j < multiArray[i].length; j++){
                for(int k = 0; k < multiArray[i][j].length; k++){
                    System.out.print(multiArray[i][j][k] + " ");
                }
            }
        }
    }
}
