/**
 * Operators challenge
 *
 * Task
 * Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip),
 * and tax percent (the percentage of the meal price being added as tax) for a meal,
 * find and print the meal's total cost. Round the result to the nearest integer.
 *
 * Example
 * mealCost = 100
 * tipPercent = 15
 * taxPercent = 8
 * A tip of 15% * 100 = 15, and the taxes are 8% * 100 = 8. Print the value 123 and return from the function.
 *
 * Input Format
 * There are 3 lines of numeric input:
 * The first line has a double, mealCost (the cost of the meal before tax and tip).
 * The second line has an integer, tipPercent (the percentage of  being added as tip).
 * The third line has an integer, taxPercent (the percentage of  being added as tax).
 */

package com.kots.practice.hackerrank.thirtydayschallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day2 {
    public static int result(double mealCost, int tipPercent, int taxPercent) {
        double tip = mealCost * tipPercent / 100;
        double tax = mealCost * taxPercent / 100;
        return (int) Math.round(mealCost + tip + tax);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double mealCost = Double.parseDouble(bufferedReader.readLine().trim());
        int tipPercent = Integer.parseInt(bufferedReader.readLine().trim());
        int taxPercent = Integer.parseInt(bufferedReader.readLine().trim());

        System.out.println(Day2.result(mealCost, tipPercent, taxPercent));

        bufferedReader.close();
    }
}
