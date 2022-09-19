package com.kots.practice.javarush.arrays;

/**
 * Jagged arrays.
 * You don't have to always create "rectangular" arrays like Type[][] array = new Type[x][y], which will have x rows and y
 * columns (or in reverse).
 * You can also create jagged arrays by: Type[][] array = new Type[x][];
 * And then: Type[] subArray1 = new Type[y];
 * And then: Type[] subArray2 = new Type[z];
 * ...
 * And then: Type[] subArrayX = new Type[n];
 * To print it out, use length field.
 */

public class ArraysTask0510_Jagged {
    public static void main(String[] args) {
        System.out.println("Task 0510");
/**
 * create a triangular array, where each element's value equals sum of it's indexes, e.g. array[7][3] = 7+3 = 10,
 * array[3][1] = 3+1 = 4. Print it out for 10 rows:
 * 0
 * 1 2
 * 2 3 4
 * ...
 */

        int[][] array = new int[10][];

        for (int i = 0; i < 10; i++){
            array[i] = new int[i+1];
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = i+j;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
