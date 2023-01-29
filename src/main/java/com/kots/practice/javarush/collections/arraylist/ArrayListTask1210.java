package com.kots.practice.javarush.collections.arraylist;

import java.util.ArrayList;

/**
 * Ты видишь рабочую программу, в которой массив int[] numbers заполняется числами в методе init(). Затем в методе reverse() происходит перестановка чисел в обратном порядке.
 * Твоя задача — переписать код так, чтобы вместо массива int[] numbers использовался список ArrayList<Integer> numbers.
 * Название методов и переменных не изменяй.
 * Методы main() и print() не принимают участие в проверке.
 * <p>
 * Требования:
 * •	Поле numbers должно быть типа ArrayList<Integer>.
 * •	Метод init() должен заполнять список numbers числами от 0 до 9.
 * •	Метод reverse() должен переставить значения списка numbers в обратном порядке.
 * MEDIUM
 */
public class ArrayListTask1210 {
    public static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        init();
        print();

        reverse();
        print();
    }

    public static void init() {
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
    }

    public static void reverse() {
        int n = numbers.size() - 1;
        for (int i = 0; i < numbers.size() / 2; i++) {
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(n));
            numbers.set(n, temp);
            n--;
        }
    }

    private static void print() {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
