package org.piolig.examples.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExampleFindDuplicate {
    public static void main(String[] args) {


        String[] fishes = {"Corvina", "Lenguado", "Pejerrey", "Robalo", "Atun", "Lenguado"};

        Set<String> unique = new HashSet<>();

        for (String fish : fishes) {
            if(!unique.add(fish)) {
                System.out.println("Duplicate element: " + fish);
            }
        }

        System.out.println(unique.size() + " unique elements: " + unique);

    }


}
