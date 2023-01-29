package com.kots.practice.javarush.numeralsystems;

public class BinaryDecimal {
    public static void main(String[] args) {
        int decimalNumber = 54;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "110111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        if (decimalNumber <= 0) {
            return "";
        }
        String binaryNumber = "";
        while (decimalNumber != 0) {
            binaryNumber = decimalNumber % 2 + binaryNumber;
            decimalNumber /= 2;
        }
        return binaryNumber;
    }

    public static int toDecimal(String binaryNumber) {
        int decimalNumber = 0;
        if (binaryNumber == null || binaryNumber.equals("")) {
            return decimalNumber;
        }
        int biDigit = 0;
        for (int i = 0; i < binaryNumber.length(); i++) {
            biDigit = Character.getNumericValue(binaryNumber.charAt(binaryNumber.length() - i - 1));
            decimalNumber = (int) (decimalNumber + biDigit * Math.pow(2, i));
        }
        return decimalNumber;
    }
}
