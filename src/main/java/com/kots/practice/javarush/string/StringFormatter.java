package com.kots.practice.javarush.string;

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * A few useful methods to work with strings:
 * split("regex") applies regular expression argument to split string to an array of strings.
 * However, there is a whole class, which is intended to split strings into smaller pieces. It's called
 * StringTokenizer(string, separators). This class has 2 keys in constructor. 1 is a string. 2 is a set of
 * separators.
 * nextToken() will give you next piece of string from StringTokenizer.
 * hasMoreTokens() is a boolean method, which returns true if there is still some tokens left unseparated.
 * <p>
 * format() is a static method of the String class. It helps to set up a template of combining string with the data
 * String s = String.format("a=%d, b=%d, c=%d", 1, 4, 3); output: "a=1, b=4, c=3"
 * %s - string
 * %d - whole number (byte/short/int/long)
 * %f - float point number (float/double)
 * %b - boolean
 * %c - char
 * %t - Date
 * %% - percent symbol
 * <p>
 * Besides data type you can also mention data order using %1$d instead of %d. Where 1 - is an order.
 * String s = String.format("a=%3$d, b=%1$d, c=%2$d", 17, 6, 4); output: "a=4, b=17, c=6"
 * When you're doing an output to console, you can simply use System.out.printf("string", parameters) method.
 */

public class StringFormatter {
    public static void main(String[] args) {
        String string = "Wow! Wow! Wow!";
        String[] arrayOfStrings = string.split("[Ww]");
        System.out.println(Arrays.toString(arrayOfStrings));

        StringTokenizer tokenizer = new StringTokenizer(string, "!");
        while (tokenizer.hasMoreTokens()) {
            System.out.print(tokenizer.nextToken() + " and");
        }
        System.out.println();

        String phrase = "Hello, my name is %s. I am %d years old.";
        System.out.printf((phrase) + "%n", "Artem", 28);
    }
}
