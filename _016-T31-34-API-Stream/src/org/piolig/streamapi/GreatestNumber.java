package org.piolig.streamapi;
import java.util.Arrays;
import java.util.function.Function;

public class GreatestNumber {
    public static void main(String[] args) {

        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = (int)(Math.random() * 10 * Math.random() * Math.random() * 10);
        }

        int max = Arrays.stream(array).peek(System.out::println).summaryStatistics().getMax();

        System.out.println("Max number: " + max);



        // Another way

        Integer[] array2 = new Integer[10];

        for (int i = 0; i < 10; i++) {
            array2[i] = (int)(Math.random() * 10 * Math.random() * Math.random() * 10);
        }

        Function<Integer[], Integer> lambdaMax = arr -> Arrays.stream(arr)
                .reduce(0, (a,b) -> a > b ? a : b);


        Integer max2 = lambdaMax.apply(array2);
        System.out.println("Max number2: " + max2);


    }

}
