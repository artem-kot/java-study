package com.kots.practice.javarush.collections.arraylist;

import java.util.ArrayList;

/**
 * Arrays can't change their size. If you create String[] string = new String[10];
 * It will always contain 10 elements. This problem is solved with ArrayList objects.
 * In general this collection type made a lot of things much easier.
 *
 * Note: collections can't store primitives. So use wrapper classes instead. Integer instead of int, for instance.
 *
 */
public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println(numbers.size());
        numbers.add(17);
        System.out.println(numbers.size());
        System.out.println(numbers.get(0));
        numbers.add(32);
        System.out.println(numbers.size());
        numbers.set(0, 11);
        System.out.println(numbers.get(0)+" "+ numbers.get(1));
        System.out.println();
    }
}
