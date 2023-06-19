package com.kots.practice.javarush.threads.argument_hen_egg;

public class Egg extends Thread {
    @Override
    public void run() {
        ThreadSampleArgumentHenEgg.argumentor("Egg!");
    }
}