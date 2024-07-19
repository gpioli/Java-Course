package org.piolig.apiservlet.webapp.headers.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Cart {

    private List<CartItem> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addItem(CartItem cartItem) {
        if (items.contains(cartItem)) {
            Optional<CartItem> optionalCartItem = items.stream()
                    .filter(i -> i.equals(cartItem))
                    .findAny();
            if (optionalCartItem.isPresent()) {
                CartItem i = optionalCartItem.get();
                i.setQuantity(i.getQuantity() + 1);
            }
        } else {
            this.items.add(cartItem);
        }
    }

    public List<CartItem> getItems() {
        return items;
    }

    public int getTotal() {
        //         return items.stream().mapToInt(i -> i.getTotal()).sum();
        return items.stream().mapToInt(CartItem::getTotal).sum();
    }
}
