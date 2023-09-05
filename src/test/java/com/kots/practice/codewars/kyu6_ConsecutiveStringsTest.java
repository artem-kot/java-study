package com.kots.practice.codewars;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class kyu6_ConsecutiveStringsTest {

    String[] strarr;
    int k;
    String expectedResult;

    public kyu6_ConsecutiveStringsTest(String[] strarr, int k, String expectedResult) {
        this.strarr = strarr;
        this.k = k;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] testData() {
        return new Object[][] {
            {new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2, "abigailtheta"},
                {new String[] {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1, "oocccffuucccjjjkkkjyyyeehh"},
                {new String[] {}, 3, ""},
                {new String[] {"itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv","vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2, "wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck"},
                {new String[] {"zone", "abigail", "theta", "form", "libe", "zas"}, -2, ""},
                {new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 3, "ixoyx3452zzzzzzzzzzzz"},
                {new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 15, ""},
                {new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 0, ""}
        };
    }

    @Test
    public void ConsecutiveStringsTest() {
        assertEquals(expectedResult, kyu6_ConsecutiveStrings.longestConsec(strarr, k));
    }

}