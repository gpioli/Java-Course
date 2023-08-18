package org.piolig.api.stream.examples;

import org.piolig.api.stream.examples.models.User;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDistinctUserSumExample {
    public static void main(String[] args) {

        IntStream namesLen = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe García", "Pato Guzman", "Pato Guzman")
                .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                .distinct()
                .mapToInt(u -> u.toString().length());

        // this is a final operator, so in order to use the ones underneath, we comment it
        // namesLen.forEach(System.out::println);

        /*
        *   11
            13
            14
            9
            11
        * */

        IntSummaryStatistics stats = namesLen.summaryStatistics();
        System.out.println("total len: " + stats.getSum());
        System.out.println("total len: " + stats.getMax());
        System.out.println("total len: " + stats.getMin());
        System.out.println("total len: " + stats.getAverage());

        /* total len: 58
            total len: 14
            total len: 9
            total len: 11.6
*/


    }
}
