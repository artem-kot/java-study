package com.kots.practice.javarush.collections.arraylist;

import java.util.ArrayList;

/**
 * Bubble sorting using ArrayList.
 */

public class ArrayListTask1211 {
    public ArrayList<Integer> sort(ArrayList<Integer> source) {
        for (int i = 0; i < source.size(); i++) {
            for (int j = 0; j < source.size() - i - 1; j++) {
                if (source.get(j) > source.get(j + 1)) {
                    int temp = source.get(j);
                    source.set(j, source.get(j + 1));
                    source.set(j + 1, temp);
                }
            }
        }
        return source;
    }
}
