package com.gpioli.invoiceapp.model;

import java.util.Date;

public class Invoice {

    private int id;
    private String description;
    private Date date;
    private Client client;
    private InvoiceItem[] items;
    private int itemsIndex;
    public static final int MAX_ITEMS = 12;
    private static int lastId;

    public Invoice(String description, Client client) {
        this.description = description;
        this.client = client;
        this.items = new InvoiceItem[MAX_ITEMS];
        this.id = ++lastId;
        this.date = new Date();
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public InvoiceItem[] getItems() {
        return items;
    }

    public void addInvoiceItem(InvoiceItem item){
        if(itemsIndex < MAX_ITEMS){
            this.items[itemsIndex++] = item;
        }

    }

}
