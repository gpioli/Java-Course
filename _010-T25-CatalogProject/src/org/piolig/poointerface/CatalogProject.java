package org.piolig.poointerface;

import org.piolig.poointerface.model.*;

import java.text.SimpleDateFormat;
import java.util.Date;


public class CatalogProject {
    public static void main(String[] args) {

        IProduct[] products = new Product[7];
        products[0] = new LcdTV(750, "Sony", 40);
        products[1] = new IPhone(1200, "Apple", "Red", "14");
        products[2] = new LcdTV(900, "LG", 50);
        products[3] = new Book(15, new Date(), "Michael Lening", "Lalita", "From the Stars");
        products[4] = new Comics(10, new Date(), "Peter Systane", "The life of Pi",
                "Three brothers", "Peter Pi");
        products[5] = new IPhone(800, "Apple", "White", "12");
        products[6] = new Book(35, new Date(), "Peter Gosling", "Lala", "Sun and Sea");

        int counter = 0;

        for (IProduct product: products) {
            System.out.println("\n------------------------------------------------------");
            System.out.println("Product N°: " + counter++);
            System.out.println("Type of product: " + product.getClass().getName());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Final price: " + product.getSellPrice());

            // For electronic products:
            if (product instanceof IElectronic) {
                System.out.println("Manufacturer: " + ((IElectronic) product).getManufacturer());

                //IPhone:
                if (product instanceof IPhone) {
                    System.out.println("Model: " + ((IPhone) product).getModel());
                    System.out.println("Color: " + ((IPhone) product).getColor());
                }

                // LCD tv:
                if (product instanceof LcdTV) {
                    System.out.println("Screen size (inches): " + ((LcdTV) product).getInches());

                }
            }

            // For Books:
            if (product instanceof IBook) {
                System.out.println("Author: " + ((IBook) product).getTitle());
                System.out.println("Editorial: " + ((IBook) product).getEditorial());
                System.out.println("Publication date: " + ((IBook) product).getPublicationDate());

                if (product instanceof Comics) {
                    System.out.println("Main character: " + ((Comics) product).getCharacter());
                }

            }

            System.out.println("---------------------------X--------------------------");

        }

    }
}

