/**
 * Conditional statements challenge
 *
 * The task is the same as in IfElseChallenge under javachallenges package.
 */

package com.kots.practice.hackerrank.thirtydayschallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day3 {

    public static String conditionChecker(int n) {
        if (n % 2 != 0 || n >= 6 && n <= 20) {
            return "Weird";
        } else {
            return "Not Weird";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        System.out.println(conditionChecker(n));
        bufferedReader.close();
    }
}
