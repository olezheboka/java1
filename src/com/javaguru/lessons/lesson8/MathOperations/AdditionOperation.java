package com.javaguru.lessons.lesson8.MathOperations;

public class AdditionOperation implements MathOperation {

    @Override
    public double compute(double a, double b) {
        return a + b;
    }
}
