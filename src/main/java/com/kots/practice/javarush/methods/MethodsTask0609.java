package com.kots.practice.javarush.methods;

public class MethodsTask0609 {
    public static void main(String[] args) {
        System.out.println("Task 0609");
        /**
         * Create a method which will return 9th mathematical degree of a long number.
         */
        System.out.println(cube(2));
        System.out.println(ninthDegree(2));
        System.out.println(stepen(2, 9));

    }

    public static long cube(long a) {
        return a * a * a;
    }

    public static long ninthDegree(long a) {
        return cube(cube(a));
    }

    public static long stepen(long a, int degree) {
        long b = a;
        for (int i = 1; i < degree; i++) {
            b = b * a;
        }
        return b;
    }
}
