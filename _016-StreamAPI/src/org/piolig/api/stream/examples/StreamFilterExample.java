package org.piolig.api.stream.examples;

import org.piolig.api.stream.examples.models.User;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterExample {
    public static void main(String[] args) {

        // First way of creating a Stream (using interfaces)
        Stream<User> names = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe García")
                .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                .filter(u -> u.getName().equals("Pepe"))
                .peek(System.out::println);

        //names.forEach(System.out::println);

        // How could we save the results of a stream? Using collect:
        List<User> list = names.collect(Collectors.toList());
        list.forEach(System.out::println);

    }
}
