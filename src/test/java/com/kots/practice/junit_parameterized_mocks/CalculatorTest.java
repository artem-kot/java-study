/**
 * Parameterized test for a simple calculator class
 */

package com.kots.practice.junit_parameterized_mocks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import io.qameta.allure.junit4.DisplayName;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CalculatorTest {
    private final int number1;
    private final int number2;
    private final int expected;

    public CalculatorTest(int number1, int number2, int expected) {
        this.number1 = number1;
        this.number2 = number2;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[] getTestData() {
        return new Object[][] {
                {-6,-1,-7},
                {-1,0,-1},
                {0,0,0},
                {-1,1,0},
                {-1,2,1},
                {1,1,2},
                {3,-2,1}
        };
    }
    @Test
    @DisplayName("Simple calculator test")
    public void calTest() {
        Calculator calculator = new Calculator();
        int actual = calculator.sum(number1, number2);
        assertEquals(expected, actual);
    }
}