package com.kots.practice.javarush.threads.argument_hen_egg;

import static com.kots.practice.javarush.threads.argument_hen_egg.ThreadSampleArgumentHenEgg.argumentor;

public class ThreadSampleArgumentHenEgg2 {
    static Egg eggArgument;

    public static void main(String[] args) {
        eggArgument = new Egg();
        System.out.println("Argument is started.");
        eggArgument.start();
        argumentor("Hen!");

        if (eggArgument.isAlive()) {
            try {
                eggArgument.join();
            } catch (InterruptedException ignored) {}
            System.out.println("Egg won!");
        } else {
            System.out.println("Hen won!");
        }
        System.out.println("Argument is finished.");
    }
}
