package com.kots.practice.javarush.collections.hashset;

/*
    Hashset - это класс для бедных. У него мало методов, должен быть дешёвым для перформанса.
    Есть статья на хабре. Говорят, действительно удобно для небольших множеств.
    Но так как у хэшсетов нет фиксированного размера, то они дороговаты для больших множеств.

    В целом, можно сказать, что
    List - упорядоченная коллекция с дубликатами.
    Set - неупорядоченная коллекция без дубликатов (все значения уникальны).
     */

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        /**
         * Есть 3 способа итерации по коллекциям и спискам.
         * 1 - через специальный объект итератор.
         * 2 - через стандартный цикл фор с порядковым итератором.
         * 3 - через цикл for-each. Под капотом у for-each на самом деле while с итератором, как в 1 способе.
         * Можно считать это синтаксическим сахаром.
         */
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Iterator<Integer> it2 = set.iterator();
        for (int i = 0; i < set.size(); i++) {
            System.out.println(it2.next());
        }

        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
