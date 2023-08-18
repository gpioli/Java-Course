package org.piolig.api.stream.examples;

import org.piolig.api.stream.examples.models.User;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamSingleFilterExample2 {
    public static void main(String[] args) {

        User user = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe García")
                .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                .filter(u -> u.getId().equals(5))
                .findFirst().orElseGet(() -> new User("John", "Doe"));

        System.out.println(user);   // Pepe Garcia

    }
}
