package org.piolig.java8.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        Function<String,String> f1 = (param) -> "Hello, what's up " + param + "!?";

        String result = f1.apply("Gastón");
        System.out.println(result); // Hello, what's up Gastón!?

        Function<String, String> f2 = String::toUpperCase;
        System.out.println(f2.apply("gaston")); // Gaston

        BiFunction<String, String, String> f3 = (a,b) -> a.toUpperCase().concat(b.toUpperCase());
        String r2 = f3.apply("gaston", "milton");
        System.out.println(r2);

        BiFunction<String, String, Integer> f4 = String::compareTo; // (a,b) -> a.comparteTo(b);
        System.out.println(f4.apply("gaston", "gaston2")); // -1 (b > a)


        BiFunction<String, String, String> f5 = String::concat; // (a,b) -> a.concat(b);
        System.out.println(f5.apply("gaston", "pioli")); // gastonpioli

    }




}
