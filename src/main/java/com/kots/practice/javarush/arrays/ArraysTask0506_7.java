package com.kots.practice.javarush.arrays;

import java.util.Scanner;

public class ArraysTask0506_7 {
    public static void main(String[] args) {
//        task 0506 and 0507: get integer N from user input, which defines how many numbers will be added. From the N
//        numbers return minimum and maximum ones.

        System.out.println("Task 0506");


        Scanner console = new Scanner(System.in);
        System.out.println("How many numbers do you want to check?");
        int n = console.nextInt();

        if(n > 0){
            int[] array = new int[n];

            System.out.println("Please, enter " + n + " numbers. Hit enter after each one.");
            for(int i = 0; i < array.length; i++){
                array[i] = console.nextInt();
            }

            int min = array[0];
            int max = array[0];

            for(int i = 0; i < array.length; i++){
                if(min > array[i]){
                    min = array[i];
                } else if(max < array[i]){
                    max = array[i];
                }
            }
            System.out.println("Minimum number: " + min);
            System.out.println("Maximum number: " + max);
        } else {
            System.out.println("You've probably mistaken. Program will end.");
        }
    }
}
