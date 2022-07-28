/**
 * Conditional statements challenge.
 * Task
 * Given an integer, n, perform the following conditional actions:
 *
 * If n is odd, print "Weird"
 * If n is even and in the inclusive range of 2 to 5, print "Not Weird"
 * If n is even and in the inclusive range of 6 to 20, print "Weird"
 * If n is even and greater than 20, print "Not Weird"
 * Complete the stub code provided in your editor to print whether or not n is weird.
 *
 * Input Format: A single line containing a positive integer, n, 1<=n<=100.
 * Output Format: Print "Weird" if the number is weird; otherwise, print "Not Weird".
 */

package com.kots.practice.hackerrank.javachallenges;

import java.util.Scanner;

public class IfElseChallenge {
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * The method is created explicitly for unit test of the provided solution,
     * which can be found in test/java/com.kots.practice.hackerrank.javachallenges/IfElseChallengeTest
     * @param n input parameter, which can be parameterized.
     * @return String with a result according to a task.
     */
    public static String challengeMethod(int n){
        if (n % 2 != 0 || n >= 6 && n <= 20){
            return "Weird";
        } else {
            return "Not Weird";
        }
    }

    public static void main(String[] args){
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println(challengeMethod(n));
        scanner.close();
    }
}
