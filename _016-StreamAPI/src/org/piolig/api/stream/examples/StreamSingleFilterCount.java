package org.piolig.api.stream.examples;

import org.piolig.api.stream.examples.models.User;

import java.util.stream.Stream;

public class StreamSingleFilterCount {
    public static void main(String[] args) {

        long count = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe García")
                .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                .count();

        System.out.println(count);   // 5

    }
}
