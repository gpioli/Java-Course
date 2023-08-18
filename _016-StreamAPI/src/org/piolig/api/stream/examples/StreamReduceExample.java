package org.piolig.api.stream.examples;

import java.util.stream.Stream;

public class StreamReduceExample {
    public static void main(String[] args) {

        Stream<String> names = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia", "Paco Gonzalez", "Paco Gonzalez")
                .distinct();


        String finalResult = names.reduce("result concat: ", (a, b) -> a + " -> " + b);
        System.out.println(finalResult); // result concat:  -> Pato Guzman -> Paco Gonzalez -> Pepa Gutierrez -> Pepe Mena -> Pepe Garcia


    }
}
