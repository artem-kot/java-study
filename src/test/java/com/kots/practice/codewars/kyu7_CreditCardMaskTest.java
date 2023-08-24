package com.kots.practice.codewars;

import org.junit.Test;

import static com.kots.practice.codewars.kyu7_CreditCardMask.maskify;
import static org.junit.Assert.*;

public class kyu7_CreditCardMaskTest {

    String str1 = "1";
    String str2 = "0001";
    String str3 = "abc0123";
    String str4 = "";


    @Test
    public void maskifyTest() {
        assertEquals(str1, maskify(str1));
        assertEquals(str2, maskify(str2));
        assertEquals("###0123", maskify(str3));
        assertEquals(str4, maskify(str4));
    }
}