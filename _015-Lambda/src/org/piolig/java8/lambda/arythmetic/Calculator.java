package org.piolig.java8.lambda.arythmetic;

import java.util.function.BiFunction;

public class Calculator {

    public double compute(double a, double b, Arythmetic lambda) {
        return lambda.operation(a, b);
    }

    public double computeWithBiFunction(double a, double b, BiFunction<Double, Double, Double> lambda) {
        return lambda.apply(a, b);
    }

}
