package com.kots.practice.javarush.random;

/**
 * Math.random() method returns double in range 0.000...1 - 0.999...9
 * If you want an int, cast it explicitly. If you want to exclude 0, add +1 in the end.
 */
public class RandomBasics {
    public static void main(String[] args) {
        for(int i = 10; i > 0; i--){
            int number = (int) (Math.random() * 3);
//            System.out.println(number);
        }
        double number = Math.random();
//        System.out.println(number);
        System.out.println("Факт " + (int) (number*6000000) + ":\n");
    }
}
