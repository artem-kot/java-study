package com.kots.practice.javarush.methods;

public class MethodsTask0612 {
    public static void main(String[] args) {
        System.out.println("Task 0612");
        /**
         * Program should return square for each element of an array.
         */
        int[] array = {15,64,9,51,42};
        printSqrt(array);
    }

    public static void printSqrt(int[] array) {
        String phrase = "Корень квадратный для числа ";
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            double elementSqrt = Math.sqrt(element);
            System.out.println(phrase + element + " равен " + elementSqrt);
        }
    }
}
