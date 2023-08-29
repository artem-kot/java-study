package com.kots.practice.codewars;

import org.junit.Test;

import static com.kots.practice.codewars.kyu7_ExesAndOhs.getXO;
import static org.junit.Assert.*;

public class kyu7_ExesAndOhsTest {

    @Test
    public void getXOTest() {
        assertFalse(getXO("xoOxo"));
        assertTrue(getXO(""));
        assertFalse(getXO("X"));
        assertFalse(getXO("o"));
    }
}