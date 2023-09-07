package com.kots.practice.codewars;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class kyu5_MaximumSubarraySumTest {

    int[] arr;
    int expectedResult;

    public kyu5_MaximumSubarraySumTest(int[] arr, int expectedResult) {
        this.arr = arr;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] testData() {
        return new Object[][] {
                {new int[] {}, 0},
                {new int[] {-3, -2, -1, 0}, 0},
                {new int[] {-1, 0, 1}, 1},
                {new int[] {-8, 4, -5, 9, 1}, 10},
                {new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, 45},
                {new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}, 6},
                {new int[] {-2, 1, -3, 4, -1, -2, 0, 1, -5, 7}, 7}
        };
    }

    @Test
    public void sequenceTest() {
        assertEquals(expectedResult, kyu5_MaximumSubarraySum.sequence(arr));
        assertEquals(expectedResult, kyu5_MaximumSubarraySum.sequence2(arr));
    }
}