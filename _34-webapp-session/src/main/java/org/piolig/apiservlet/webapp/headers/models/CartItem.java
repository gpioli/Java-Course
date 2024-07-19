package org.piolig.apiservlet.webapp.headers.models;

import java.util.Objects;

public class CartItem {

    private int quantity;
    private Product product;


    public CartItem(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getTotal() {
        return quantity * product.getPrice();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        CartItem cartItem = (CartItem) object;
        return Objects.equals(product.getId(), cartItem.product.getId())
                && Objects.equals(product.getName(), cartItem.product.getName());
    }

}
