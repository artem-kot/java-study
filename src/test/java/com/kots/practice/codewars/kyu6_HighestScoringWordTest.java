package com.kots.practice.codewars;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class kyu6_HighestScoringWordTest {

    String input;
    String er;

    public kyu6_HighestScoringWordTest(String input, String er) {
        this.input = input;
        this.er = er;
    }

    @Parameterized.Parameters
    public static Object[][] testData() {
        return new Object[][] {
                {"Man, i need a taxi up to Ubud", "taxi"},
                {"What time are we climbing up to the volcano?", "volcano"},
                {"Take me to Semynak", "semynak"}
        };
    }

    @Test
    public void highTest() {
        assertEquals(er, kyu6_HighestScoringWord.high(input));
    }
}