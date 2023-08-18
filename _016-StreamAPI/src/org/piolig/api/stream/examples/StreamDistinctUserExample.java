package org.piolig.api.stream.examples;

import org.piolig.api.stream.examples.models.User;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamDistinctUserExample {
    public static void main(String[] args) {

        Stream<User> names = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe García", "Pato Guzman", "Pato Guzman")
                .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                .distinct();

        names.forEach(System.out::println);

        /*
        *   Pato Guzman
            Paco Gonzalez
            Pepa Gutierrez
            Pepe Mena
            Pepe García
            Pato Guzman
            Pato Guzman
        * */

    }
}
