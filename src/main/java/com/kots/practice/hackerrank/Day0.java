package com.kots.practice.hackerrank;

import java.util.Scanner;

/**
 * Stdin for Hello, World!
 */

public class Day0 {
    /**
     * In the example below we create scanner to read input from stdin.
     * Then we store this input in a separate variable.
     * Then we close scanner as no other inputs are expected to be received.
     * And printing the results in console.
     * @param args
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        scanner.close();
        System.out.println("Hello, World!");
        System.out.println(inputString);
    }


}
