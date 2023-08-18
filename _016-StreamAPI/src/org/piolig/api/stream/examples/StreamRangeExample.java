package org.piolig.api.stream.examples;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamRangeExample {
    public static void main(String[] args) {

        IntStream num = IntStream
                .range(5, 20)
                .distinct();


        //Integer finalResult = num.reduce(0, Integer::sum); // 180
        // int result = num.sum(); // 180
        IntSummaryStatistics stats = num.summaryStatistics();
        System.out.println("max: " + stats.getMax());
        System.out.println("min: " + stats.getMin());
        System.out.println("sum: " + stats.getSum());
        System.out.println("mean: " + stats.getAverage());
        System.out.println("total elements: " + stats.getCount());

        /* max: 19
            min: 5
            sum: 180
            mean: 12.0
            total elements: 15 */


    }
}
