package org.piolig.examples.set;

import java.util.HashSet;
import java.util.Set;

public class SetExampleAdd {
    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();
        hs.add("one");
        hs.add("two");
        hs.add("three");
        hs.add("four");
        hs.add("five");
        System.out.println(hs);

        boolean b = hs.add("three");
        System.out.println("Duplicate elements allowed? " + b);
        System.out.println(hs);



    }
}
