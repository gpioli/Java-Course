package org.piolig.streamapi;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayFlattenningStream {
    public static void main(String[] args) {

        String[][] languages = {
                {"java", "groovy"},
                {"php"},
                {"c#", "python", "groovy"},
                {"java", "javascript", "kotlin"},
                {"javascript"},
                {}
        };


        // return Arrays.stream(arr)
        List<String> flattenedLanguages = Arrays.stream(languages)
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        flattenedLanguages.forEach(System.out::println);


        // Another way:

        String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};

        Function<String[][], List<String>> flatten = arr ->  Arrays.stream(arr).flatMap(a -> Arrays.stream(a))
                .distinct()
                .collect(Collectors.toList());

        flatten.apply(lenguajes).forEach(e -> System.out.println(e));

    }

}
