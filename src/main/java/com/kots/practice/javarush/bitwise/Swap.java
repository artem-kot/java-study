package com.kots.practice.javarush.bitwise;

/**
 * There is a classical task for all developers' job interviews to swap 2 variables.
 * We have several ways to solve this.
 */
public class Swap {
    public static void main(String[] args) {
        Swap swap = new Swap();
        System.out.println(swap.swapViaBuffer(7, 5));
        System.out.println(swap.swapViaArithmetic(16, 453));
        System.out.println(swap.swapBitwise(17, 1209));
    }

    /**
     * Solution 1. Buffer variable.
     * Simply create a temporary variable to store one of your variables as a buffer.
     * Then swap your input variables in 3 assignment operations.
     * Note! This is the most economic and cheap in terms of memory solution to this challenge.
     */
    public String swapViaBuffer(int a, int b) {
        System.out.println(a + ", " + b);
        int c = a;
        a = b;
        b = c;
        return a + ", " + b;
    }


    /**
     * Solution 2. Arithmetic way.
     * You can also use arithmetic. Adding and substracting or multiplying and dividing. Whatever suits you.
     * Note! This solution costs the most in terms of memory, because it involves many math and assignment operations.
     */
    public String swapViaArithmetic(int a, int b) {
        System.out.println(a + ", " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        return a + ", " + b;
    }

    /**
     * Solution 3. Bitwise way.
     * Via bitwise operations we can re-assign two numbers in 3 lines of code.
     * Sequence is simple, but it must not be used anywhere in production code, because of sequence points.
     * Sequence points mean some weird compiler magic. Sometimes some lines of code are executed not in the order
     * you expect them to be executed.
     * However, bitwise swap can be used to not only swap numbers, but any type of data.
     */
    public String swapBitwise(int a, int b) {
        System.out.println(a + ", " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        return a + ", " + b;
    }
}
