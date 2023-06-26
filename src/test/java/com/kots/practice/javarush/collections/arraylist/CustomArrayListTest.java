package com.kots.practice.javarush.collections.arraylist;

import org.apache.commons.lang3.RandomUtils;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomArrayListTest {

    public static CustomArrayList testList;

    private CustomArrayList prepareTestData(int size) {
        CustomArrayList list = new CustomArrayList();
        for (int i = 0; i < size; i++) {
            list.add(RandomUtils.nextInt(0, 20));
        }
        return list;
    }

    @Test
    public void testCustomArrayWithDefaultCapacity() {
        testList = prepareTestData(1);
        assertEquals(10, testList.capacity);
    }

    @Test
    public void testCustomArrayWithIncreasedCapacity() {
        testList = prepareTestData(11);
        assertEquals(15, testList.capacity);
    }

    @Test
    public void testCustomArrayWithIndexedAdd() {
        testList = prepareTestData(10);
        System.out.println(Arrays.toString(testList.array));
        testList.add(5, -1);
        System.out.println(Arrays.toString(testList.array));
        assertEquals(11, testList.size);
        assertEquals(-1, testList.array[5]);
    }
}