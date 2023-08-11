package org.piolig.api.stream.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        // First way of creating a Stream (using interfaces)
            Stream<String> names = Stream.of("Pato", "Paco", "Pepa", "Pepe");
        names.forEach(System.out::println);

        // Second way of creating a Stream (using an array)
        String[] arr = {"Pato", "Paco", "Pepa", "Pepe"};
        Stream<String> names2 = Arrays.stream(arr);
        names2.forEach(System.out::println);

        // Third way of creating a Stream (using Stream builder)
        Stream<String> names3 = Stream.<String>builder()
                .add("Pato")
                .add("Paco")
                .add("Pepa")
                .add("Pepe")
                .build();

        names3.forEach(System.out::println);


        // Third way of creating a Stream -> from a Collection
        List<String> list = new ArrayList<>();
        list.add("Pato");
        list.add("Paco");
        list.add("Pepe");
        list.add("Pepa");

        Stream<String> names4 = list.stream();

        // It's not necessary to create the variable Stream, we can directly use it:
        list.stream().forEach(System.out::println);

    }
}
