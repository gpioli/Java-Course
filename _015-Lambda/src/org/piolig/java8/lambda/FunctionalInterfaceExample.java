package org.piolig.java8.lambda;

import org.piolig.java8.lambda.arythmetic.Arythmetic;
import org.piolig.java8.lambda.arythmetic.Calculator;

public class FunctionalInterfaceExample {

    public static void main(String[] args) {

        Arythmetic sum = Double::sum; // (a, b) -> a + b
        Arythmetic rest = (a, b) -> a - b;

        Calculator cal = new Calculator();

        System.out.println(cal.compute(10, 5, sum));
        System.out.println(cal.compute(10, 5, rest));
        System.out.println(cal.compute(10, 5, (a, b) -> a * b )); // implementation "on the fly"

        System.out.println(cal.computeWithBiFunction(10, 5, (a, b) -> a * b));


    }

}
