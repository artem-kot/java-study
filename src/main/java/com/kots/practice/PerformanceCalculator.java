package com.kots.practice;

import java.util.Date;

/**
 * This class contains a sample code to measure performance of different operations.
 */

public class PerformanceCalculator {

    public static long getMsDelayForOperation() {
        Date currentTime = new Date();

        /*
        some operation here
         */

        Date newTime = new Date();
        return newTime.getTime() - currentTime.getTime();
    }

    public static void main(String[] args) {
        System.out.println(getMsDelayForOperation());
    }
}
