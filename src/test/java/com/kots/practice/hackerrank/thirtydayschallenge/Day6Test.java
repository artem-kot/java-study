package com.kots.practice.hackerrank.thirtydayschallenge;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Day6Test {
    String inputString;
    String expectedOutputString;

    public Day6Test(String inputString, String expectedOutputString) {
        this.inputString = inputString;
        this.expectedOutputString = expectedOutputString;
    }

    @Parameterized.Parameters
    public static Object[] getTestData() {
        return new Object[][] {
            {"0123456789", "02468 13579"},
            {"This is sample input string", "Ti ssml nu tig hsi apeiptsrn"},
            {"WBee ralrien  giositn gs ethor  Bteeruleirn!!", "We are going to Berlin! Berlin ist sehr teuer!"}
        };
    }

    @Test
    public void day6Test() {
        Day6 sampleObject = new Day6();
        assertEquals(expectedOutputString, sampleObject.solution(inputString));
    }
}
