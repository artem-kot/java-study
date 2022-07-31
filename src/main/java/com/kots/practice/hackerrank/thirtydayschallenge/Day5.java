/**
 * Day 5 challenge. Loops.
 *
 * Task
 * Given an integer, n, print its first 10 multiples. Each multiple n*i (where 1<=i<=10)
 * should be printed on a new line in the form: n x i = result.
 *
 * Constraints
 * 2<=n<=20
 */

package com.kots.practice.hackerrank.thirtydayschallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day5 {
    public static void multipliersPrint(int n) {
        for (int i=1; i<11; i++) {
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine().trim());
        multipliersPrint(n);
        reader.close();
    }
}
