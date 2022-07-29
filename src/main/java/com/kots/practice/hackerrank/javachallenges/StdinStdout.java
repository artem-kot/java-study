/**
 * Stdin vs stdout challenge (standard input and standard output)
 *
 * Task
 * In this challenge, you must read 3 integers from stdin and then print them to stdout.
 * Each integer must be printed on a new line.
 * Input Format
 * There are  lines of input, and each line contains a single integer.
 *
 * Note
 * If you use the nextLine() method immediately following the nextInt() method,
 * recall that nextInt() reads integer tokens;
 * because of this, the last newline character for that line of integer input is
 * still queued in the input buffer and the next nextLine() will be reading the remainder
 * of the integer line (which is empty).
 */

package com.kots.practice.hackerrank.javachallenges;

import java.util.Scanner;

public class StdinStdout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        double number2 = scanner.nextDouble();
        String string = scanner.nextLine() + scanner.nextLine();

        System.out.println(number1 + "\n" + number2 + "\n" + string);
        scanner.close();
    }


}
