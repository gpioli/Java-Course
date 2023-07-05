package org.piolig.generics.impl;

import org.piolig.generics.interfaces.ISupermarketBag;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SupermarketBag<T> implements ISupermarketBag <T> , Iterable <T> {

    private final int MAX_PRODUCTS = 5;
    private int productsIndex;
    private List<T> products;

    public SupermarketBag() {
        products = new ArrayList<>();
    }


    @Override
    public List<T> getProducts() {
        return this.products;
    }

    @Override
    public void addProduct(T element) {
        if (products.size() < MAX_PRODUCTS){
            this.products.add(element);
        } else {
            System.out.println("Bag has already the maximum number of elements allowed.");
            throw new RuntimeException("No more elements allowed in the bag");
        }

    }

    @Override
    public Iterator iterator() {
        return this.products.iterator();
    }

}
