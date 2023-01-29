package com.kots.practice.javarush.arrays;

import java.util.Scanner;

/**
 * Here we will work with Strings.
 * Please, note that when we are talking about String[] array, we're not talking about an array with actual string
 * values stored under indexes, because String variables are links to actual memory blocks with values.
 * So String[] array contains LINKS in form of String variables, which lead to actual memory blocks with string values.
 * That means that if we create String[] array with 2 String elements inside, each of which contains word "Java",
 * comparison via == operator will show a difference.
 * In other words, 2 similar values ("Java") are stored in 2 different memory blocks. And by comparing str[0] == str[1]
 * we compare not the values, but the links to memory blocks instead.
 * More: https://javarush.ru/quests/lectures/questsyntaxpro.level05.lecture03
 * <p>
 * If you want to compare the values, use equals() and equalsIgnoreCase() methods.
 */
public class ArraysTask0508_String {
    public static void main(String[] args) {
        System.out.println("Task 0508");
//        Provide 6 strings from the keyboard and then remove not unique ones. E.g. {"a", "b", "c", "d", "a", "a"} →
//        {null, "b", "c", "d", null, null}

        Scanner input = new Scanner(System.in);
        String[] array = new String[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextLine();
        }

        String[] arrayModified = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayModified[i] = array[i];
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equalsIgnoreCase(array[j])) {
                    arrayModified[j] = null;
                    arrayModified[i] = null;
                }
            }
        }

        for (int i = 0; i < arrayModified.length; i++) {
            System.out.println(arrayModified[i]);
        }

    }
}
