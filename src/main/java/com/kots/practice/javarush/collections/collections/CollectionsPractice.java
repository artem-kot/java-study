package com.kots.practice.javarush.collections.collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * java.util.Collections - специальный класс с большим количеством методов, которые помогают при работе
 * с коллекциями. По аналогии с java.util.Arrays.
 *
 * Полезные методы:
 * Collections.replaceAll(list, oldValue, newValue); replaces old values with new values in the list.
 * Collections.reverse(list); reverses the list.
 * Collections.sort(list); sorts the list in ascending order.
 * Collections.rotate(list, n); shifts all the elements for n positions.
 */

public class CollectionsPractice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 100, 20, 3);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        Collections.rotate(list, 1);

        System.out.println(list);

        Collections.shuffle(list);

        System.out.println(list);

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));

        list.add(17);
        list.add(0, 17);
        list.add(2, 17);

        System.out.println(list);

        Collections.replaceAll(list, 17, 100);

        System.out.println(list);

        System.out.println(Collections.frequency(list, 100));

        Collections.sort(list);

        System.out.println(Collections.binarySearch(list, 20));
    }

}
