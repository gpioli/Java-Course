package org.piolig;

import org.piolig.interace.PersonalizedLambdaTask;

import java.util.function.Function;

public class StringStripper {
    public static void main(String[] args) {

        //Example using Function Interface
        Function<String, String> stringStrip = a -> a.trim()
                .replace(",", "")
                .replace(".", "")
                .toUpperCase();

        String result = stringStrip.apply("4440302.hjk,mario.pereira");

        System.out.println(result);


        // Example with own FunctionalInterface development
        PersonalizedLambdaTask cleaningLambda = a -> {
            return a.trim().replace(",", "").replace(".", "").toUpperCase();
        };

        String result2 = cleaningLambda.stringClean("AzH.martinWascow,85");
        System.out.println(result2);

    }

}
