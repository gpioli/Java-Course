package com.gpioli.invoiceapp;

import com.gpioli.invoiceapp.model.Client;
import com.gpioli.invoiceapp.model.Invoice;
import com.gpioli.invoiceapp.model.InvoiceItem;
import com.gpioli.invoiceapp.model.Product;

import java.util.Scanner;

public class InvoiceExample {
    public static void main(String[] args) {

        Client client = new Client();
        client.setNif("555-5");
        client.setName("Gaston");

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the invoice description: ");
        String desc = s.nextLine();
        Invoice invoice = new Invoice(desc, client);

        Product product;
        String name;
        float price;
        int amount;

        System.out.println();
        for (int i = 0; i<5; i++) {
            product = new Product();
            System.out.println("Enter product n° " + product.getCode() + ": ");
            name = s.nextLine();
            product.setName(name);

            System.out.println("Enter product price: ");
            price = s.nextFloat();
            product.setPrice(price);

            System.out.println("Enter product amount: ");
            amount = s.nextInt();

            InvoiceItem invoiceItem = new InvoiceItem(amount, product);
            invoice.addInvoiceItem(invoiceItem);

            System.out.println();
            s.nextLine(); //We move the cursor to the next iteration
        }

        System.out.println(invoice.generateDetail());

    }
}
