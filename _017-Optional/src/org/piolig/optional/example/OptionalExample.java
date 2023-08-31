package org.piolig.optional.example;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        
        String name = "Gaston";

        Optional<String> opt = Optional.of(name);

        System.out.println("opt = " + opt); // opt = Optional[Gaston]
        System.out.println(opt.isPresent()); // true

        if(opt.isPresent()){
            System.out.println("Hi " + opt.get());
        }

        opt.ifPresent(value -> System.out.println("Hi " + value));

        name = null;

        // opt = Optional.of(name); // This will throw an exception. Option.of is only used when we are 100%
        // sure that the object is not null

        opt = Optional.ofNullable(name);
        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent());



        // Another example
        Optional<String> optEmpty = Optional.empty();
        System.out.println("optEmpty = " + optEmpty);
        System.out.println(optEmpty.isPresent());

    }
}
