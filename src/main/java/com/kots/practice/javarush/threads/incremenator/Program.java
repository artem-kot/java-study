package com.kots.practice.javarush.threads.incremenator;

import static java.lang.Thread.sleep;

public class Program {
    public static int mValue = 0;
    static Incremenator mInc;

    public static void main(String[] args) {
        mInc = new Incremenator();
        System.out.print("Value = ");
        mInc.start();
        for (int i = 0; i < 3; i++) {
            try {
                sleep(i * 2 * 1000);
            } catch (InterruptedException ignored) {
            }
            mInc.changeAction();
        }
        mInc.interrupt();
    }
}