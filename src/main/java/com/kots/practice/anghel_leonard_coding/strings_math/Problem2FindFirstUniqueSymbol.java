package com.kots.practice.anghel_leonard_coding.strings_math;

/**
 * Task 2:
 * Write a program which finds first unique symbol in the string (a symbol whoch doesn't repeat).
 */

public class Problem2FindFirstUniqueSymbol {

    private final String string = "We're going to visit a Christian Löffler's concert";
    private final String string2 = "Hello, home";

    public char firstUniqueSymbol(String string){
        String input = string.toLowerCase();
        char result = 0;
        for (int i = 0; i < input.length(); i++){ //TODO: continue fixing this method. Find the right algorithm.
            char symbol = string.charAt(i);
            for(int j = i+1; j < string.length(); j++){
                if (string.charAt(j) == symbol){
                    break;
                }
            } result = symbol;
        } return result;
    }


    public static void main(String[] args) {
        Problem2FindFirstUniqueSymbol task = new Problem2FindFirstUniqueSymbol();
        char result = task.firstUniqueSymbol(task.string2);
        System.out.println(result);
    }
}
