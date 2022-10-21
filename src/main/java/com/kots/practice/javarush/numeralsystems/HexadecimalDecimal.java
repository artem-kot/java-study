package com.kots.practice.javarush.numeralsystems;

public class HexadecimalDecimal {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        String hexadecimalNumber = "";
        if(decimalNumber <= 0){
            return "";
        }
        while(decimalNumber != 0){
            hexadecimalNumber = HEX.charAt(decimalNumber % 16) + hexadecimalNumber;
            decimalNumber /= 16;
        }
        return hexadecimalNumber;
    }

    public static int toDecimal(String hexNumber) {
        int decimalNumber = 0;
        if(hexNumber == null || hexNumber.equals("")){
            return 0;
        }
        for (int i = 0; i < hexNumber.length(); i++){
            int index = HEX.indexOf(hexNumber.charAt(i));
            decimalNumber = decimalNumber * 16 + index;
        }
        return decimalNumber;
    }
}
