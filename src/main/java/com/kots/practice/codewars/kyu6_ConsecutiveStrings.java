package com.kots.practice.codewars;

// https://www.codewars.com/kata/56a5d994ac971f1ac500003e/train/java

public class kyu6_ConsecutiveStrings {
    public static String longestConsec(String[] strarr, int k) {
        String longest = "";
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i <= strarr.length-k; i++) {
            for (int j = 0; j < k; j++) {
                temp.append(strarr[i+j]);
            }
            if (temp.length() > longest.length()) {
                longest = temp.toString();
            }
            temp.delete(0, temp.length());
        }
        return longest;
    }

    public static void main(String[] args) {
        System.out.println(longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2));
        System.out.println(longestConsec(new String[] {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1));

    }
}
