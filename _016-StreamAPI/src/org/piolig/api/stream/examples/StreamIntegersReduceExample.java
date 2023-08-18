package org.piolig.api.stream.examples;

import java.util.stream.Stream;

public class StreamIntegersReduceExample {
    public static void main(String[] args) {

        Stream<Integer> names = Stream
                .of(5, 10, 15, 20)
                .distinct();

        Integer integerSum = names.reduce(0, Integer::sum);
        System.out.println(integerSum); // prints 50

    }
}
