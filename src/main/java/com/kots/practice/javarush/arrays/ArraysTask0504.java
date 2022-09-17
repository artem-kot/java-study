package com.kots.practice.javarush.arrays;

import com.google.gson.internal.bind.util.ISO8601Utils;

public class ArraysTask0504 {
    public static void main(String[] args) {
        System.out.println("Playing around");
//        Please, note that array can be assigned to another array's values. This doesn't create a new array. You just
//        have 2 memory blocks which are linked to the same array of values. Check example below.
        int[] a = new int[5];
        a[0] = 2;
        a[4] = 7;
        int[] b = a;

        System.out.println(b[0]); // expected 2
        a[3] = b[4] + a[4];
        System.out.println(b[3]); // expected 14 even though we didn't declare this value for array b. Only for a.

        //    task 0504: combine 2 arrays into a new one.
        System.out.println("Task 0504");
        int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        int[] resultArray;

        resultArray = new int[firstArray.length + secondArray.length];

        for(int i=0; i<firstArray.length+secondArray.length; i++){
            if(i < firstArray.length){
                resultArray[i] = firstArray[i];
            } else {
                resultArray[i] = secondArray[i-firstArray.length];
            }
        }

        System.out.print("| ");
        for(int i=0; i<resultArray.length; i++){
            System.out.print(resultArray[i] + " | ");
        }
        System.out.println();
    }


}
