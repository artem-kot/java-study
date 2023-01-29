package com.kots.practice.javarush.primitives;

public class Primitives {
    public static void main(String[] args) {
        Primitives p = new Primitives();
//        p.infinityAndBeyond();
        p.characterFun();
    }

    public void primitiveTypes() {
        byte byteMin = -128;
        byte byteMax = 127;
        short shortMin = -32768;
        short shortMax = 32767;
        int intMin = -2147483648;
        int intMax = 2147483647;
        long longMin = -9223372036854775808L;
        long longMax = 9223372036854775807L;

        float valueF = (float) 1.17;
        double valueD = 1.912393E+6;

        boolean valueBt = true;
        char letterA = 'A';
    }

    public void infinityAndBeyond() {
        System.out.println(1.0 / 0.0); // Infinity
        System.out.println(-1.0 / 0.0); //-Infinity
        System.out.println(0.0 / 0.0); // NaN
        System.out.println(-0.0 / 0.0); // NaN
    }

    public void characterFun() {
        char charMin = 0;
        char charMax = 65535;
        System.out.println(charMin);
        System.out.println(charMax);

        char characterA1 = 'A';
        char characterA2 = 65; // code for latin A is 65
        char characterA3 = 0 * 41; // 65 = 41 in hexadecimal system
        char characterA4 = 0 * 0041; // still 41 in hexadecimal, additional zeroes change nothing
        char characterA5 = '\u0041'; // unicode code of A symbol
    }
}
