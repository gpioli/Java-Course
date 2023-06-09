package org.piolig.pooabstractclasses;

import org.piolig.pooabstractclasses.impl.*;
import org.piolig.pooabstractclasses.model.Mammal;

import java.util.Arrays;

public class MammalsExample {

    public static void main(String[] args) {

        Mammal[] mammals = {new Lion("African plains", 80d, 180d, 190d,
                "Panthera Leo", 10d, 80, 8, 80d),
                new Tiger("Asia", 0.5d, 2.8d, 300d, "Panthera tigris",
                        12d, 65, "Panthera tigris"),
                new Cheetah("African Plains", 0.5d, 1.5d, 72d,
                        "Acinonyx jubatus", 8d, 130),
                new Wolf("North America", 80d, 1.5d, 80d, "Canis lupus",
                        "Grey", 7d, 12, "Grey Wolf"),
                new Dog("All around the world", 0.4d, 1d, 50d,
                        "Canis lupus familiaris", 3d, 30, 30)
        };

        // eat
        System.out.println("\nMammals eating: ");
        for (Mammal mammal : mammals) {
            System.out.println(mammal.eat());
        }

        // sleep
        System.out.println("\nMammals sleeping: ");
        Arrays.stream(mammals).forEach(mammal -> {
            System.out.println(mammal.eat());
        });

        // run
        System.out.println("\nMammals running: ");
        Arrays.stream(mammals).forEach(mammal -> {
            System.out.println(mammal.run());
        });

        // communicate
        System.out.println("\nMammals comunicating: ");
        Arrays.stream(mammals).forEach(mammal -> System.out.println(mammal.communicate()));


    }


}

