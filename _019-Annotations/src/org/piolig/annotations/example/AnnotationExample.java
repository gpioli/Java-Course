package org.piolig.annotations.example;

import org.piolig.annotations.example.models.Product;
import org.piolig.annotations.example.processor.JsonSerializer;

import java.time.LocalDate;

public class AnnotationExample {
    public static void main(String[] args) {
        Product p = new Product();
        p.setDate(LocalDate.now());
        p.setName("table made of OAK");
        p.setPrice(1000L);

        System.out.println("json = " + JsonSerializer.convertJson(p));


    }
}
