package com.kots.practice.javarush.arrays;

public class ArraysTask0502_3 {
    public static void main(String[] args) {
        System.out.println("Playing around");
        //    to create an array you have to declare it
        int[] sampleArray = new int[10];
        sampleArray[3] = 1;
        int number = 11;

        for(int i=0; i<10; i++){
            sampleArray[i] = number+i;
        }
        System.out.print("| ");
        for(int j=0; j<10; j++){
            System.out.print(sampleArray[j] + " | ");
        }
        System.out.println();

//        task 0502: fill in string values "Odd" or "Even" into array based on the oddity of the element index.
        System.out.println("Task 0502");
        String[] oddityArray = new String[20];
        for(int i=0; i<oddityArray.length; i++){
            if(i % 2 == 0){
                oddityArray[i] = "Even";
            } else {
                oddityArray[i] = "Odd";
            }
        }
        System.out.print("Array: | ");
        for(int i = 0; i<oddityArray.length; i++){
            System.out.print(oddityArray[i] + " | ");
        }
        System.out.println();

//        task 0503: substitute even elements of an array with with an opposite modality number (e.g. 7 → -7)
        System.out.println("Task 0503");
        int[] array = new int[]{-1, 2, 3, -4, -5};

        System.out.print("Array: | ");
        for(int i=0; i<array.length;i++){
            System.out.print(array[i]+ " | ");
        }
        System.out.println();

        for(int i=0; i<array.length; i++){
            if(array[i] % 2 == 0){
                array[i]*=-1;
            }
        }

        System.out.print("Array: |");
        for(int i=0; i<array.length;i++){
            System.out.print(array[i]+ " | ");
        }
        System.out.println();
    }
}
