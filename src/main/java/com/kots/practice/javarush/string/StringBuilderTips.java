package com.kots.practice.javarush.string;

/**
 * StringBuilder is a class which helps to turn immutable String objects into mutable ones.
 * StringBuilder string = new StringBuilder("String I want to change");
 * StringBuilder emptyString = new StringBuilder();
 * There are dozens of useful methods. Let's crank some of them.
 * .append(obj) translates object into a string and adds to an existing string.
 * .insert(int index, obj) translates object into a string and adds at a certain index to an existing string.
 * .replace(int start, int end, String str) substitutes range set by start and end with str String argument.
 * .deleteCharAt(int index) deletes indexed character.
 * .delete(int start, int end) removes all symbols between specified indexes.
 * .indexOf(String str, int index) searches for a str string.
 * .lastIndexOf(String str, int index) searches for a str substring from the end of initial string.
 * .charAt(int index) returns character at a certain index of the string.
 * .substring(int start, int end) returns substring from the range.
 * .reverse() returns reversed sequence of string characters.
 * .setCharAt(int index, char) substitutes character with an argument character.
 * .length() returns string's length.
 */

public class StringBuilderTips {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder("Hello");
        System.out.println(string);
        string.append("Tschüss");
        System.out.println(string);
        string.append(19);
        System.out.println(string);
        string.deleteCharAt(6);
        System.out.println(string);
        string.replace(4,8, "blabla");
        System.out.println(string);
    }
}
