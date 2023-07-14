package org.piolig.examples.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExampleFindDuplicate2 {
    public static void main(String[] args) {


        String[] fishes = {"Corvina", "Lenguado", "Pejerrey", "Robalo", "Atun", "Lenguado"};

        Set<String> unique = new HashSet<>();
        Set<String> duplicate = new HashSet<>();

        for (String fish : fishes) {
            if (!unique.add(fish)) {
                duplicate.add(fish);
            }
        }
        unique.removeAll(duplicate);

        System.out.println(unique.size() + " unique elements: " + unique);
        System.out.println(duplicate.size() + " duplicate elements: " + duplicate);

    }


}
