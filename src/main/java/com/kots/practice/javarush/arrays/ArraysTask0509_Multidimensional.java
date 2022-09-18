package com.kots.practice.javarush.arrays;

/**
 * Multidimensional arrays.
 * 2D arrays are present in Java as variables, which contain link to a memory block leading to container.
 * This container contains X variables with links to other containers.
 * Each such 2nd level container contains Y links to memory blocks with actual variables values.
 * Thus, we have Type[][] array = new Type[X][Y];
 * Or Type[][] array = {
 *     {x1y1, x1y2, x1y3, ... , xnyn},
 *     {x2y1, x2y2, x2y3, ... , xnyn}
 * };
 *
 * More here: https://javarush.ru/en/quests/lectures/questsyntaxpro.level05.lecture04
 *
 */

public class ArraysTask0509_Multidimensional {
    public static void main(String[] args) {
        System.out.println("Task 0509");
/**
 * You have to create a 10x10 multiplication table and print it in console like:
 * 1 2 3 4 ...
 * 2 4 6 8 ...
 * 3 6 9 12 ...
 * 4 8 12 16 ...
 */

        int[][] table = new int[10][10];

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                table[i][j] = (i+1)*(j+1);
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
