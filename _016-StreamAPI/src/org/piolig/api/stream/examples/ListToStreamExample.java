package org.piolig.api.stream.examples;

import org.piolig.api.stream.examples.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ListToStreamExample {
    public static void main(String[] args) {

        List<User> list = new ArrayList<>();
        list.add(new User("Andres", "Guzman"));
        list.add(new User("Luci", "Martinez"));
        list.add(new User("Pepe", "Fernandez"));
        list.add(new User("Cata", "Perez"));
        list.add(new User("Lalo", "Mena"));
        list.add(new User("Eladio", "Pichirilo"));
        list.add(new User("Bruce", "Lee"));
        list.add(new User("Bruce", "Willis"));

        Stream<String> names = list.stream().map(u -> u.getName().toUpperCase().concat(u.getLastName().toUpperCase()))
                .flatMap(name -> {
                    if (name.contains("bruce".toUpperCase())){
                        return Stream.of(name);
                    }
                    return Stream.empty();
                })
                .map(String::toLowerCase)
                .peek(System.out::println);

        System.out.println(names.count());


    }

}
