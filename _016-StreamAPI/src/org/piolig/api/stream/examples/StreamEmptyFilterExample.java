package org.piolig.api.stream.examples;

import org.piolig.api.stream.examples.models.User;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamEmptyFilterExample {
    public static void main(String[] args) {

        // First way of creating a Stream (using interfaces)
        long count = Stream
                .of("Pato Guzman", "Paco Gonzalez", "", "Pepe Mena",
                        "")
                .filter(String::isEmpty)
                .peek(System.out::println)
                .count();

        System.out.println("count = " + count);


    }
}
