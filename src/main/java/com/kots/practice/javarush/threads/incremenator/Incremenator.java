package com.kots.practice.javarush.threads.incremenator;

public class Incremenator extends Thread {
    private volatile boolean mIsIncrement = true;

    public void changeAction() {
        mIsIncrement = !mIsIncrement;
    }

    @Override
    public void run() {
        do {
            if (!isInterrupted()) {
                if (mIsIncrement) {
                    Program.mValue++;
                } else {
                    Program.mValue--;
                }
                System.out.print(Program.mValue + " ");
            } else {
                return;
            }
            try {
                sleep(1000);
            } catch (InterruptedException ignored) {
                return;
            }
        } while (true);
    }
}
