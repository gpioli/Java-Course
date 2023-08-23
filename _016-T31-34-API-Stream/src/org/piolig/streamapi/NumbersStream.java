package org.piolig.streamapi;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class NumbersStream {
    public static void main(String[] args) {

        AtomicInteger counter = new AtomicInteger();

        Double s = Stream.generate(counter::incrementAndGet).limit(100)
                .flatMap((number) -> {
                    if (!((number % 10) == 0)){
                       return Stream.of(number);
                    } else return Stream.empty();
                })
                .mapToDouble((number) -> {return number;})
                .map((number) -> number/2)
                .reduce(0, Double::sum); // .reduce(0, (a,b)-> a+b)

        System.out.println("Result : " + s);



        // Another solution:

        int[] arreglo = new int[100];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i+1;
        }

        double total = Arrays.stream(arreglo)
                .filter(e -> e % 10 != 0)
                .mapToDouble(e -> (double) e / 2)
                .reduce(0, (ac, e) -> ac + e);

        System.out.println("Second result: " + total); // 2250.0
    }
}
