package com.kots.practice.javarush.arrays;

import java.util.Scanner;

public class ArraysTask0511 {
    public static void main(String[] args) {
        System.out.println("Task 0511");
        /**
         * Read integer N from user input.
         * Read N integers more (X1, X2, ... Xn). Based on user input create a 2-dimensional array[N][Xn].
         * Note: X depends on the user input. Each new integer provided by user defines number of elements in array[N].
         * e.g. If user provides N as 6, create array[6][]. Then array[0] = subArray[X1], array[1] = subArray[X2]...
         * etc.
         */


        Scanner input = new Scanner(System.in);
        int[][] multiArray = new int[input.nextInt()][];
        for (int i = 0; i < multiArray.length; i++) {
            multiArray[i] = new int[input.nextInt()];
        }
    }
}