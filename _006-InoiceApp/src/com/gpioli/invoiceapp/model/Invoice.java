package com.gpioli.invoiceapp.model;

import java.text.SimpleDateFormat;
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

    public float calculateTotal(){
        float total = 0.0f;
        for (int i = 0; i < itemsIndex; i++) {
            InvoiceItem item = this.items[i];
            total += item.calculateItemTotal();
        }
        return total;
    }

    public String generateDetail() {
        StringBuilder sb = new StringBuilder("Invoice N°: ");
        sb.append(this.id)
                .append("\nClient: ")
                .append(this.client.getName())
                .append("\t NIF: ")
                .append(this.client.getNif())
                .append("\nDescription: ")
                .append(this.description)
                .append("\n");

        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        sb.append("Date of issue: ")
                .append(df.format(this.date))
                .append("\n")
                .append("\n#\tName\t$\tCant.\tTotal\n");

        for (int i = 0; i < itemsIndex; i++) {
            InvoiceItem item = this.items[i];

            sb.append(item.toString())
                    .append("\n");
        }

        sb.append("Invoice TOTAL: ")
                .append(calculateTotal());

        return sb.toString();
    }

    @Override
    public String toString() {
        return generateDetail();
    }
}
