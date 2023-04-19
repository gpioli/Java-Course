package com.gpioli.invoiceapp;

import com.gpioli.invoiceapp.model.*;


import java.util.Scanner;

public class InvoiceExample {
    public static void main(String[] args) {

        Client client = new Client();
        client.setNif("555-5");
        client.setName("Gaston");

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the invoice description: ");
        Invoice invoice = new Invoice(s.nextLine(), client);

        Product product;

        System.out.println();
        for (int i = 0; i < 2; i++) {
            product = new Product();
            System.out.println("Enter product n° " + product.getCode() + ": ");
            product.setName(s.nextLine());

            System.out.println("Enter product price: ");
            product.setPrice(s.nextFloat());

            System.out.println("Enter product amount: ");

            invoice.addInvoiceItem(new InvoiceItem(s.nextInt(), product));

            System.out.println();
            s.nextLine(); //We move the cursor to the next iteration
        }

        System.out.println(invoice);

    }
}
