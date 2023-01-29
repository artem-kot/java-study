/**
 * Task is to format input of String and integer into 2 columns of String lying in first 15 characters
 * And integer to fit in 3 digits (preceed numbers with zeroes, if there are less than 3 digits).
 * Information can be found here: https://www.baeldung.com/java-printstream-printf
 */

package com.kots.practice.hackerrank.javachallenges;

import java.util.Scanner;

public class PrintfOutputFormatiing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String string = scanner.next();
            int number = scanner.nextInt();
            System.out.printf("%-15s", string);
            String numberFormatted = String.format("%03d", number);
            System.out.println(numberFormatted);
        }
        System.out.println("================================");
    }
}
