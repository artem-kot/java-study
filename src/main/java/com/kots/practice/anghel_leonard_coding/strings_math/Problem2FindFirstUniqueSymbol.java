package com.kots.practice.anghel_leonard_coding.strings_math;

/**
 * Task 2:
 * Write a program which finds first unique symbol in the string (a symbol whoch doesn't repeat).
 */

public class Problem2FindFirstUniqueSymbol {

    private final String string = "We're going to visit a Christian Löffler's concert";

    public char firstUniqueSymbol(String string){
        String input = string.toLowerCase();
        for (int i = 0; i < input.length(); i++){
            if (isCharUnique(input, i)){
                return input.charAt(i);
            }
        }
        return 0;
    }

    public boolean isCharUnique(String input, int charIndex){
        for (int i = 0; i < input.length(); i++){
            if (i!=charIndex && input.charAt(charIndex) == input.charAt(i)){
                break;
            } else if (i!= charIndex && i == input.length()-1) {
                return true;
            }
        } return false;
    }

    public static void main(String[] args) {
        Problem2FindFirstUniqueSymbol task = new Problem2FindFirstUniqueSymbol();
        char result = task.firstUniqueSymbol(task.string);
        System.out.println(result);
    }
}
