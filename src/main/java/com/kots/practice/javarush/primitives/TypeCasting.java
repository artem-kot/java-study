package com.kots.practice.javarush.primitives;

/**
 * You can easily cast smaller types to bigger ones.
 * Byte to short to int to long to float to double.
 *
 * But when you have to do a reverse operation: cast something big to something small, you need to explicitly
 * use casting. We need to show to the compiler that we didn't mistake here. We REALLY want to cast
 * something big to something small. And we know that some data will be lost during such an operation.
 *
 * NOTE! Type char just like short is 2 bytes primitive type in a memory. But when you switch between those two,
 * you have to always explicitly cast it in the code. Because char has a range from 0 to 65535 and short -
 * -32768 to 32767
 *
 * If in one formula you have several different variable types, you always must firstly cast them all to the biggest
 * type. And only then do the math.
 *
 * NOTE! All operations with byte, short, and char types trigger automatic cast to int. Int is considered default
 * type for mathematical operations. So if you want to save the result in type smaller than int, explicitly cast it.
 * NOTE!! Explicit type casting has higher priority than math operations. So if you want math operation to go first,
 * curve the brackets.
 * e.g.:
 * byte a = 5;
 * byte b = 6;
 * byte c = (byte)(a * b);
 * otherwise, without brackets, type casting will be done for a variable leading to an error.
 *
 */


public class TypeCasting {

    void castingSmallToBig(){
        byte a = 121;
        short b = a;
        int c = a+b;
        long d = c+a+b;
        float e = d+c+b+a;
        double f = e+d+c+b+a;
    }

    public void castingBigToSmall(){
        double f = 1.02;
        float e = (float) f;
        long d = (long) e;
        int c = (int) d;
        short b = (short) c;
        byte a = (byte) b;
        System.out.println(f);
        System.out.println(e);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);
        System.out.println(a);
    }

    public static void main(String[] args) {
        TypeCasting types = new TypeCasting();
        types.castingBigToSmall();
    }
}
