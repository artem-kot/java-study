package com.kots.practice.codewars;

// https://www.codewars.com/kata/54b42f9314d9229fd6000d9c/train/java

public class kyu6_DuplicateEncoder {
    static String encode(String word) {
        StringBuilder result = new StringBuilder(word);
        for (int i = 0; i < word.length(); i++) {
            if (word.substring(0, i).contains(String.valueOf(word.charAt(i))) || word.substring(i+1).contains(String.valueOf(word.charAt(i)))) {
                result.replace(i, i + 1, ")");
            } else {
                result.replace(i, i + 1, "(");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(encode("mama"));
        System.out.println(encode("gorgeous"));
        System.out.println(encode("artem"));
        System.out.println(encode("philadelphia"));
    }
}
