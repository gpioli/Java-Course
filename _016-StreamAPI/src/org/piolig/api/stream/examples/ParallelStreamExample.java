package org.piolig.api.stream.examples;

import org.piolig.api.stream.examples.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class ParallelStreamExample {
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

        long t1 = System.currentTimeMillis();
        String result = list.stream()
                .parallel()
                .map(u -> u.toString().toUpperCase())
                .peek(n -> {
                    System.out.println("Name of the thread: " + Thread.currentThread() + " - " + n);
                })
                .flatMap(name -> {
                    try {
                        TimeUnit.SECONDS.sleep(1); // we simulate a delay
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (name.contains("bruce".toUpperCase())){
                        return Stream.of(name);
                    }
                    return Stream.empty();
                })
                .findAny().orElse("");

        long t2 = System.currentTimeMillis();
        System.out.println("Total time:" + (t2 - t1));
        System.out.println(result);




    }

}
