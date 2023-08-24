package com.kots.practice.codewars;

import java.util.Arrays;

// https://www.codewars.com/kata/54da5a58ea159efa38000836/train/java

public class kyu6_FindTheOddInt {
    public static int findIt(int[] a) {
        int odd = 0;
        Arrays.sort(a);
        for (int i : a) {
            for (int j : a) {
                if (i == j) {
                    odd++;
                }
            }
            if (odd % 2 != 0) {
                return i;
            }
        }
        return odd;
    }
}
