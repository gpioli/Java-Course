package org.piolig.examples.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<String, Object> person = new HashMap<>();
        person.put(null, "1234");
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

        System.out.println("person = " + person);

        String name = (String) person.get("name");
        System.out.println("name:" + name);
        String lastName = (String) person.get("lastName");
        System.out.println("lastName:" + lastName);

        Map<String, String> personAddress = (Map<String, String>) person.get("address");
        String country = personAddress.get("country");
        String city = personAddress.get("city");
        String neighborhood = personAddress.getOrDefault("neighborhood", "The beach");
        System.out.println("Country of" + name + " is: " + country);
        System.out.println("City of" + name + " is: " + city);
        System.out.println("Neighborhood of" + name + " is: " + neighborhood);

        String lastNameValue = (String) person.remove("lastName");
        boolean b = person.remove(null, "1234");
        System.out.println("b = " + b);

        boolean b2 = person.containsKey("email");
        System.out.println("b2 = " + b2);

        boolean b3 = person.containsValue("30");
        System.out.println("b3 = " + b3);

        System.out.println("\nIterating through all values: ");
        Collection<Object> values = person.values();
        for (Object value: values
             ) {
            System.out.println(value);
        }

        System.out.println("\nIterating through all keys: ");
        Set<String> keys = person.keySet();
        for (String key: keys) {
            System.out.println(key);
        }


        System.out.println("==== entrySet  ====");
        for(Map.Entry<String, Object> pair: person.entrySet()){
            Object value = pair.getValue();
            if (value instanceof Map) {
                String personName = (String) person.get("name");
                Map<String, String> mapAddress = (Map<String, String>) value;
                for(Map.Entry<String, String> addressPair: mapAddress.entrySet()){
                    System.out.println(addressPair.getKey() + "=> " + addressPair.getValue());
                }
            } else {
                System.out.println(pair.getKey() + " => " + pair.getValue());
            }


        }


        System.out.println("==== keySet ====");
        for(String key: person.keySet()) {
            Object value = person.get(key);
            if (value instanceof Map){
                String personName = (String) person.get("name");
                Map<String, String> mapAddress = (Map<String, String>) value;
                System.out.println("Country of " + personName + " is: " + mapAddress.get("country"));
                System.out.println("State of " + personName + " is: " + mapAddress.get("state"));
                System.out.println("City of " + personName + " is: " + mapAddress.get("city"));
            } else {
                System.out.println(key + " => " + value);
            }

        }

        System.out.println("==== Java 8 forEach ====");
        person.forEach((key, value) -> {
            System.out.println(key + " => " + value);
        });


        System.out.println("\n total: " + person.size());
        System.out.println("\n Is empty? : " + person.isEmpty());


    }

}
