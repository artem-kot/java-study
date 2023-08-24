package com.kots.practice.codewars;

// https://www.codewars.com/kata/54da539698b8a2ad76000228/solutions/java

public class kyu6_TenMinutesWalk {
    public static boolean isValid(char[] walk) {
        int n = 0;
        int e = 0;
        int s = 0;
        int w = 0;
        for (char direction : walk) {
            switch (direction) {
                case 'n':
                    s--;
                    n++;
                    break;
                case 's':
                    n--;
                    s++;
                    break;
                case 'e':
                    w--;
                    e++;
                    break;
                case 'w':
                    e--;
                    w++;
                    break;
            }
        }
        return walk.length == 10 && n == s && w == e && s == e && n == 0;
    }
}
