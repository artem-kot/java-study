package com.kots.practice.javarush.collections.arraylist;

import org.apache.commons.lang3.RandomUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Bubble sorting using ArrayList.
*/

public class ArrayListTask1211 {

    private static ArrayList<Integer> numbers = new ArrayList<>();
    private ArrayList<Integer> fillListWith10RandomNumbers(){
        for(int i = 0; i < 10; i++) {
            numbers.add(i, RandomUtils.nextInt(0, 100));
        }
        return numbers;
    }

    private ArrayList<Integer> sort(ArrayList<Integer> source) {
        for (int i = 0; i < source.size(); i++) {
            for (int j = 0; j < source.size() - i - 1; j++) {
                if (source.get(j) > source.get(j+1)) {
                    int temp = source.get(j);
                    source.set(j, source.get(j+1));
                    source.set(j+1, temp);
                }
            }
        }
        return source;
    }


    public static void main(String[] args) {
        ArrayListTask1211 task = new ArrayListTask1211();
        task.fillListWith10RandomNumbers();
        System.out.println(Arrays.toString(task.numbers.toArray()));
        task.sort(numbers);
        System.out.println(Arrays.toString(task.numbers.toArray()));
    }
}
