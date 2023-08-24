package com.kots.practice.codewars;

import org.junit.Test;

import static com.kots.practice.codewars.kyu6_TenMinutesWalk.isValid;
import static org.junit.Assert.*;

public class kyu6_TenMinutesWalkTest {

    @Test
    public void isValidTest() {
        assertTrue(isValid(new char[] {'n', 'e', 'e', 'e', 's', 's', 'w', 'w', 'w', 'n'}));
        assertFalse(isValid(new char[] {'e', 'e', 'e', 'e', 's', 's', 'w', 'w', 'w', 'n'}));
        assertFalse(isValid(new char[] {'s'}));
    }
}