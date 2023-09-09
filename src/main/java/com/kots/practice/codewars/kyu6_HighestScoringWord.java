package com.kots.practice.codewars;

// https://www.codewars.com/kata/57eb8fcdf670e99d9b000272/train/java

import java.util.Arrays;
import java.util.HashMap;

public class kyu6_HighestScoringWord {
    public static String high(String s) {
        var tempSum = 0;
        var tempWord = "";
        String[] words = s.toLowerCase().split("\\W");
        for (String word : words) {
            int sum = 0;
            for (int i : word.toCharArray()) {
                sum += i - 96;
            }
            if (sum > tempSum) {
                tempSum = sum;
                tempWord = word;
            }
        }
        return tempWord;
    }

    public static void main(String[] args) {
        System.out.println(high("Hello dear World! How have you been?"));
    }
}
