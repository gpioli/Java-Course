package org.piolig.api.stream.examples;

import org.piolig.api.stream.examples.models.User;

import java.util.stream.Stream;

public class StreamSingleFilterAnyMatch {
    public static void main(String[] args) {

        boolean exists = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe García")
                .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                .anyMatch(u -> u.getId().equals(3));

        System.out.println(exists);   // Pepe Garcia

    }
}
