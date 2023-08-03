package org.piolig.java8.lambda;

import org.piolig.java8.lambda.models.User;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerExample {
    public static void main(String[] args) {


        Consumer<Date> consumer = date -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(date));
        };

        consumer.accept(new Date());


        BiConsumer<String, Integer> biConsumer = (name, age) -> {
            System.out.println(name + " has " + age + " years.");
        };

        // this is the same lambda function, but simplified
        BiConsumer<String, Integer> biConsumer2 = (name, age) -> System.out.println(name + " has " + age + " years.");

        biConsumer.accept("pepe", 20);


        Consumer<String> consumer2 = System.out::println;

        consumer2.accept("Hello world lambda");

        List<String> names = Arrays.asList("andres", "pepe", "luz", "paco");
        names.forEach(consumer2);

        Supplier<User> createUser = User::new;
        User user = createUser.get();

        BiConsumer<User, String> assignName = User::setName;


        assignName.accept(user, "Andres");
        System.out.println("User name: " + user.getName());


        Supplier<String> supplier = () -> "Hello world lambda supplier";

    }
}

