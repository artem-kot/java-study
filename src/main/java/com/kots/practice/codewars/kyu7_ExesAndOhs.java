package com.kots.practice.codewars;

// https://www.codewars.com/kata/55908aad6620c066bc00002a/train/java
public class kyu7_ExesAndOhs {
    public static boolean getXO (String str) {
        int equaliser = 0;
        for (Character c : str.toCharArray()) {
            switch (c) {
                case 'x':
                case 'X':
                    equaliser++;
                    break;
                case 'o':
                case 'O':
                    equaliser--;
                    break;
            }
        }
        return equaliser == 0;
    }
}
