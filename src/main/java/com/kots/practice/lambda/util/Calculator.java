package com.kots.practice.lambda.util;

public class Calculator {
    public int calculate(int a, int b, Operation operation) {
        return operation.perform(a, b);
    }
}
