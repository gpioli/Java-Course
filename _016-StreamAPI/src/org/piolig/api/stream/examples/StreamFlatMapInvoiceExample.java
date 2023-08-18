package org.piolig.api.stream.examples;

import org.piolig.api.stream.examples.models.Invoice;
import org.piolig.api.stream.examples.models.User;

import java.util.Arrays;
import java.util.List;

public class StreamFlatMapInvoiceExample {
    public static void main(String[] args) {

        User u1 = new User("John", "Doe");
        User u2 = new User("Pepe", "Papadopolus");

        u1.addInvoice(new Invoice("Tech related purchase"));
        u1.addInvoice(new Invoice("Furniture related purchase"));

        u2.addInvoice(new Invoice("Bicycle purchase"));
        u2.addInvoice(new Invoice("Notebook purchase"));

        List<User> users = Arrays.asList(u1, u2);


        // Traditional way:
        for (User u: users) {
            for (Invoice invoice: u.getInvoices()){
                System.out.println(invoice.getDescription());
            }
        }

        System.out.println("---------------------");

        // Using API Stream
        users.stream().flatMap(u -> u.getInvoices().stream())
                .forEach(invoice ->  System.out.println(invoice.getDescription()
                        .concat(" - client: ")
                        .concat(invoice.getUser().toString())));

    }
}
