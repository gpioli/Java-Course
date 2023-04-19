package com.gpioli.invoiceapp.model;

public class InvoiceItem {

    private int amount;
    private Product product;

    public InvoiceItem(int amount, Product product) {
        this.amount = amount;
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public float calculateItemTotal(){
        return this.amount * this.product.getPrice();
    }

    @Override
    public String toString() {
        return product.toString() +
                "\t" + amount +
                "\t" + calculateItemTotal();
    }
}
