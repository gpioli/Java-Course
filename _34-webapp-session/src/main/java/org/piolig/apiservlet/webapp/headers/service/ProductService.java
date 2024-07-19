package org.piolig.apiservlet.webapp.headers.service;

import org.piolig.apiservlet.webapp.headers.models.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> list();
    Optional<Product> findById(Long id);

}
