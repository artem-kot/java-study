package com.kots.practice.codewars;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class kyu6_TwoSumTest {

    int[] numbers;
    int target;
    int[] expectedResult;

    public kyu6_TwoSumTest(int[] numbers, int target, int[] expectedResult) {
        this.numbers = numbers;
        this.target = target;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] testData() {
        return new Object[][] {
                {new int[] {0, 2, 3, 1}, 4, new int[] {2, 3}},
                {new int[] {-10, 3, 6, 0}, 9, new int[] {1, 2}}
        };
    }

    @Test
    public void kyu6_TwoSumTest() {
        assertTrue(Arrays.equals(expectedResult, kyu6_TwoSum.twoSum(numbers, target)));
    }
}