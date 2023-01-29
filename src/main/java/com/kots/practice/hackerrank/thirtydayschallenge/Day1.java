/**
 * Data types challenge
 */

package com.kots.practice.hackerrank.thirtydayschallenge;

import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        int integerNumber = scan.nextInt();
        double doubleNumber = scan.nextDouble();
        String string = scan.nextLine() + scan.nextLine();
        scan.close();

        System.out.println(i + integerNumber);
        System.out.println(d + doubleNumber);
        System.out.println(s + string);
    }
}
