package org.piolig.api.stream.examples;

import java.util.stream.Stream;

public class StreamDistinctExample {
    public static void main(String[] args) {

        // First way of creating a Stream (using interfaces)
        Stream<String> names = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia", "Paco Gonzalez", "Paco Gonzalez")
                .distinct();

        names.forEach(System.out::println); /* Pato Guzman
                                                Paco Gonzalez
                                                Pepa Gutierrez
                                                Pepe Mena
                                                Pepe Garcia */

    }
}
