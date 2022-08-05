package com.kots.practice.hackerrank.thirtydayschallenge;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class Day4Test {
    int age;
    String expectedAmIOldStatement;
    int expectedIncreasedAge;

    public Day4Test(int age, String expectedAmIOldStatement, int expectedIncreasedAge) {
        this.age = age;
        this.expectedAmIOldStatement = expectedAmIOldStatement;
        this.expectedIncreasedAge = expectedIncreasedAge;
    }

    @Parameterized.Parameters
    public static Object[] getTestData() {
        return new Object[][] {
                {-6, "You are young.", 1},
                {12, "You are young.", 13},
                {13, "You are a teenager.", 14},
                {18, "You are old.", 19}
        };
    }

    @Test
    public void day4Test() {
        Day4 person = new Day4(age);
        assertThat(expectedAmIOldStatement, equalTo(person.amIOld()));
        person.yearPasses();
        assertEquals(expectedIncreasedAge, person.getAge());
    }
}