package com.kots.practice.anghel_leonard_coding.strings_math;

/**
 * Task 1:
 * Write a program which calculates how many specific symbols does the string have.
 */

public class Problem1CountDuplicateSymbols {
    private final String string = "We're going to visit a Christian Löffler's concert";

    public int countSymbolsInString(String string, char symbol){
        int counter = 0;
        for (int i = 0; i < string.length(); i++){
            if(string.charAt(i) == symbol){
                counter++;
            }
        } return counter;
    }

    public static void main(String[] args) {
        Problem1CountDuplicateSymbols task = new Problem1CountDuplicateSymbols();
        int result = task.countSymbolsInString(task.string, '\'');
        System.out.println(result);
    }
}
