package org.piolig.examples.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        Set<String> ts = new TreeSet<>();

        ts.add("one");
        ts.add("two");
        ts.add("three");
        ts.add("three");
        ts.add("four");
        ts.add("five");

        System.out.println("ts = " + ts);
        // this gets printed ordered (alphabetically), and no duplicate entries are allowed
        // ts = [five, four, one, three, two]

        Set<Integer> numbers = new TreeSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("numbers = " + numbers);
        // numbers = [1, 2, 3, 4, 5]


        // We can only add elemnts that implement Comparatos interface

        // And we can chance the order using it:

        Set<String> inverseTs = new TreeSet<>((a, b) -> {
          return b.compareTo(a);
        });

        inverseTs.add("one");
        inverseTs.add("two");
        inverseTs.add("three");
        inverseTs.add("three");
        inverseTs.add("four");
        inverseTs.add("five");

        System.out.println("inverseTs = " + inverseTs);
        //inverseTs = [two, three, one, four, five]

        Set<Integer> inverseNumbers = new TreeSet<>(Comparator.reverseOrder());
        inverseNumbers.add(1);
        inverseNumbers.add(2);
        inverseNumbers.add(3);
        inverseNumbers.add(4);
        inverseNumbers.add(5);

        System.out.println("inverseNumbers = " + inverseNumbers);

    }
}
