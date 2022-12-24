package com.kots.practice.javarush;

public class PlayaroundClass {
    public static void main(String[] args) {
        int multiplier = (int) (1 + Math.random() * 1000);
        System.out.println("Факт " + (int) ((1 + Math.random()) * multiplier) + ":\n");
    }
}
