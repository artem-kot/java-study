package com.kots.practice.javarush.collections.arraylist;

import org.apache.commons.lang3.RandomUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class ArrayListTask1211Test {

    private static final ArrayList<Integer> numbers = new ArrayList<>();

    private ArrayList<Integer> getTestData() {
        for (int i = 0; i < 10; i++) {
            numbers.add(i, RandomUtils.nextInt(0, 100));
        }
        numbers.set(RandomUtils.nextInt(1, 11), -100);
        System.out.println("Set negative number at position " + numbers.indexOf(-100));
        return numbers;
    }

    @Test
    public void bubbleSortingTest() {
        ArrayListTask1211 task = new ArrayListTask1211();
        Assertions.assertEquals(-100, task.sort(getTestData()).get(0));
    }
}