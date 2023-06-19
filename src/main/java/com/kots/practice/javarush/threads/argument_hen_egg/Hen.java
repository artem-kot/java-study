package com.kots.practice.javarush.threads.argument_hen_egg;

import static com.kots.practice.javarush.threads.argument_hen_egg.ThreadSampleArgumentHenEgg.argumentor;

public class Hen extends Thread {
    @Override
    public void run() {
        argumentor("Hen!");
    }
}
