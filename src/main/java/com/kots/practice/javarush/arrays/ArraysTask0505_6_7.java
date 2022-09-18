package com.kots.practice.javarush.arrays;

import java.util.Scanner;

public class ArraysTask0505_6_7 {
    public static void main(String[] args) {

//        System.out.println("Playing around");
////        code below allows to reverse user input of 10 integers
//        Scanner console = new Scanner(System.in);
//        int[] userInputArray = new int[10];
//        for(int i = 0; i < userInputArray.length; i++){
//            userInputArray[i] = console.nextInt();
//        }
//        System.out.println();
//
//        for(int i = userInputArray.length-1; i >= 0; i--){
//            System.out.print(userInputArray[i]);
//        }
//        System.out.println();

//        task 0505: catch integer N from user input, which defines how many integers will be put by user in console.
//        once N is caught, catch N user's integers. If N is odd, print numbers as they were put, otherwise, reverse.

        System.out.println("Task 0505");

        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int[] array;

        if(n > 0) {
            array = new int[n];
            for(int i = 0; i < n; i++){
                array[i] = console.nextInt();
            }
            System.out.println();
            if(n % 2 == 0) {
                for (int i = array.length - 1; i >= 0; i--) {
                    System.out.print(array[i] + " | ");
                }
                System.out.println();
            } else {
                for(int i = 0; i < array.length; i++){
                    System.out.print(array[i] + " | ");
                }
            }
        }

    }
}
