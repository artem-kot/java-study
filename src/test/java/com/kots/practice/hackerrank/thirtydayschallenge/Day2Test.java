package com.kots.practice.hackerrank.thirtydayschallenge;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Day2Test {
    double mealCost;
    int tipPercent;
    int taxPercent;
    int expectedResult;

    public Day2Test(double mealCost, int tipPercent, int taxPercent, int expectedResult) {
        this.mealCost = mealCost;
        this.tipPercent = tipPercent;
        this.taxPercent = taxPercent;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[] getTestData() {
        return new Object[][]{
                {0, 13, 13, 0},
                {1, 13, 23, 1},
                {100, 5, 13, 118},
                {14.56, 13, 13, 18},
                {17.76, 14, 14, 23}
        };
    }

    @Test
    public void result() {
        Day2 sampleObject = new Day2();
        int actualResult = sampleObject.result(mealCost, tipPercent, taxPercent);
        assertEquals(expectedResult, actualResult);
    }
}