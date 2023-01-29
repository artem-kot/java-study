package com.kots.practice.javarush.collections.arraylist;

import java.util.Arrays;

/**
 * A bit of theory: once declared, ArrayList by default has size = 10. However, once we add element #10 (in other
 * words, once we filled the last empty slot of ArrayList), it's potential size (capacity) is automatically increased.
 * It's done via creating a new ArrayList object with capacity = 1.5 of the previous one (e.g. 10 -> 15).
 * This task is intended to visualize it better.
 * <p>
 * We have to create CustomArrayList class with add() method, which implements logic described above.
 */


public class CustomArrayList {
    int size;
    int capacity;
    Integer[] array;

    public CustomArrayList() {
        size = 0;
        capacity = 10;
        array = new Integer[capacity];
    }

    public void add(int number) {
        if (size == capacity) {
            grow();
        }
        array[size] = number;
        size++;
    }

    public void add(int index, int number) {
        if (size == capacity) {
            grow();
        }
        array = Arrays.copyOf(array, size + 1);
        Integer[] temp = Arrays.copyOfRange(array, index, array.length);
        for (int i = index; i < array.length - 1; i++) {
            array[i+1] = temp[i - index];
        }
        array[index] = number;
        size++;
    }

    private void grow() {
        capacity += capacity / 2;
        array = Arrays.copyOf(array, capacity);
    }
}