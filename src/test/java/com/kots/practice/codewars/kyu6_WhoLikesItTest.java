package com.kots.practice.codewars;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class kyu6_WhoLikesItTest {

    String[] names;
    String expectedResult;

    public kyu6_WhoLikesItTest(String[] names, String expectedResult) {
        this.names = names;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] testData() {
        return new Object[][] {
                {new String[]{}, "no one likes this"},
                {new String[]{"Peter"}, "Peter likes this"},
                {new String[]{"Jacob", "Alex"}, "Jacob and Alex like this"},
                {new String[]{"Max", "John", "Mark"}, "Max, John and Mark like this"},
                {new String[]{"Alex", "Jacob", "Mark", "Max"}, "Alex, Jacob and 2 others like this"}
        };
    }

    @Test
    public void whoLikesItTest() {
        assertEquals(expectedResult, kyu6_WhoLikesIt.whoLikesIt(names));
    }
}