package com.kots.practice.javarush.numeralsystems;

import java.util.Arrays;

public class BinaryHexadecimal {
    public final char[] HEX = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public final String[] BIHEX =
            {"0000", "0001", "0010", "0011",
                    "0100", "0101", "0110", "0111",
                    "1000", "1001", "1010", "1011",
                    "1100", "1101", "1110", "1111"};

    public static void main(String[] args) {
        BinaryHexadecimal converter = new BinaryHexadecimal();

        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + converter.toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + converter.toBinary(hexNumber));
    }

    /**
     * We have to:
     * 1. Validate input.
     * If it's null / empty / out of range string, we should return empty string.
     *  1.1 How to validate whether some symbols of the string are out of the range for hexadecimal numeric system?
     *  Let's create an array of its symbols and use array methods.
     * 2. Deal with bi-to-hex first.
     *  2.1 check the line length and add number of zeroes to make the length a multiple of four.
     *  2.2 Check each 4 symbols and align them by index with HEX array.
     */

    public String adjustBiString(String binaryNumber){
        for(int i = 0; i < binaryNumber.length() % 4; i++){
            binaryNumber = "0" + binaryNumber;
        } return binaryNumber;
    }

    public String convertToHex(String binaryNumber){
        String hexNumber = "";
        for(int i = 0; i < binaryNumber.length(); i+=4){
            String digit = binaryNumber.substring(i, i+4);
            hexNumber += String.valueOf(HEX[Arrays.binarySearch(BIHEX, digit)]);
        } return hexNumber;
    }

    public String convertToBinary(String hexNumber){
        String binaryNumber = "";
        for(int i = 0; i < hexNumber.length(); i++){
            binaryNumber += BIHEX[Arrays.binarySearch(HEX, hexNumber.charAt(i))];
        } return binaryNumber;
    }

    public boolean isHexValid(String number){
        boolean numberValidity = true;
        if(number == null || number.equals("")){
            numberValidity = false;
        } else {
            boolean digitValidity = false;
            for(int i = 0; i < number.length(); i++){
                int validityCounter = 0;
                for (char c : HEX) {
                    if (number.charAt(i) == c) {
                        digitValidity = true;
                        validityCounter++;
                    }
                }
                if(validityCounter == 0){
                    numberValidity = false;
                }
            }
        } return numberValidity;
    }

    public boolean isBinaryValid(String number){
        boolean numberValidity = true;
        if(number == null || number.equals("")){
            numberValidity = false;
        } else {
            for(int i = 0; i < number.length(); i++){
                if(number.charAt(i) != '0' && number.charAt(i) != '1'){
                    numberValidity = false;
                }
            }
        } return numberValidity;
    }

    public String toHex(String binaryNumber) {
        if(isBinaryValid(binaryNumber)){
            return convertToHex(adjustBiString(binaryNumber));
        } else {
            return "";
        }
    }

    public String toBinary(String hexNumber) {
        if(isHexValid(hexNumber)){
            return convertToBinary(hexNumber);
        } else {
            return "";
        }
    }
}
