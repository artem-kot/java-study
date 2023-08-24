package com.kots.practice.codewars;

// https://www.codewars.com/kata/5412509bd436bd33920011bc/solutions/java

public class kyu7_CreditCardMask {
    public static String maskify(String str) {
        return str.length() > 4 ? "#".repeat(str.length()-4) + str.substring(str.length()-4) : str;
    }
}
