package org.piolig.apiservlet.webapp.headers.service;

import org.piolig.apiservlet.webapp.headers.models.Product;

import java.util.Arrays;
import java.util.List;

public class ProductServiceImpl implements ProducService {

    @Override
    public List<Product> list() {
        return Arrays.asList(new Product(1L, "notebook", "IT", 175000),
                new Product(2L, "desktop", "office", 100000),
                new Product(3L, "mechanical keyboard", "IT", 40000));
    }
}
