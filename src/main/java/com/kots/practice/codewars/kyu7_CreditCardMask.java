package com.kots.practice.codewars;

public class kyu7_CreditCardMask {
    public static String maskify(String str) {
        return str.length() > 4 ? "#".repeat(str.length()-4) + str.substring(str.length()-4) : str;
    }
}
