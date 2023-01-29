package com.kots.practice.javarush.bitwise;

/**
 * In the past it was very important to store as much information as possible using as little memory as possible.
 * To do so programmers played a lot with bitwise operations. Simple integer can represent a 32 bits of information.
 * Like a sequence of flags. To put a flag programmers changed value of a bit to "1". To remove one you set "0".
 * For example, we have a sequence:
 * 00010110
 * We want to set a flag to a 4th bit. Then we do OR operation for requested bit:
 * 00010110 | 00001000
 * <p>
 * If we want to remove 3rd bit of 00010110, we have to & it with a number, which has all "1" besides the bit 3.
 * 00010110 & 11111011
 * <p>
 * Finally, if we want to check whether some position has a flag, we have to compare 2 things.
 * 1 thing - this number & number, which has "0" everywhere besides requested bit.
 * 2 thing - number, which has "0" everywhere besides requested bit.
 * If comparison gives us true, flag is fine. If false, flag isn't present there.
 */

public class Flags {
    public static void main(String[] args) {
        Flags flags = new Flags();
        System.out.println(flags.checkFlag(17, 4));
        System.out.println(flags.setFlag(32, 6));
        System.out.println(flags.removeFlag(12, 3));
    }

    public int setFlag(int number, int flagPos) {
        number = number | (1 << flagPos);
        return number;
    }

    public int removeFlag(int number, int flagPos) {
        number = number & ~(1 << flagPos);
        return number;
    }

    public boolean checkFlag(int number, int flagPos) {
        return (number & (1 << flagPos)) == 1 << flagPos;
    }
}
