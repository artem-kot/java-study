package com.kots.practice.javarush.threads.argument_hen_egg;

import static java.lang.Thread.sleep;

public class ThreadSampleArgumentHenEgg {
    public static void argumentor(String argument) {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(argument);
        }
    }

    static Egg eggArgument;
    static Hen henArgument;

    public static void main(String[] args) throws InterruptedException {
        henArgument = new Hen();
        eggArgument = new Egg();

        System.out.println("Argument is started");
        eggArgument.start();
        henArgument.start();

        sleep(4000);
        while (henArgument.isAlive() && eggArgument.isAlive()) {
            sleep(1000);
        }
        if (henArgument.isAlive()){
            try {
                henArgument.join();
                System.out.println("Hen won!");
            } catch (InterruptedException ignored) {}
        } else if (eggArgument.isAlive()) {
            try {
                eggArgument.join();
                System.out.println("Egg won!");
            } catch (InterruptedException ignored) {}
        } else {
            System.out.println("The last one wins.");
        }
        System.out.println("Argument is finished!");
    }
}
