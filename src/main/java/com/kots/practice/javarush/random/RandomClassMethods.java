package com.kots.practice.javarush.random;
import  java.util.Random;

/**
 * There is an awesome class called Random, which contains a set of awesome methods.
 * .nextDouble() returns random double in range 0.0-0.1 not including.
 * .nextFloat() does the same, but type will be "float".
 * .nextInt(int max) returns random integer in range 0 - max.
 * .nextInt() returns random integer in range of all possible integers (-2147483648-2147483647).
 * .nextLong() does the same as previous one but for long numbers range.
 * .nextBoolean() returns random false or true value.
 * .nextBytes(byte[] data) doesn't return anything, but fills argument array data with random byte values.
 * .nextGuassian() returns same as .nextDouble(), but according to a normal distribution rule. Number near 0.5 will
 * appear more frequently.
 *
 */
public class RandomClassMethods {
    public static void main(String[] args) {
        //let's return random numbers from range 25-50.
        for(int i = 100; i > 0; i--){
            Random r = new Random();
            int number = r.nextInt(26)+25;
            if(number <= 25 || number >= 50){
                System.out.println(number);
            }
        }
    }
}
