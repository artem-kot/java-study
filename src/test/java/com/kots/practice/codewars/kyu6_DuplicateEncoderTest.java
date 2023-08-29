package com.kots.practice.codewars;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static com.kots.practice.codewars.kyu6_DuplicateEncoder.encode;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class kyu6_DuplicateEncoderTest {

    public String input;
    public String expectedResult;

    public kyu6_DuplicateEncoderTest (String input, String expectedResult) {
        this.input = input;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static String[][] parameters() {
        return new String[][] {
                {"test", ")(()"},
                {" ", "("},
                {"  ", "))"},
                {"abccba", "))))))"},
                {"gorgeous", "))()()(("}
        };
    }

    @Test
    public void encodeTest() {
        assertEquals(expectedResult, encode(input));
    }
}