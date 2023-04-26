package org.piolicompany.example;

import org.piolicompany.model.*;

public class Example {

    public static void main(String[] args) {

        Dairy milk = new Dairy("Conaprole milk", 25d, 2, 20);
        Dairy cheese = new Dairy("Conaprole cheese", 100d, 3, 40);

        Fruit banana = new Fruit("banana", 10d, 100d, "yellow");
        Fruit apples = new Fruit("apples", 12d, 80d, "red");

        Cleaning cleaner1 = new Cleaning("Magic Cleaner", 250d,
                "Component A, Component B", 1d);

        Cleaning cleaner2 = new Cleaning("Clothes soap", 500d,
                "Component X, Component Y", 3d);

        NonPerishable tuna = new NonPerishable("Tuna in a can", 150d, 200, 350);
        NonPerishable noodles = new NonPerishable("Adria noodles", 80d, 500, 400);


        Product[] products = {
                milk, cheese, banana, apples, cleaner1, cleaner2, tuna, noodles
        };

        for (Product product: products) {
            System.out.println(product);
        }

    }

}
