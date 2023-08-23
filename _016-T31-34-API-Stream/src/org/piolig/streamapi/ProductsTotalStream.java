package org.piolig.streamapi;

import org.piolig.streamapi.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductsTotalStream {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Melon",1, 20));
        products.add(new Product("Abocado", 2, 30.5));
        products.add(new Product("Tomatoes", 4, 10));
        products.add(new Product("Potatoes", 30, 1));


        double grandTotal = products.stream()
                .mapToDouble(product -> product.getAmount() * product.getPrice())
                .reduce(0, Double::sum);

        System.out.println("Total price: " + grandTotal);

    }
}
