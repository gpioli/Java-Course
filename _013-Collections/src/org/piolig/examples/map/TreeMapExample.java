package org.piolig.examples.map;

import java.util.*;

public class TreeMapExample {

    public static void main(String[] args) {

        // if we want to alter the natural order of the ordering in the Tree Set
        Map<String, Object> person = new TreeMap<>((a,b) -> b.compareTo(a));
        // This does the same
        //Map<String, Object> person = new TreeMap<>(Comparator.reverseOrder());
        person.put("name", "John");
        person.put("lastName", "Doe");
        person.put("email", "john.doe@email.com");
        person.put("age", 30);

        Map<String, String> address = new HashMap<>();
        address.put("country", "USA");
        address.put("state", "California");
        address.put("city", "Santa Barbara");
        address.put("street", "One Street");
        address.put("number", "120");

        person.put("address", address);

        // Notice data is ordered
        System.out.println(person);


    }

}
