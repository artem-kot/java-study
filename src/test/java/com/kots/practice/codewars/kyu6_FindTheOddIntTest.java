package com.kots.practice.codewars;

import org.junit.Test;

import static com.kots.practice.codewars.kyu6_FindTheOddInt.findIt;
import static org.junit.Assert.*;

public class kyu6_FindTheOddIntTest {

    @Test
    public void findItTest() {
        assertEquals(5, findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
        assertEquals(-1, findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
        assertEquals(5, findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
        assertEquals(10, findIt(new int[]{10}));
        assertEquals(10, findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
        assertEquals(1, findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
    }
}