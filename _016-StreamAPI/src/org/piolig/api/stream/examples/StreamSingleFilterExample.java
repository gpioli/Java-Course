package org.piolig.api.stream.examples;

import org.piolig.api.stream.examples.models.User;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSingleFilterExample {
    public static void main(String[] args) {

        // First way of creating a Stream (using interfaces)
        Stream<User> names = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe García")
                .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                .peek(System.out::println) // all users are printed, because when we invoke getId == 6, all the stream
                // is scraped looking for id # 6
                .filter(u -> u.getId().equals(6))
                .peek(System.out::println); // Pepe Mena

        //names.forEach(System.out::println);

        // How could we save the results of a stream? Using collect:
        Optional<User> user = names.findFirst();
        //System.out.println(user.orElse(new User("John", "Doe")));;
        //System.out.println(user.orElseGet(() -> new User("John", "Doe")));
        if(user.isPresent()) {
            System.out.println(user.get().getName());
        } else {
            System.out.println("User not found");
        }

    }
}
