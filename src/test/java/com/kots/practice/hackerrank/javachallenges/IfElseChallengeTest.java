package com.kots.practice.hackerrank.javachallenges;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class IfElseChallengeTest {
    private final int n;
    private final String expectedResult;

    public IfElseChallengeTest(int n, String expectedResult){
        this.n = n;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[] getTestData(){
        return new Object[][] {
                {1, "Weird"},
                {3, "Weird"},
                {4, "Not Weird"},
                {6, "Weird"},
                {20, "Weird"},
                {21, "Weird"},
                {22, "Not Weird"},
                {98, "Not Weird"},
                {99, "Weird"},
                {100, "Not Weird"}
        };
    }

    @Test
    public void IfElseChallengeTest(){
        IfElseChallenge sampleObject = new IfElseChallenge();
        String actualResult = sampleObject.challengeMethod(n);
        assertEquals(expectedResult, actualResult);
    }

}