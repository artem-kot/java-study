/**
 * Day 5 challenge. Loops.
 *
 * Task
 * Given a string, S, of length N that is indexed from 0 to N-1, print its even-indexed and
 * odd-indexed characters as 2 space-separated strings on a single line.
 * Note: 0 is considered to be an even index.
 *
 * Example
 * s = "adbecf"
 * Print: abc def
 *
 * Input Format
 * The first line contains an integer, T (the number of test cases).
 * Each line i of the T subsequent lines contains a string, S.
 *
 * Constraints: 1<=T<=10; 2<=length of S <= 10 000
 * Output Format
 * For each String Sj (where 0<=j<=T-1), print Sj's even-indexed characters, followed by a space,
 * followed by Sj's odd-indexed characters.
 *
 * To bring String into set of character, you can use string.toCharArray method.
 * String string = "Some string";
 * char[] characterArray = string.toCharArray();
 */

package com.kots.practice.hackerrank.thirtydayschallenge;

import java.util.Scanner;

public class Day6 {

    public static String solution(String inputString) {
        String evenSequence = "";
        String oddSequence = "";

        char[] inputStringCharArray = inputString.toCharArray();
        for (int i = 0; i<inputString.length(); i++) {
            if (i%2==0) {
                evenSequence += inputStringCharArray[i];
            } else {
                oddSequence += inputStringCharArray[i];
            }
        }
        String outputString = evenSequence + " " + oddSequence;
        return outputString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        System.out.println(solution(string));
    }
}
