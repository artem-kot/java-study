package com.kots.practice.javarush.collections.arraylist;

import org.apache.commons.lang3.RandomUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomArrayListTest {

    private CustomArrayList prepareTestData(int size) {
        CustomArrayList list = new CustomArrayList();
        for (int i = 0; i < size; i++) {
            list.add(RandomUtils.nextInt(0, 20));
        }
        return list;
    }

    @Test
    public void testCustomArrayWithDefaultCapacity() {
        CustomArrayList testList = prepareTestData(1);
        assertEquals(10, testList.capacity);
    }

    @Test
    public void testCustomArrayWithIncreasedCapacity() {
        CustomArrayList testList = prepareTestData(11);
        assertEquals(15, testList.capacity);
    }
}