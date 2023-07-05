package org.piolig.generics.interfaces;

import java.util.List;

public interface ISupermarketBag <T> {

    // Get products lists all products inside the element (in this case, a supermarket bag, but it could be a shopping
    // cart)
    List<T> getProducts();

    // Method for adding products to the element
    void addProduct(T element);

}
