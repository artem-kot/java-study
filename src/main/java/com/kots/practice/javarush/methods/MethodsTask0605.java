package com.kots.practice.javarush.methods;

import java.util.Arrays;

public class MethodsTask0605 {
    public static void main(String[] args) {
        System.out.println("Task 0605");
        /**
         * The goal is to reverse array in method reverseArray(int[] array).
         * Not just an output, but the actual order of the elements in it. Re-declare each element with a new value.
         */
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        int[] temp = Arrays.copyOf(array, array.length);
        for(int i = array.length-1; i >= 0; i--){
            temp[array.length-1-i] = array[i];
        }
        for(int i = 0; i < temp.length; i++){
            array[i] = temp[i];
        }
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
