package com.kots.practice.codewars;

// https://www.codewars.com/kata/5266876b8f4bf2da9b000362/train/java
public class kyu6_WhoLikesIt {

    public static String whoLikesIt(String... names) {
        switch (names.length) {
            case 0:
                return "no one likes this";
            case 1:
                return names[0] + " likes this";
            case 2:
                return names[0] + " and " + names[1] + " like this";
            case 3:
                return names[0] + ", " + names[1] + " and " + names[2] + " like this";
            default:
                return names[0] + ", " + names[1] + " and " + (names.length-2) + " others like this";
        }
    }
}
